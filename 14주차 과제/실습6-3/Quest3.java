public class Quest3 {
    
    public static void main(String[] args) {
        int r[] = new int[3];
        while(true) {
            for(int i = 0; i<3; i++) {
                r[i] = (int)(Math.random()*3+1);
                System.out.print(r[i]+ "\t");
            }
            System.out.println();
            if(r[0] == r[1] && r[1] == r[2]){
                System.out.println("Success!");
                break;
            }
        }
    }
}
