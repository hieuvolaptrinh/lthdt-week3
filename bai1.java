import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("Nhap vao mot so:");
        int n = new Scanner(System.in).nextInt();
        if(n<0)
            System.out.println(n+" la so am");
        else
        if(n>0)
            System.out.println(n+" la so duong");
        else
            System.out.println("So vua nhap la so khong");
    }
}
