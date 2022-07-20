import java.util.Scanner;

public class Q9012 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Integer max = in.nextInt();
		in.nextLine();

		for (int j = 0; j < max; j++) {

			String input = in.nextLine();
			String temp = new String(input);
			boolean result = true;
			for (int i = 0; i < temp.length();) {

				char l = temp.charAt(temp.length()-1);
				if ('(' == l) {

					result = false;
					break;
				}

				char c = temp.charAt(i);
				if ('(' == c) {

					int idx = temp.lastIndexOf(')');
					temp = temp.substring(1, idx);
				}
				else {

					result = false;
					break;
				}
			}

			if (result) {

				System.out.println("YES");
			}
			else {

				System.out.println("NO");
			}
		}



	}
}
