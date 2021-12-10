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
    public void draw() {
        name = "Sub";
        super.name = "Super";
        super.draw();
        System.out.println(name);
    }

    public static void main(String[] args) {
       
        SuperObject b = new SubObject();
        b.paint();
    }
}
