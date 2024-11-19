import java.sql.SQLOutput;
import java.util.Scanner;
public class Person {
    public String name;
    public int age;
    public Address address;
    public Person(){}

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Tên :");
        name=sc.nextLine();
        System.out.print("Tuổi :");
        age=sc.nextInt();
        System.out.print("Thành Phố :");
        String City=sc.nextLine();
        System.out.print("Huyện :");
        String district=sc.nextLine();
        System.out.print("Xã :");
        String commune=sc.nextLine();
        Person person= new Person(name,age,address);
        Address address1= new Address(City,district,commune);
    }
    public void output(){
        System.out.printf("|%-25s|%-5d|%-15s||%-15s||%-15s|",name,age,address.city,address.district,address.commune);
    }
}
