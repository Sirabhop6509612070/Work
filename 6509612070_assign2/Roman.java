package core;

//สิรภพ สมเชย
//6509612070
import java.util.Scanner;

public class Roman {

	public static void main(String[] args) {
		String r = Roman.input();
		Roman.checkRoman(r);
	}

	public static String input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the roman number:");
		String roman = scan.nextLine();
		scan.close();
		return roman;
	}

	public static void checkRoman(String roman) {
		switch (roman) {
		case "I":
			System.out.println("It is One");
			break;
		case "II":
			System.out.println("It is Two");
			break;
		case "III":
			System.out.println("It is Three");
			break;
		case "IV":
			System.out.println("It is Four");
			break;
		case "V":
			System.out.println("It is Five");
			break;
		case "VI":
			System.out.println("It is Six");
			break;
		default:
			System.out.println("Unknown Number");
			break;
		}

	}

}
