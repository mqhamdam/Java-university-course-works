public class UnivFriend extends Friend {
    final String major;

    UnivFriend(String name, String phoneNo, String addr, String major) {
        super(name, phoneNo, addr);
        this.major = major;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("학과 : " + major);
    }

    @Override
    void showBasicData() {
        super.showBasicData();

        // System.out.println("학과 : " + major);
    }
}
