package MediaRemi;



public class DVD extends Multimedia {
    private String Bonus;

    public DVD() {
        super();
        Bonus = Utils.scanString("Quel est le bonus ?");
    }

    @Override
    public String toString() {
        return super.toString() + " - Dvd [Bonus=" + Bonus + "]";
    }

    public String getBonus() {
        return Bonus;
    }

    public void setBonus(String bonus) {
        Bonus = bonus;
    }

}
