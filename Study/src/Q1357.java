import java.util.Scanner;

public class Q1357 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] inputs = input.split(" ");

		Integer result1 = 0;
		for (String item : inputs) {

			String revItem = reverse(item);
			result1 += Integer.parseInt(revItem);
		}

		String revResult1 = reverse(result1+"");
		Integer result = Integer.parseInt(revResult1);

		System.out.println(result);

	}

	private static String reverse(String item) {

		String output = new String();
		for (int i = item.length()-1; i > -1; i--) {

			output += item.charAt(i);
		}

		return output;
	}
}
