//สิรภพ สมเชย
//6509612070
package homework;
import java.util.Scanner;

public class BallTest {

	public static void main(String[] args) {
		double r;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the radius of the ball>");
		r=scanner.nextDouble();
		Ball ball = new Ball();
		ball.setRadius(r);
		System.out.printf("The ball radius '%.2f' has surface area = %.3f%n",ball.getRadius(),ball.getSurface());
		System.out.printf("The ball radius '%.2f' has volume = %.3f",ball.getRadius(),ball.getVolume());
		scanner.close();

	}

}
