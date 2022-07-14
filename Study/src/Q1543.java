import java.util.Scanner;

public class Q1543 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		String search = in.nextLine();

		int result = 0;
		String temp = str;
		while(temp.contains(search)) {

			result++;
			int index = temp.indexOf(search);
			temp = temp.substring(index+search.length());
		}

		System.out.println(result);
	}
}
