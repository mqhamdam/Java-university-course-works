import java.util.Scanner;

public class HomeWorkScanner1 {
    public static void main(String[] args) throws Exception {
        int a, b, sum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수를 입력하세요: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        scanner.close();

    }

}
