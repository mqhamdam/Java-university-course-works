import java.util.Scanner;

public class Chapter2_4 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.println("점 (x,y)의 좌표를 입력하세요:");
        x = scanner.nextInt();
        y = scanner.nextInt();

        if ((x < 50 && y < 50) || (x > 100 && y > 100)) {
            System.out.println("점(" + x + "," + y + ")은 (50, 50)과 (100, 100)의 사각형 \"외에\" 있습니다.");
        } else {
            System.out.println("점(" + x + "," + y + ")은 (50, 50)과 (100, 100)의 사각형 \"내에\" 있습니다.");
        }
        scanner.close();
    }

}
