import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q9093 {
	public static void main(String[] args) {



		Scanner in = new Scanner(System.in);


		Integer max = in.nextInt();
		in.nextLine();
		for (int i = 0; i < max; i++) {

			String input = in.nextLine();
			String[] inputs = input.split(" ");
			List<String> inputList = new ArrayList<>();
			for (String aa : inputs) {
				inputList.add(aa);
			}

			String result = new String();
			for (String aa : inputList) {

				for (int j = aa.length(); j > 0; j--) {

					result += aa.charAt(j-1);
				}

				result += " ";
			}
			result = result.substring(0, result.length()-1);
			System.out.println(result);
		}

	}
}
