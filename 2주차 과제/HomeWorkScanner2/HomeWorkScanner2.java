import java.util.Scanner;

public class HomeWorkScanner2 {
    public static void main(String[] args) throws Exception {
        int height = 5;
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 층인지 입력하세요: ");
        a = scanner.nextInt();

        height *= a;
        System.out.println(height + "m 입니다.");
        scanner.close();

    }

}
