import java.util.Scanner;

interface StackInterface {
    int length();

    String pop();

    boolean push(String ob);
}

class StringStack implements StackInterface {
    String[] stack = new String[5];
    private int count = 0;

    public int length() {
        return count + 1;
    }

    public String pop() {
        return stack[--count];
    }

    public boolean push(String ob) {
        if (count == 5) {
            return false;
        } else {
            stack[count] = ob;
            count++;
            return true;
        }
    }
}

public class StackManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringStack s = new StringStack();

        System.out.print(">> ");
        for (int i = 0; i < 5; i++) {
            s.push(sc.next());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(s.pop() + " ");
        }
    }
}