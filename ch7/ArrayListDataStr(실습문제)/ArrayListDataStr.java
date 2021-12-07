//(��) �̰��� ArrayList Ŭ������ �ִ� ��Ű���� import�Ͻÿ�.
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDataStr {

    static void print(ArrayList<String> list1, ArrayList<String> list2){
      System.out.println("list1 : " + list1);
      System.out.println("list2 : " + list2);
      System.out.println();
  }

   public static void main(String[] args) {

   ArrayList<String> list1 = new ArrayList<String>(10);
   ArrayList<String> list2 = new ArrayList<String>(10);
   
// (��) list1�� 6�� ����, 5  4  2  0  1  3  ������ �����Ͻÿ�.
    list1.add("5");
    list1.add("4");
    list1.add("2");
    list1.add("0");
    list1.add("1");
    list1.add("3");


// (��)  list1���� 1~3��° ����(����)�� ������(4 2 0),  ArrayList list2�� ����� �����ÿ�.
// (��Ʈ) API�������� sublist(), conatinsAll(), retainAll()Ȯ���� ������ �޼ҵ� ���!
list2.addAll(list1.subList(1, 4));

  print(list1,list2);  // list1�� list2�� ������ ���

//(��)   list1�� list2�� �����Ͻÿ�.
Collections.sort(list1);
Collections.sort(list2);

  
//(��)  ���ĵ� list1�� list2�� ������ ����Ͻÿ�. (������ ������ print()�޼ҵ� Ȱ��.)

    print(list1, list2);

System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2) ); // ��� �����ϰ��ֳ�?  bool
 
 list2.add("B");
 list2.add("C");

//(��)  0,2,4,B,C ���� 3��°���ٰ� A�� ���� �ֱ�. 
// (��Ʈ) API�������� ���Կ� ���� add() �޼ҵ� Ȯ���Ͻÿ�.
list2.add(3, "A");

 print(list1,list2);


//(��)  list2���� "A"�� "AA"�� �����ϱ�
// (��Ʈ) API�������� ��õ�(�ش�) �ε����� �ִ� ��� ������ �����ϴ� �޼ҵ带 ã�Ƽ� �����Ͻÿ�.
int index = list2.indexOf("A");
list2.set(index, "AA");

print(list1,list2);
 
//(��)  list1����  list2�� ��ġ�� �κи� ����� �������� ��� ������ �� list1 ���� ���
// (��Ʈ) API�������� sublist(), conatinsAll(), retainAll()Ȯ���� ������ �޼ҵ� ���! 

    list1.retainAll(list2);

 print(list1, list2);
 
 //(��)  list2����  list1�� ���Ե� ��ü���� ��� ������ �� ���
// (��Ʈ) API�������� get(), remove(), contains() �޼ҵ� Ȯ���� ���!
    for (String element : list1) {
        list2.removeIf(e -> (e.equals(element)));
    }
    print(list1, list2);
   }
  }

