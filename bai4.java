import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ba so nguyen a, b, c:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int tg;
        if(a<b)
            tg=a;
        else
            tg=b;
        if (tg<c)
            System.out.println("So nho nhat la: "+tg);
        else
            System.out.println("So nho nhat la :"+c);
    }
}
