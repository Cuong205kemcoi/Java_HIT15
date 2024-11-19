import java.util.Scanner;
public class Student extends Person {
    protected int id;
    protected String nameClass;
    protected float gpa;
    protected final float criteria =2.0f;
    protected Student(){}

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

    public java.lang.String getNameClass() {
        return nameClass;
    }

    public void setNameClass(java.lang.String nameClass) {
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

    Scanner sc= new Scanner(System.in);
    public void input(){
        System.out.println("Mã sinh vien :");
        id=sc.nextInt();
        nameClass=sc.nextLine();
        gpa=sc.nextFloat();
    }
    public void output(){
        System.out.printf("|%-25d|%-25s|%-5f|",id,nameClass,gpa);
    }
    public boolean checkFall(){
        return gpa<criteria;
    }
}
