import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= sc.nextInt();
        Student[] s = new Student[n];
        if (n <= 0 || n > 100) {
            System.out.print("Enter number: ");
            n = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Nhập Thông Tin Sinh Viên Thứ "+(i+1));
            System.out.print("Mã Sinh Viên :");
            String CodeStudent= sc.next();
            sc.nextLine();
            System.out.print("Họ Tên Sinh Viên :");
            String fullName = sc.nextLine();
            System.out.print("Tuổi ");
            byte age = sc.nextByte();
            sc.nextLine();
            System.out.print("Giới tính :");
            String gender = sc.next();
            System.out.print("SDT :");
            String phoneNumber = sc.next();
            System.out.print("Email :");
            String email = sc.next();
            s[i]=new Student(CodeStudent,fullName,age,gender,phoneNumber,email);
        }
        for(int i=0;i<n;i++){
            s[i].display();
        }
    }
}
