public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "shradha";
        s1.roll = 465;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s2.marks[0] = 0;   // test: does this affect s1?

        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i] + " " + s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // default constructor
    Student() {
        marks = new int[3];
    }

    // copy constructor (deep copy)
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}