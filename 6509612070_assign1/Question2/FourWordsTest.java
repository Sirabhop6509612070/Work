//สิรภพ สมเชย
//6509612070
package homework;
import java.util.Scanner;

public class FourWordsTest {

	public static void main(String[] args) {
		/*FourWords words4 = new FourWords();
		words4.add("cash");
		words4.add("apple");
		words4.add("trees");
		words4.add("bee");
		words4.add("something");
		words4.printWords();*/
		FourWords words4 = new FourWords();
		int round=1;
		Scanner scanner = new Scanner(System.in);
		words4.printWords();
		do {
		System.out.printf("Enter your word:");
		String word=scanner.nextLine();
		words4.add(word);
		System.out.printf("Round: %d: ",round);
		words4.printWords();
		round++;
		}
		while(round<=5);
		scanner.close();

	}

}
