package Zoo;

public class Oiseaux extends Espece {


	
	
	public Oiseaux(String nom,String espece,int id) {
		super(nom, espece, id);
		
	}
	public Oiseaux(String nom,int id) {
		super(nom, "Oiseaux", id);
		
	}

	@Override
	public String toString() {
		return "espece=" + espece + ", nom=" + nom + ", id=" + id ;
	}
	
	


	
	

	
	

	
	




	

	
	
	
}
