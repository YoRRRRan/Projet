package Zoo;



public class Menu {


	String question = "Que voulez créer ?\n(1)Un mammifère ?\n(2)Un oiseau ?\n(3)Un reptile ?\n(4)Un soigneur ?\n(5)Ou rien ?"; 

	Integer userChoice = Scan.scanInteger(question);
		
	public void affMenu()	{
		while (userChoice != 0) {

		switch (userChoice) {
		
		case 1:
			s = new Oiseaux();
			break;
		case 2:
			s.add(new Mammi());
			break;
		case 3:
			s.add(new Reptile());
			break;
		case 4:
			s.add(new Multimedia());
			break;
		}
	}
}


}
