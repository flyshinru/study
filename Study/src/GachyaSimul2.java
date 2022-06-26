
public class GachyaSimul2 {
	public static void main(String[] args) {

		// 確率
		double kakuritu = 1.28;

		// 回数
		int count = 200;

		// 試行数
		int kaisuu = 10000;

		if (kakuritu == 0) {

			System.out.println("確率が0なので、終了します。");
			return;
		}
		if (count == 0) {

			System.out.println("回数が0なので、終了します。");
			return;
		}

		// 枚数
		int maisuu = 0;

		int _kaisuu = 0;
		while (_kaisuu != kaisuu) {

			// 引けた枚数
			int _count = 0;
			while (_count != count) {

				double choice = Math.random()*100;
				_count++;
				if (0 <= choice && choice < kakuritu) {

					maisuu++;
				}
			}

			_kaisuu++;
		}
		System.out.println("枚数：" + maisuu);
		System.out.println("平均：" + maisuu/kaisuu);
	}
}
