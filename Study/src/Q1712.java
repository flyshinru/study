import java.util.Scanner;

public class Q1712 {
	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String[] inputs = input.split(" ");

		Integer firstCost = Integer.parseInt(inputs[0]);
		Integer cost = Integer.parseInt(inputs[1]);
		Integer price = Integer.parseInt(inputs[2]);

		Integer margin = price - cost;
		if (margin <= 0) {

			System.out.println(-1);
		}
		else {


			Integer count = firstCost / margin;
			if (firstCost % margin == 0) {

				count++;
			}
			System.out.println(count);
		}
	}
}
