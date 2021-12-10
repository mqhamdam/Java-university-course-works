import java.util.Scanner;

public class HomeWorkScanner3 {
    public static void main(String[] args) throws Exception {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type value for x: ");
        x = scanner.nextInt();
        y = x * x - 3 * x + 7;
        System.out.println("x=" + x + ", y=" + y);
        scanner.close();

    }

}
