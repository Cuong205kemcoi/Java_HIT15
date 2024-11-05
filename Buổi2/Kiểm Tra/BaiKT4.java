import java.util.Scanner;
public class BaiKT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Mảng sau khi nhập là :");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("Nhập số lượng truy vấn:");
        int q=sc.nextInt();
        for(int i=0;i<q;i++) {
            System.out.print("L= ");
            int L = sc.nextInt();
            System.out.print("R= ");
            int R = sc.nextInt();
            int S = 0;
            for (int j = L-1; j < R; j++) {
                S += a[j];
            }
            System.out.println("Tổng trên đoạn ["+L+","+R+"] là: "+S);
        }
    }
}
