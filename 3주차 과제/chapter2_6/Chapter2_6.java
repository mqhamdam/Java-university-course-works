import java.util.Scanner;

public class Chapter2_6 {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		System.out.println("돈의 액수를 입력하세요>>");
		int _cash = scanner.nextInt();

		int _50k = 0, _10k = 0, _1k = 0, _500 = 0, _100 = 0, _10 = 0, _1 = 0;

		while (_cash != 0) {
			if (_cash >= 50000) {
				_50k += 1;
				_cash -= 50000;
			} else if (_cash >= 10000) {
				_10k += 1;
				_cash -= 10000;
			} else if (_cash >= 1000) {
				_1k += 1;
				_cash -= 1000;
			} else if (_cash >= 500) {
				_500 += 1;
				_cash -= 500;
			} else if (_cash >= 100) {
				_100 += 1;
				_cash -= 100;
			} else if (_cash >= 10) {
				_10 += 1;
				_cash -= 10;
			} else {
				_1 = _cash;
				_cash = 0;
			}
		}

		System.out.println("오만원 \t" + _50k + "매");
		System.out.println("만원 \t" + _10k + "매");
		System.out.println("천원 \t" + _1k + "매");
		System.out.println("오백원 \t" + _500 + "매");

		System.out.println("백원 \t" + _100 + "매");
		// System.out.println("오십원 " + _50 + "매");
		System.out.println("십원 \t" + _10 + "매");
		System.out.println("1원 \t" + _1 + "매");

		scanner.close();
	}

}
