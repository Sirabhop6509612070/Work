package core;

//สิรภพ สมเชย
//6509612070
import java.util.Scanner;

public class PhoneBill {

	public static void main(String[] args) {
		double m;
		String minute;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter minutes(Q = Quit):");
			minute = scan.nextLine();
			if (!(minute.equals("Q"))) {
				m = Double.parseDouble(minute);
				PhoneBill.calculate(m);
			}
		} while (!(minute.equals("Q")));
		scan.close();

	}

	public static void calculate(double m) {
		double minute, bill;
		minute = m;
		if (minute >= 60) {
			minute=Math.ceil(minute);
			bill = minute * 1.5;
		} 
		else if (minute >= 10) {
			minute=Math.ceil(minute);
			if (minute <= 20) {
				bill = minute * 3;
			} else {
				bill = (20 * 3) + (minute - 20);
			}
		} 
		else if (minute >= 0) {
			minute=Math.ceil(minute);
			bill = minute * 3.5;
		} else {
			bill = 0;
		}
		System.out.printf("You have to pay %.01f%n", bill);
	}

}
