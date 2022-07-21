import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q14716 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int m = Integer.parseInt(input.split(" ")[0]);
		int n = Integer.parseInt(input.split(" ")[1]);

		boolean[][] checkMap = new boolean[m][n];
		String[][] map = new String[m][n];

		for (int i = 0; i < m; i++) {

			String checkTarget = in.nextLine();
			String[] width = checkTarget.split(" ");
			map[i] = width;
		}

		List<String> checkPointList = new ArrayList<>();

		int result = 0;
		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				checkPointList.add(i + " " + j);
			}
		}

		int changeCount = 0;
		boolean resultUpFlg = true;
		for (int i = 0; i < checkPointList.size(); i++) {

			if (changeCount + 1 == i) {

				resultUpFlg = true;
			}
			String checkPoint = checkPointList.get(i);
			int chkM = Integer.parseInt(checkPoint.split(" ")[0]);
			if (chkM < 0) {

				continue;
			}
			int chkN = Integer.parseInt(checkPoint.split(" ")[1]);
			if (chkN < 0) {

				continue;
			}

			if (checkMap[chkM][chkN]) {

				continue;
			}
			if ("0".equals(map[chkM][chkN])) {

			}
			else {

				if (resultUpFlg) {

					result++;
					resultUpFlg = false;
					changeCount = i;
				}
				checkPointList.add(i+1, (chkM-1) + " " + (chkN-1));
				checkPointList.add(i+2, (chkM-1) + " " + (chkN));
				checkPointList.add(i+3, (chkM-1) + " " + (chkN+1));
				checkPointList.add(i+4, (chkM) + " " + (chkN-1));
				checkPointList.add(i+5, (chkM) + " " + (chkN+1));
				checkPointList.add(i+6, (chkM+1) + " " + (chkN-1));
				checkPointList.add(i+7, (chkM+1) + " " + (chkN));
				checkPointList.add(i+8, (chkM+1) + " " + (chkN+1));
				changeCount += 8;
			}

			checkMap[chkM][chkN] = true;
		}

		System.out.println(result);
	}
}
