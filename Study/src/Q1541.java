import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1541 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String siki = in.next();


		List<Integer> numberList = new ArrayList<>();
		String temp = new String();
		boolean nextMinus = false;
		for (int i = 0; i < siki.length(); i++) {

			char a = siki.charAt(i);
			if ('-' == a) {

				numberList.add(Integer.parseInt(temp));
				temp = new String();
				nextMinus = true;
			}
			else if ('+' == a) {

				numberList.add(Integer.parseInt(temp));
				temp = new String();
				if (nextMinus) {
					a = '-';
					nextMinus = false;
				}
			}

			temp += a;
		}
		numberList.add(Integer.parseInt(temp));

		Integer result = 0;
		for (Integer number : numberList) {

			result += number;
		}

		System.out.println(result);


	}
}
