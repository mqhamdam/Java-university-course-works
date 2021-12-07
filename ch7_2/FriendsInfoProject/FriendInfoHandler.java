import java.util.LinkedList;
import java.util.Scanner;

public class FriendInfoHandler {
   
        private LinkedList<Friend> myFriends = new LinkedList<Friend>();

        private void addFriendInfo(Friend friend) {
            myFriends.add(friend);
        }

        public void addFriend(int choice) {
            String name, phoneNum, addr, job, major;

            Scanner _scanner = new Scanner(System.in);
            System.out.print("이름: ");
            name = _scanner.nextLine();
            System.out.print("전화: ");
            phoneNum = _scanner.nextLine();
            System.out.print("주소: ");
            addr = _scanner.nextLine();

            if (choice == 1) {
                System.out.print("직업 : ");
                job = _scanner.nextLine();
                addFriendInfo(new HighFriend(name, phoneNum, addr, job));
            } else {
                System.out.print("학과: ");
                major = _scanner.nextLine();
                addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
            }
            System.out.println("입력 완료!\n");
            // _scanner.close();
        }

        public void showAllData() {
            _divider();
            System.out.println("Showing all Data\n");
            for (Friend friend : myFriends) {

                friend.showData();
                _divider();

            }
        }

        public void showAllSimpleData() {
            _divider();
            System.out.println("Basic Data\n");
            for (Friend friend : myFriends) {

                friend.showBasicData();
                _divider();

            }
        }

        void _divider() {
            System.out.print("\n* * * * * *\n");
        };
    
}
