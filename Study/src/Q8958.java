import java.util.Scanner;

public class Q8958 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		int result = 0;

		int point = 0;
		for (int i = 0; i < line.length(); i++) {

			char q = line.charAt(i);
			if ('o' == q || 'O' == q) {

				point++;
			}
			else {

				point = 0;
			}
			result += point;
		}

		System.out.println(result);



	}
}
