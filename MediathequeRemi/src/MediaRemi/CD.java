package MediaRemi;



public class CD extends Multimedia {
	
	// Attributes
	
    private int NbPlage;
    
    // Constructor
    
    public CD() {
        super();
        // affiche une question et scanne l'entrée user pour la ranger dans NbPlage
        this.NbPlage = Utils.scanInteger("Combien de plage ?");
    }

    // Retour 
    @Override
    public String toString() {
        return super.toString() + " - CD [NbPlage=" + NbPlage + "]";
    }

    public int getNbPlage() {
        return NbPlage;
    }

    public void setNbPlage(int nbPlage) {
        NbPlage = nbPlage;
    }

}
