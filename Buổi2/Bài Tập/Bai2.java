import java.util.Scanner;
public class Bai2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap n = ");
        int n = sc.nextInt();
        double s=1;
        while(n >0){
            int k=n%10;
            s*=k;
            n/=10;
        }
        System.out.println(s);
    }
}