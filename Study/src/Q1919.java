import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1919 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String a = in.nextLine();

		String b = in.nextLine();

		List<String> okStrList = new ArrayList<>();

		String[] aArray = a.split("");

		String temp = new String(b);
		for (String checkStr : aArray) {

			if (temp.contains(checkStr)) {


				okStrList.add(checkStr);
				int idx = temp.indexOf(checkStr);
				temp = temp.substring(0, idx) + temp.substring(idx+1);
			}
		}

		Integer r = a.length() + b.length() - okStrList.size() - okStrList.size();

		System.out.println(r);
	}
}
