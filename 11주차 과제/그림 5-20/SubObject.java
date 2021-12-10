class SuperObject {
    protected String name;

    public void paint() {
        draw();
    }

    public void draw() {
        System.out.println("Super Object");
    }
}

public class SubObject extends SuperObject {
    public void draw(){
        System.out.println("Sub Object");
    }
    public static void main(String[] args) {
        SuperObject a = new SuperObject();
        a.draw();
        SuperObject b = new SubObject();
        b.paint();
    }
}
