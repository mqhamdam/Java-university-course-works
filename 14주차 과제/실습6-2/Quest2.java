import java.util.Scanner;
import java.util.StringTokenizer;

public class Quest2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String s = sc.nextLine();
            if(s.equals("exit")) {
                System.out.println("Exit Program...");
                break;
            }

            StringTokenizer st = new StringTokenizer(s," ");

            
            System.out.println("Word Count is: " + st.countTokens());
        }
        sc.close();
    }
}