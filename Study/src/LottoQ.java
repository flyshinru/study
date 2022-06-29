import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LottoQ {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		String[] inputs = input.split(" ");
		List<String> inputList = Arrays.asList(inputs);

		List<String> list = new ArrayList<>();
		while (list.size() != 6) {

			String random = ((int)(Math.random()*45)+1)+"";
			if (!list.contains(random)) {

				list.add(random+"");
			}
		}

		int hit = 0;
		for (String item : inputList) {

			if (list.contains(item)) {

				hit++;
			}
		}

		int atCount = 0;
		for (String item : inputList) {

			if ("@".equals(item)) {

				atCount++;
			}
		}

		int minHit = hit;
		int maxHit = hit + atCount;

		String bonus = new String();
		while (true) {

			bonus = ((int)(Math.random()*45)+1)+"";
			if (!list.contains(bonus)) {

				break;
			}
		}

		List<Integer> lottoList = new ArrayList<>();
		for (String item : list) {

			Integer temp = Integer.parseInt(item);
			lottoList.add(temp);
		}
		lottoList.sort((n1,n2) -> n1-n2);

		String lotto = new String();
		for (Integer item : lottoList) {

			lotto += item + " ";
		}
		lotto += bonus;

		System.out.println("choice : " + input);
		System.out.println("lotto : " + lotto);

		if (minHit == 5 && inputList.contains(bonus)) {

			System.out.println("min : 2等");
		}
		else {

			int th = 8 - minHit;
			if (th == 2) {
				th = 1;
			}
			if (th < 6) {

				System.out.println("min : " + th);
			}
			else {

				System.out.println("min : out");
			}
		}
		if (maxHit == 5 && inputList.contains(bonus)) {

			System.out.println("max : 2等");
		}
		else {

			int th = 8 - maxHit;
			if (th == 2) {
				th = 1;
			}
			if (th < 6) {

				System.out.println("max : " + th);
			}
			else {

				System.out.println("max : out");
			}
		}
	}
}
