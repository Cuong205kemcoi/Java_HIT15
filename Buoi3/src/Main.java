import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số sv = ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] st =new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhập Thông Tin Sinh Viên Thứ "+(i+1));
            System.out.print("ID = ");
            String ID=sc.nextLine();
            System.out.print("Name = ");
            String Name=sc.nextLine();
            System.out.print("Age = ");
            byte Age=sc.nextByte();
            sc.nextLine();
            System.out.print("gender :");
            String gender=sc.nextLine();
            System.out.print("numP");
            String numP=sc.nextLine();
            System.out.print("email :");
            String email=sc.nextLine();
            st[i]=new Student(ID,Name,Age,gender,numP,email);
        }
        System.out.printf("%-15s|%-25s|%-8s|%-15s|%-15s|%-30s\n","ID","Name","Age","gender","numP","email");
        for(int i=0;i<n;i++){
            st[i].display();
        }
    }
}
