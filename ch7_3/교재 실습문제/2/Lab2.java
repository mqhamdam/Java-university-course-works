import java.util.ArrayList;
import java.util.Scanner;

/**
 * Lab2
 */
public class Lab2 {

    public static void main(String[] args) {
      
        ArrayList<Character> _arrayList = new ArrayList<Character>();
        _arrayList = _readInputsToArrayList();
        _letterGradeTo4ScaleGrade(_arrayList);
    }



// Methods  

    public static ArrayList<Character> _readInputsToArrayList() {
        ArrayList<Character> _arrayList = new ArrayList<Character>();
        Scanner _scanner = new Scanner(System.in);

        System.out.println("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F)>> ");

        for (int i = 0; i < 5; i++) {
            String _scannedString = _scanner.next();
            char ch = _scannedString.charAt(0);
            _arrayList.add(ch);
        }

        _scanner.close();
        return _arrayList;
    }

    public static void _letterGradeTo4ScaleGrade(ArrayList<Character> _arrayList) {
        for (Character character : _arrayList) {
            switch (character) {
                case 'A':
                    System.out.print("4.0 ");
                    break;
                case 'B':
                    System.out.print("3.0 ");
                    break;
                case 'C':
                    System.out.print("2.0 ");
                    break;
                case 'D':
                    System.out.print("1.0 ");
                    break;
                case 'F':
                    System.out.print("0.0 ");
                    break;
                default:
                    System.out.print("Undefined : Avaialable characters is: A,B,C,D,F");
                    break;
            }
        }
    }
}