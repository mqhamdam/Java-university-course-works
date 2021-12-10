import java.util.Scanner;

public class Chapter3_2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int[] Numbers = new int[10];

		System.out.print("정수 10개 입력 >> ");
		for (int i = 0; i < 10; i++) {
			Numbers[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (Numbers[i] % 3 == 0) {
				System.out.print(Numbers[i] + " ");
			}
		}

		sc.close();

	}
}
