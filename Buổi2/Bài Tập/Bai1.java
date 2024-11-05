import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();

        if (base < 2 || base > 16) {
            System.out.println("Cơ số không hợp lệ. Cần từ 2 đến 16.");
            return;
        }

        if (n == 0) {
            System.out.println("0");
            sc.close();
            return;
        }

        String Number = "";
        String digits = "0123456789ABCDEF";

        while (n > 0) {
            Number = digits.charAt(n % base) + Number;
            n /= base;
        }

        System.out.println(Number);
        sc.close();
    }
}
