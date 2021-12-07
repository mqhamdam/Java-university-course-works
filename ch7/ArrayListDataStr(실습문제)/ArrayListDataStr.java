//(문) 이곳에 ArrayList 클래스가 있는 패키지를 import하시오.
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
   
// (문) list1에 6개 정수, 5  4  2  0  1  3  순으로 저장하시오.
    list1.add("5");
    list1.add("4");
    list1.add("2");
    list1.add("0");
    list1.add("1");
    list1.add("3");


// (문)  list1에서 1~3번째 내용(정수)를 빼내서(4 2 0),  ArrayList list2를 만들어 넣으시오.
// (힌트) API문서에서 sublist(), conatinsAll(), retainAll()확인후 적당한 메소드 사용!
list2.addAll(list1.subList(1, 4));

  print(list1,list2);  // list1과 list2의 내용을 출력

//(문)   list1과 list2를 정렬하시오.
Collections.sort(list1);
Collections.sort(list2);

  
//(문)  정렬된 list1과 list2의 내용을 출력하시오. (위에서 정의한 print()메소드 활용.)

    print(list1, list2);

System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2) ); // 모두 포함하고있나?  bool
 
 list2.add("B");
 list2.add("C");

//(문)  0,2,4,B,C 에서 3번째에다가 A를 끼워 넣기. 
// (힌트) API문서에서 삽입에 대한 add() 메소드 확인하시오.
list2.add(3, "A");

 print(list1,list2);


//(문)  list2에서 "A"를 "AA"로 변경하기
// (힌트) API문서에서 명시된(해당) 인덱스에 있는 요소 내용을 변경하는 메소드를 찾아서 수행하시오.
int index = list2.indexOf("A");
list2.set(index, "AA");

print(list1,list2);
 
//(문)  list1에서  list2와 겹치는 부분만 남기고 나머지는 모두 삭제한 후 list1 내용 출력
// (힌트) API문서에서 sublist(), conatinsAll(), retainAll()확인후 적당한 메소드 사용! 

    list1.retainAll(list2);

 print(list1, list2);
 
 //(문)  list2에서  list1에 포함된 객체들을 모두 삭제한 후 출력
// (힌트) API문서에서 get(), remove(), contains() 메소드 확인후 사용!
    for (String element : list1) {
        list2.removeIf(e -> (e.equals(element)));
    }
    print(list1, list2);
   }
  }

