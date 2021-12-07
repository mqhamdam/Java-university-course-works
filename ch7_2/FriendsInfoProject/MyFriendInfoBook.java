import java.util.Scanner;
/**
 * MyFriendInfoBook
 */
public class MyFriendInfoBook {
    public static void main(String[] args) {
        
    
        FriendInfoHandler _handler = new FriendInfoHandler();
        
        Scanner _scanner = new Scanner(System.in);
        
        while(true) {
        
        System.out.println("***메뉴 선택");
        System.out.println("1. 고교 정보 저장");
        System.out.println("2. 대학 친구 저장");
        System.out.println("3. 전체 정보 출력");
        System.out.println("4. 기본 정보 출력");
        System.out.println("5. 프로그램 종료");
        System.out.print("선택 >>  ");
        int choice = _scanner.nextInt();
        
        switch (choice) {
            case 1:case 2:
                _handler.addFriend(choice);
                break;
            case 3:
            _handler.showAllData();
                break;
            case 4:
            _handler.showAllSimpleData();
                break;
            case 5:
            System.out.println("프로그램을 종료합니다 .... bye :)");
            return;
            default:
            System.out.println("입력 빠르게 입력 해 주세요 .. ");
                break;
            }
        }
    }
}