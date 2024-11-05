import java.util.Scanner;
public class BaiKT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x=: ");
        double x = sc.nextDouble();
        System.out.print("Nhập y : ");
        int y = sc.nextInt();
        double Pow=Math.pow(x,y);
        System.out.print("Kết quả : "+x+"^"+y+" = "+Pow);
    }
}
