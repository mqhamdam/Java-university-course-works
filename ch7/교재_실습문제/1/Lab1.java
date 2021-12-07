import java.util.Scanner; //import scanner class
import java.util.Vector; //import vector class

/**
 * Lab1
 */
public class Lab1 {

    public static void main(String[] args) {
        Vector<Float> _vector = new Vector<Float>(); // init vector

        // Read Inputs
        _vector = _scannInputToVectorFloat();

        // Print maximum value
        System.out.println("Algorythm: The maximum value of Vector<Float>  is : " + _getMax(_vector));
    }

    // SCANN INPUT FLOAT
    public static Vector<Float> _scannInputToVectorFloat() {
        Scanner _scanner = new Scanner(System.in);
        Vector<Float> _vector = new Vector<Float>();
        float _max = 0;
        for (int i = 0; i < 5; i++) {
            float _scannedFloat = _scanner.nextFloat();
            _vector.add(_scannedFloat);
            if (_max < _scannedFloat) {
                _max = _scannedFloat;
            }
            System.out.print(_scannedFloat + " ");
        }
        System.out.println();
        System.out.println("The maximum value of Vector<Float> is : " + _max);
        _scanner.close();
        return _vector;
    }

    // GET MAX VALUE OF VECTOR<FLOAT>
    public static float _getMax(Vector<Float> vector) {
        float max = 0;
        for (int i = 0; i < vector.size() - 1; i++) {
            if (vector.get(i) > vector.get(i + 1)) {
                max = vector.get(i);
            }
        }
        return max;
    }
}