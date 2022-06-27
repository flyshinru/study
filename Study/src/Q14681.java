import java.util.Scanner;

public class Q14681 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();

		int result = 0;
		if (0 < x && 0 < y) {

			result = 1;
		}
		else if (x < 0 && 0 < y) {

			result = 2;
		}
		else if (x < 0 && y < 0) {

			result = 3;
		}
		else if (0 < x && y < 0) {

			result = 4;

		}
		System.out.println(result);


	}
}
