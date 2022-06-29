import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Q4673_1 {
	public static void main(String[] args) {

		long startTime = new Date().getTime();
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <10001; ++i) {

			if (list.contains(i)) {

				continue;
			}

			int number = i;
			while (number < 10001) {

				int temp = number;
				while(temp > 9) {

					number += temp%10;
					temp = temp/10;
				}
				number += temp%10;

				if (number <= 10000 && !list.contains(number)) {

					list.add(number);
				}

			}
		}
		Collections.sort(list);

		for (int i = 1; i < 10001; i++) {

			if (!list.contains(i)) {

				System.out.println(i);
			}
		}
		long endTime = new Date().getTime();
		System.out.println(endTime - startTime + "ms");
	}
}
