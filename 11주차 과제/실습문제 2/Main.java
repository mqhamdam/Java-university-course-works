import java.util.Scanner;

abstract class Calculator {
    protected int a, b;

    abstract protected int calc();

    protected void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type 2 integers >> ");
        a = scanner.nextInt();
        b = scanner.nextInt();
    //    scanner.close();
    }

    public void run() {
        input();
        int res = calc();
        System.out.println("Result >> " + res);
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

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Subtracter sub = new Subtracter();

        adder.run();
        sub.run();
    }
}