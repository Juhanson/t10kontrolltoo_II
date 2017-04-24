package genes;

public class Gene {
	Allele allele1;
	Allele allele2;
	boolean results;
	
	boolean geneValue() { // both false -> false, at least one true > true
		if(allele1.a_value == false && allele2.a_value == false){
			return results == false;
		}
		else {
			return results == true;
		}
	}
}