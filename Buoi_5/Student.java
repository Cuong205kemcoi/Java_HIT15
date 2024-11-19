import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student extends Person {
    protected int id;
    protected String nameClass;
    protected float gpa;
    protected final float criteria = 2.0f;

    public Student() {}

    public Student(int id, String nameClass, float gpa) {
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter class name: ");
        nameClass = sc.nextLine();
        System.out.print("Enter GPA: ");
        gpa = sc.nextFloat();
        super.input();
    }

    public void output() {
        System.out.printf("|%-10d|%-20s|%-5.2f|", getId(), getNameClass(), getGpa());
        super.output();
    }

    public boolean checkFall() {
        return gpa < criteria;
    }
}