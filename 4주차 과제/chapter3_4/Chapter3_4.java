import java.util.Scanner;

public class Chapter3_4 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		char[] day = { '일', '월', '화', '수', '목', '금', '토' };

		while (true) {
			System.out.print("정수를 입력하세요 >> ");
			try {
				int Num = sc.nextInt();
				if (Num < 0) {
					System.out.print("프로그램을 종료합니다...");
					break;
				}
				System.out.println(day[Num % day.length]);
			} catch (Exception e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				sc.nextLine();
			}
		}

		sc.close();
	}
}
