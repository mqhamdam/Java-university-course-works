public class Friend {
        final String name;
        final String phoneNo;
        final String addr;

        Friend(String name, String phoneNo, String addr) {
            this.name = name;
            this.phoneNo = phoneNo;
            this.addr = addr;
        }

        // default constr
        Friend() {
            this.name = "";
            this.phoneNo = "";
            this.addr = "";
        }

        void showData() {
            System.out.println("Name : " + name);
            System.out.println("PhoneNumber: " + phoneNo);
            System.out.println("Address: " + addr);
        }

        void showBasicData() {
            System.out.println("Name : " + name);
            System.out.println("PhoneNumber: " + phoneNo);
        }
    
}
