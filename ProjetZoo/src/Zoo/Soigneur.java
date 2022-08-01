package Zoo;

public class Soigneur {

	protected String prenom;
	protected String nom;
	protected int id;
	protected int salaire;
	protected String spec;
	
	public Soigneur(String prenom, String nom, int id, int salaire) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.id = id;
		this.salaire = salaire;
		
	}
	
	public void Special(String spec)	{
		System.out.println("Le soigneur "+ prenom +" "+nom+" est specialiste en "+spec);
	}

	@Override
	public String toString() {
		return prenom + " " + nom + " d'identifacation " + id + "a un salaire de " + salaire + " $";
	}
	
	
	
}
