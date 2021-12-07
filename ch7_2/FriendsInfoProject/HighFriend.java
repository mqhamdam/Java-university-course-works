public class HighFriend extends Friend {
        final String work;

        HighFriend(String name, String phoneNo, String addr, String work) {
            super(name, phoneNo, addr);
            this.work = work;
        }

        @Override
        void showData() {
            super.showData();
            System.out.println("직업: " + work);
        }

        @Override
        void showBasicData() {
            super.showBasicData();
            // System.out.println("직업: " + work);
        }
    
}
