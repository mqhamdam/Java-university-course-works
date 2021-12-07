import java.util.Vector;

/**
 * VectorEx
 */
public class VectorEx {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(1);

        v.add(2,100);

        System.out.println("Number of elements in vector: " + v.size());
        System.out.println("Capacity/volume of vector: " + v.capacity());

        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            System.out.println(n);
        }

        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            int n = v.elementAt(i);
            sum  += n;
        }
        System.out.println("Count of integers in Vector : " + sum);
    }
}