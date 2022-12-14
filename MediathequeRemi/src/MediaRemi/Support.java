package MediaRemi;



public class Support {
    private String Auteur;
    private String Titre;
    private String Reference;

    public Support() {
        Auteur = Utils.scanString("Quelle est l'auteur ?");
        Titre = Utils.scanString("Quelle est le titre ?");
        Reference = Utils.scanString("Quelle est la référence ?");
    }

    @Override
    public String toString() {
        return "Support [Auteur=" + Auteur + ", Reference=" + Reference + ", Titre=" + Titre + "]";
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String auteur) {
        Auteur = auteur;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

}
