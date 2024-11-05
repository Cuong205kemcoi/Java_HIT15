import java.util.Scanner;
public class BaiKT1 {
    private static final String[] dvi = {
            "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"
    };
    private static final String[] muoi = {
            "mười", "mười một", "mười hai", "mười ba",
            "mười bốn", "mười lăm", "mười sáu", "mười bảy",
            "mười tám", "mười chín"
    };
    private static final String[] chuc = {
            "", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi",
            "bảy mươi", "tám mươi", "chín mươi"
    };
    private static final String[] tram = {
            "", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm",
            "sáu trăm", "bảy trăm", "tám trăm", "chín trăm"
    };

    public static String Chuyendoi(int a) {
        if (a < 10) {
            return dvi[a];
        } else if (a < 20) {
            return muoi[a - 10];
        } else if (a < 100) {
            return chuc[a / 10] + (a % 10 != 0 ? " " + dvi[a % 10] : "");
        } else if (a < 1000) {
            return tram[a / 100] +
                    (a % 100 == 0 ? "" : (a % 100 < 10 ? " linh " + dvi[a % 10] :
                            (a % 100 < 20 ? " " + muoi[a % 100 - 10] : " " + chuc[(a % 100) / 10] +
                                    (a % 10 != 0 ? " " + dvi[a % 10] : ""))));
        } else {
            return "Số nằm ngoài phạm vi.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int a = sc.nextInt();
        System.out.println("Số " + a + " được đọc là " + Chuyendoi(a));
    }
}
