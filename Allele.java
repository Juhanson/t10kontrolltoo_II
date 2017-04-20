//package geenid;

public class Allele{

	String name; //Name of allele, f.x. rhesus
	boolean a_value; //whether the allele is positive+(true) or negative-(false).
	
	public Allele(String name, boolean a_value){
		if(name==null || name.length()==0){
			throw new RuntimeException("Name undefined!");
		}
		this.name=name;
		this.a_value=a_value;
	}
}