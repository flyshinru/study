import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2477 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int count = Integer.parseInt(input);

		List<Integer> inputList = new ArrayList<>();
		for(int i = 0; i < 6; i++) {

			Integer integer = Integer.parseInt(in.nextLine().split(" ")[1]);
			inputList.add(integer);
		}
		// 計算
		int big = inputList.get(0) * inputList.get(1);
		int small = inputList.get(3) * inputList.get(4);
		int reuslt = (big - small) * count;
		System.out.println(reuslt);
	}
}
