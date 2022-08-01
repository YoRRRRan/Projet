package Zoo;

import java.util.Scanner;

public class Scan {

	public static String scanString(String question) {
		System.out.println(question);
		Scanner scan = new Scanner(System.in);
		String ret = scan.nextLine();
		
		return ret;
	}


	public static Integer scanInteger(String question) {
		System.out.println(question);
		Integer ret;
		try {
			Scanner scan = new Scanner(System.in);
			ret = scan.nextInt();
		} catch (Exception exception) {
			return 0;
		}

		
		return ret;
	}
}
