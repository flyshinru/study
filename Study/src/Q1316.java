import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1316 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Integer count = in.nextInt();
		in.nextLine();

		List<String> inputList = new ArrayList<>();
		for (int i = 0; i < count; i++) {

			String input = in.nextLine();
			inputList.add(input);
		}

		int wrongCount = 0;
		for (String input : inputList) {

			List<String> checkList = new ArrayList<>();
			String[] checks = input.split("");
			String check = checks[0];
			checkList.add(check);
			for (String _check : checks) {

				if (!check.equals(_check)) {

					if (!checkList.contains(_check)) {

						checkList.add(_check);
						check = _check;
					}
					else {

						wrongCount++;
						break;
					}
				}
			}
		}

		System.out.println(count-wrongCount);

	}
}
