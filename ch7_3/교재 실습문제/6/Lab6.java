import java.util.*;

public class Lab6 {
    public static void main(String[] args) {
        Scanner _scanner = new Scanner(System.in);

        HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();

        System.out.println("** 포인트 관리 프로그램입니다 **");

        while (true) {
            System.out.print("이름과 포인터 입력 >> ");
            String name = _scanner.next();
            if (name.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            }
            int point = _scanner.nextInt();

            if (_hashMap.containsKey(name)) {
                _hashMap.put(name, _hashMap.get(name) + point);
            } else {
                _hashMap.put(name, point);
            }
            Set<String> keys = _hashMap.keySet();
            Iterator<String> it = keys.iterator();
            while (it.hasNext()) {
                String key = it.next();
                int value = _hashMap.get(key);
                System.out.print("(" + key + ", " + value + ") ");
            }
            System.out.println();
        }
        _scanner.close();
    }
}
