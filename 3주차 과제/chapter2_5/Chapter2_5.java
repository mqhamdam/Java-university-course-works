import java.util.Scanner;

public class Chapter2_5 {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		System.out.print("논리 연산자를 입력하세요>> ");
		boolean a = scanner.nextBoolean();
		String op = scanner.next();
		boolean b = scanner.nextBoolean();

		boolean res = false; //
		switch (op) {
		case "AND":
			res = a && b;
			break;
		case "OR":
			res = a || b;
			break;
		default:
			System.out.println("입력이 잘 못 되었습니다. 다시 한번 입력해 주시기 바랍니다.");
		}
		System.out.println(res);
		scanner.close();
	}

}
