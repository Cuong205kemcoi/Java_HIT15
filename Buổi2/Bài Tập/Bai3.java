import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[5];
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<5;i++){
            int index=0;
            for(int j=0;j<4-i;j++){
                if(a[j]>a[j+1]){
                    index=a[j];
                    a[j]=a[j+1];
                    a[j+1]=index;
                }
            }
        }
        System.out.print(a[3]);
        System.out.print(a[4]);
    }
}
