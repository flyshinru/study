
public class GachyaSimul {
	public static void main(String[] args) {

		// 確率
		double kakuritu = 1.5;
		// 枚数
		int maisuu = 8;
		// 試行数
		int kaisuu = 10000;

		if (kakuritu == 0) {

			System.out.println("確率が0なので、終了します。");
			return;
		}
		if (maisuu == 0) {

			System.out.println("枚数が0なので、終了します。");
			return;
		}

		// 回数
		int count = 0;

		int _kaisuu = 0;
		while (_kaisuu != kaisuu) {

			// 引けた枚数
			int _maisuu = 0;
			while (_maisuu != maisuu) {

				double choice = Math.random()*100;
				count++;
				if (0 <= choice && choice < kakuritu) {

					_maisuu++;
				}
			}

			_kaisuu++;
		}
		System.out.println("回数：" + count);
		System.out.println("平均：" + count/kaisuu);
	}
}
