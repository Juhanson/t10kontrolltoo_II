package genes;

public class Test1 {
	public static void main(String[] args) {
		Allele rhesus1 = new Allele("rhesus", true);
		Allele rhesus2 = new Allele("rhesus", true);

		Gene first = new Gene();

		first.allele1 = rhesus1;
		first.allele2 = rhesus2;

		System.out.println("The allele is named: " + rhesus1.name + " and the value is: " + rhesus2.a_value);
	}
}


// java -jar target/genes-0.0.1-SNAPSHOT.jar