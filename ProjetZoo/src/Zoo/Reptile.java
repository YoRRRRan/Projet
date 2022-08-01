package Zoo;

public class Reptile extends Espece {


	
	
	public Reptile(String nom,String espece,int id) {
		super(nom, espece, id);
		
	}
	public Reptile(String nom,int id) {
		super(nom, "Reptile", id);
		
	}

	@Override
	public String toString() {
		return "espece=" + espece + ", nom=" + nom + ", id=" + id;
	}
}
