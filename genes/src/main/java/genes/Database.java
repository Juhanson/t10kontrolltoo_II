package genes; 

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="genes")

public class Database {
	@Id public int id;
	public String alleleName;
	public String XY;
	public String XY2;
	
	@Override
	public String toString() {
		return "gene: "+ alleleName + ", allele 1: " + XY + ", allele2: " +XY2;
	}
}