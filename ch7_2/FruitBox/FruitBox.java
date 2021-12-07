
import java.util.LinkedList;
import java.util.Scanner;

class Fruit {
    int weight;
    Fruit(int weight){
        this.weight = weight;
    }
    public void showYou(){
        System.out.println("난 과일입니다.");
    };
}

class Apple extends Fruit {
    Apple(int weight){
        super(weight);
    }
    public void showYou() {
        super.showYou();
        System.out.println("난 붉은 과일입니다.");
        System.out.println("나의 무계가 : " + String.valueOf(weight));
    };
}

class Orange extends Fruit {
    Orange(int weight){
        super(weight);
    }
    public void showYou() {
        super.showYou();

        System.out.println("난 노란색 과일입니다.");
        System.out.println("나의 무계가 : " + String.valueOf(weight));
    };
}

class FruitBox{
    LinkedList<Fruit> _fruitList = new LinkedList<Fruit>();
    
    void addFruit(Fruit fruit){
        _fruitList.add(fruit);
    }

    Fruit getFruit(){
        
        return  _fruitList.getLast();
    } 
    
    void showAll(){
        if(_fruitList.isEmpty()){
            System.out.println("\nBox is Empty");
        }else{
            for (Fruit fruit : _fruitList) {
                System.out.println("*******");
                fruit.showYou();
                System.out.println();
            }
        }
    }
}

class FruitBoxProgram {
    public static void main(String[] args) {

        Scanner _scanner = new Scanner(System.in);
        FruitBox _appleBox = new FruitBox();
        FruitBox _orangeBox = new FruitBox();

        while(true){
            System.out.println(" o 원하는 번호를 입력하시오");
            System.out.println("1 : 오렌지 상자 내용 전체 보기");
            System.out.println("2 : 사과   상자 내용 전체 보기");
            System.out.println("3 : 오렌지 한개 꺼내기");
            System.out.println("4 : 사과   한개 꺼내기");
            System.out.println("5 : 상자에 과일 넣기");
            System.out.println("0 : 종료");
            System.out.print("선택 >>  ");
            int choice = _scanner.nextInt();
            switch (choice) {
                case 1:
                    _orangeBox.showAll();
                    break;
                case 2:
                    _appleBox.showAll();
                    break;
                case 3:
                    _orangeBox.getFruit();
                    break;
                case 4:
                    _appleBox.getFruit();
                    break;
                case 5:
                    System.out.println("1 : Add Apple");
                    System.out.println("2 : Add Orange");
                    System.out.print(">> ");
                    int type = _scanner.nextInt();
                    if (type == 1) {
                        System.out.println("Enter weight of Fruit");
                        System.out.print(">> ");
                        int weight = _scanner.nextInt();
                        _appleBox.addFruit(new Apple(weight));
                    } else if (type == 2) {
                        System.out.println("Enter weight of Fruit");
                        int weight = _scanner.nextInt();
                        System.out.print(">> ");
                        _orangeBox.addFruit(new Orange(weight));
                    } else {
                        System.out.println("Miss type, try again");
                    }
                    break;
                case 0:
                return;
                default:
                    break;
                   
            }
        }
    }
}
