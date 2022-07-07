import java.util.Scanner;

public class Q2438 {
	public static void main(String[] args) {



		Scanner in = new Scanner(System.in);
		int count = in.nextInt();

		for (int i = 0; i < count; i++) {


			for (int j = 0; j < i+1; j++) {

				System.out.print("*");
			}

			System.out.println();

		}
	}
}
