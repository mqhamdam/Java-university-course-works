import java.util.*;
/**
 * Lab4
 */
public class Lab4 {

    public static void main(String[] args) {

        Vector<Integer> _vInt = new Vector<Integer>();
        _vInt = _readVIntegers();

        _calculateMaxHeight(_vInt);
    }

    // Read Inputs to Vector<Integer>
    private static Vector<Integer> _readVIntegers() {
        Scanner _scanner = new Scanner(System.in);
        

        Vector<Integer> _vInt = new Vector<Integer>();
        System.out.println("2000 ~ 2009년까지 1년 단위로 키 입력");
        for (int i = 0; i < 10; i++) {
            System.out.print("200"+ i +" >> ");
            _vInt.add(_scanner.nextInt());
        }
        _scanner.close();
        return _vInt;
    }
    
    // Find and calculate max heigh growed from years
    private static void _calculateMaxHeight(Vector<Integer> vIntegers) {
        int maxHeigh = 0;
        int maxHeighYear =0;
        
        for (int i = 0; i < 9; i++) {
            if(maxHeigh < (vIntegers.get(i+1) - vIntegers.get(i))){
                maxHeigh = vIntegers.get(i+1) - vIntegers.get(i);
                maxHeighYear = i;
            }
        }
        System.out.println("가장 키가 많이 자란 년도는 200" + maxHeighYear + "년 " + (float) maxHeigh + "cm");
    }
}