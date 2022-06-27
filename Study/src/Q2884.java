import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);

		int hour = in.nextInt();
		int minute = in.nextInt();

		int allMinute = hour * 60 + minute;

		int resultAllMinute = allMinute - 45;
		if (resultAllMinute < 0) {

			resultAllMinute = 24*60 + resultAllMinute;
		}

		int resultHour = resultAllMinute / 60;
		int resultMinute = resultAllMinute % 60;


		System.out.println(resultHour + " " + resultMinute);
	}
}
