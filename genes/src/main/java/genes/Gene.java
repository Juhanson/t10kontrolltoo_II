package genes;
import java.util.Random;

public class Gene {
	private Allele allele1;
	private Allele allele2;
	//boolean results;
	
	public Gene(Allele allele1, Allele allele2){
		this.allele1 = allele1;
		this.allele2 = allele2;
	}
	
	boolean geneValue() { // both false -> false, at least one true > true
		if(allele1.a_value == false && allele2.a_value == false){
			return false;
		} else {
			return true;
		}
	}
	
	Allele genRandomAllele() {
		Random rnd = new Random();
		if (rnd.nextBoolean()){
			return allele1;
		} else {
			return allele2;
		}
	}
}