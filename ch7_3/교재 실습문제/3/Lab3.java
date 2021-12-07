import java.util.*;

// 한글로 안 되어서 영어러 작성했습니다..
public class Lab3 {
    public static void main(String[] args) {
        Scanner _scanner = new Scanner(System.in);
        HashMap<String, Integer> _hashMap = new HashMap<String,Integer>();

        _hashMap.put("Espresso", 2500);
        _hashMap.put("Americano", 2000);
        _hashMap.put("Capuccino", 3000);
        _hashMap.put("Latte", 3500);

        System.out.println("Americano, Espresso, Capuccino, Latte 있습니다.");

        while (true) {
            Set<String> keys = _hashMap.keySet();
            Iterator<String> it = keys.iterator();
            System.out.print("주문 >> ");
            String s = _scanner.next();
            if (s.equals("그만")) {
                break;
            }
            while (it.hasNext()) {
                String key = it.next();
                if (s.equals(key)) {
                    System.out.println(s + "는 " + _hashMap.get(key) + "원 입니다.");
                    break;
                }
            }
        }

        _scanner.close();
    }
}
