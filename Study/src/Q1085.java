import java.util.Scanner;

public class Q1085 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] inputs = input.split(" ");
		int x = Integer.parseInt(inputs[0]);
		int y = Integer.parseInt(inputs[1]);
		int w = Integer.parseInt(inputs[2]);
		int h = Integer.parseInt(inputs[3]);



		int resultX = w-x;
		if (resultX < 0) {

			resultX = -resultX;
		}
		if (x < resultX) {

			resultX = x;
		}



		int resultY = h-y;
		if (resultY < 0) {

			resultY = -resultY;
		}
		if (y < resultY) {

			resultY = y;
		}



		int result = resultY;
		if (resultX < resultY) {

			result = resultX;
		}
		System.out.println(result);
	}
}
