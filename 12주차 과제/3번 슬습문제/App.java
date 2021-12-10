import java.util.Scanner;

abstract class Calculator {
    protected int a, b;

    abstract protected int calc();

    protected void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type two Integers>> ");
        a = scanner.nextInt();
        b = scanner.nextInt();
    }

    public void run() {
        input();
        int res = calc();
        System.out.println("Results is >> " + res);
    }
}

class Adder extends Calculator {
    protected int calc() {
        return a + b;
    }
}

class Subtracter extends Calculator {
    protected int calc() {
        return a - b;
    }
}

public class App {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Subtracter sub = new Subtracter();

        adder.run();
        sub.run();
    }
}