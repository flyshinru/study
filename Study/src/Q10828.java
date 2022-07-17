import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10828 {
	public static void main(String[] args) {

		List<String> queue = new ArrayList<>();

		Scanner in = new Scanner(System.in);

		while(true) {
			String input = in.nextLine();

			String command = input.split(" ")[0];
			// push
			if ("push".equals(command)) {

				queue.add(input.split(" ")[1]);
			}
			// pop
			else if ("pop".equals(command)) {

				if (queue.size() == 0) {

					System.out.println("-1");
				}
				else {

					System.out.println(queue.get(queue.size()-1));
					queue.remove(queue.size()-1);

				}
			}
			// size
			else if ("size".equals(command)) {

				System.out.println(queue.size());
			}
			// empty
			else if ("empty".equals(command)) {

				if (queue.size() == 0) {

					System.out.println("1");
				}
				else {

					System.out.println("0");
				}
			}
			// top
			else if ("top".equals(command)) {

				if (queue.size() == 0) {

					System.out.println("1");
				}
				else {

					System.out.println(queue.get(queue.size()-1));
				}
			}
		}

	}
}
