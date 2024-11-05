import java.util.Scanner;

public class BaiKT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder chuchuoi = new StringBuilder();
        StringBuilder sochuoi = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sochuoi.append(s.charAt(i));
            } else {
                chuchuoi.append(s.charAt(i));
            }
        }

        // In kết quả
        System.out.println("Chuỗi chữ: " + chuchuoi.toString());
        System.out.println("Chuỗi số: " + sochuoi.toString());
    }
}
