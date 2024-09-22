import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Nhap diem trung binh :");
        double dtb= new Scanner(System.in).nextDouble();
        if (dtb<0)
            System.out.println("Ban da nhap sai");
        else
            if(dtb>=8.5)
                System.out.println("Gioi");
            else
                if (dtb>=6.5)
                    System.out.println("Kha");
                else
                    if (dtb>=4)
                        System.out.println("Trung binh");
                    else
                        System.out.println("Yeu");
    }
}
