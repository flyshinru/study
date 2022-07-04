import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1181 {
	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		Integer max = in.nextInt();
		in.nextLine();


		List<String> inputList = new ArrayList<>();
		for (int i = 0; i < max; i++) {

			String input = in.nextLine();
			if (!inputList.contains(input)) {

				inputList.add(input);
			}

		}

		inputList.sort( (i1, i2) -> {


			if (i1.length() != i2.length()) {

				return i1.length() - i2.length();
			}


			return i1.compareTo(i2);
		});

		for (String input : inputList) {

			System.out.println(input);
		}


	}
}
