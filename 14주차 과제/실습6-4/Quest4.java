import java.util.Scanner;
import java.util.StringTokenizer;

public class Quest4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str_1 = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str_1, "+");

        int sum = 0;
        while (st.hasMoreTokens()) {
            String nextT = st.nextToken();
            String sTrim = nextT.trim();
            sum +=Integer.parseInt(sTrim);
        }
        System.out.println("Sum of nums>> " + sum);
        sc.close();
    }
}
