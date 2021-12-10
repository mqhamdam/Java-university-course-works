import java.util.Scanner;

public class Chapter2_8_switch {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		System.out.print("커피를 주문하세요>>");

		String coffee = scanner.next();
		int quantity = scanner.nextInt();

		switch (coffee) {
		case "에스프레소":
			System.out.println(2000 * quantity + "원입니다.");
			break;
		case "아메리카노":
			System.out.println(2500 * quantity + "원입니다.");
			break;
		case "카푸치노":
			System.out.println(3000 * quantity + "원입니다.");
			break;
		case "카페라떼":
			System.out.println(3500 * quantity + "원입니다.");
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
			break;
		}
		scanner.close();

	}

}
