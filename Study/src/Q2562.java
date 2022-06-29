import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2562 {
	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		while(true) {

			int a = in.nextInt();
			if (a == 0) {

				break;
			}
			list.add(a);
		}

		List<Integer> tempList = new ArrayList<>(list);
		Collections.sort(tempList);

		Integer max = tempList.get(tempList.size()-1);
		System.out.println(max);

		Integer index = list.indexOf(max);
		System.out.println(index+1);
	}
}
