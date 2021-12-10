import java.util.Scanner;

public class Chapter2_10 {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		System.out.print("에스프레소 10잔 이상 주문 시 가격이 5%로 할인 됩니다.\n 커피를 주문하세요>>");

		String coffee = scanner.next();
		int quantity = scanner.nextInt();

		switch (coffee) {
		case "에스프레소":
			int sale = 2000 * quantity;
			if (quantity >= 10)
				sale *= 0.95;
			System.out.println(sale + "원입니다. 에스프레소 10잔 이상 주문하셨으니 5%할인 되었습니다.");
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
