class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}

public class Downcasting {
    public static void main (String []args) {
        Person p = new Student("Lee Je Moon");
        Student s; 
        s = (Student)p;

        System.out.println(s.name);
        s.grade  = "A";
    }

}
