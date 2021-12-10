import java.util.Scanner;

public class Chapter3_1 {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		System.out.print("영어 알파벳 한 문자를 입력하세요>>");
		String s = scanner.next();
		char c = s.charAt(0);

		for (char a = 'a'; a <= c; a++) {
			for (char b = a; b <= c; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		scanner.close();

	}

}
