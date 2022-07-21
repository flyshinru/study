import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q9012 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Integer max = in.nextInt();
		in.nextLine();

		for (int j = 0; j < max; j++) {

			String input = in.nextLine();
			List<String> tempList = new ArrayList<>();
			String[] inputs = input.split("");
			boolean result = true;
			for (String ch : inputs) {

				if ("(".equals(ch)) {

					tempList.add(ch);
				}
				else {

					if (tempList.size() == 0) {

						result = false;
						break;
					}
					else {

						tempList.remove(0);
					}
				}
			}

			if (tempList.size() != 0) {

				result = false;
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
