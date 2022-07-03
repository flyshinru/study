import java.util.Scanner;

public class Q10809 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String abc = "abcdefghijklmnopqrstuvwxyz";
		String[] abcs = abc.split("");

		for (int i = 0; i < abcs.length; i++) {

			int result = input.indexOf(abcs[i]);
			System.out.print(result + " ");
		}
	}
}
