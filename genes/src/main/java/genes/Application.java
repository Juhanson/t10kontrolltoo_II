package genes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication

public class Application {
	
	@Autowired
	private GeneDAO GDAO;
	
	@Autowired
	HttpSession sessioon;
	
	@RequestMapping("/creategene")
	public String childGene(String alleleName, String parentgeneY, String parentgeneY2, String parentgeneX, String parentgeneX2){
		Allele Y = new Allele(alleleName, parentgeneY.equals("true"));
		Allele Y2 = new Allele(alleleName, parentgeneY2.equals("true"));
		Gene newYgene = new Gene(Y, Y2);
		
		Allele X = new Allele(alleleName, parentgeneX.equals("true"));
		Allele X2 = new Allele(alleleName, parentgeneX2.equals("true"));
		Gene newXgene = new Gene(X, X2);
		
		Database saveGene = new Database();
		saveGene.alleleName = alleleName;
		saveGene.XY = String.valueOf(newYgene.genRandomAllele().a_value);
		saveGene.XY2 = String.valueOf(newXgene.genRandomAllele().a_value);
		
		GDAO.save(saveGene);
		return "A gene has been created and saved: " + saveGene.toString();
	}
	
	/*@RequestMapping("/find")
	public String findGene(String findAllele) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (Database gene : GeneDAO.findAll()) {
			if (gene.alleleName.equals(findAllele)) {
				sb.append("<tr><td>").
        		append(gene.id).
        		append("</td><td>").
        		append("<div id = 'alleleNameId'>"+gene.alleleName+"</div>").
        		append("</td><td>").
        		append("<div id = 'alleleXYId"+i+"'>"+gene.XY+"</div>").
        		append("</td><td>").
        		append("<div id = 'alleleXY2Id"+i+"'>"+gene.XY2+"</div>").
        		append("</td><td>").
        		append("<input type='checkbox' id = 'valik"+i+"'/></td>").
        		append("</td></tr>");
        		i++;
			}
		}
		sb.append("<tr><td>Found number of genes: <div id = 'found' >"+(i)+"</div></td></tr>");
		return sb.toString();
	}
	*/
	
	@RequestMapping("/newgene")
	public String newGene() {
		Gene yrhesus = new Gene(
			new Allele("rhesus", false),
			new Allele("rhesus", true)
		);
		
		Gene xrhesus = new Gene(
			new Allele("rhesus", false),
			new Allele("rhesus", true)
		);
		
		Gene zrhesus = new Gene(
			yrhesus.genRandomAllele(),
			xrhesus.genRandomAllele()
		);
		
		return "New gene created: "+zrhesus+" allele1: "+yrhesus.genRandomAllele()+" allele2: "+xrhesus.genRandomAllele();
	}
	
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 4222);
		SpringApplication.run(Application.class, args);
	}
}