package Zoo;

public class Mammi extends Espece {


	
	
	public Mammi(String nom,String espece,int id) {
		super(nom, espece, id);
	
	}
	public Mammi(String nom,int id) {
		super(nom, "Mammifere", id);
		
	}

	@Override
	public String toString() {
		return "espece=" + espece + ", nom=" + nom + ", id=" + id;
	}
	
}
