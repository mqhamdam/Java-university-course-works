import java.util.Scanner;

public class Chapter3_3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");

		try {
			int Num = sc.nextInt();

			if (Num % 2 == 0) {
				System.out.print("짝수이다");
			} else {
				System.out.print("홀수이다");
			}
		} catch (Exception e) {
			System.out.print("수를 입력하지 않아서 프로그램을 종료합니다.");
		}

		sc.close();
	}
}
