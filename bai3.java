import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap lan luot cac gia tri a,b,c:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        double dt=b*b -4*a*c;
        if (dt<0)
            System.out.println("Phuong trinh vo nghiem");
        else
            if (dt>0)
            {
                double x1=(-b+Math.sqrt(dt))/(2*a);
                double x2=(-b-Math.sqrt(dt))/(2*a);
                System.out.println("Phuong trinh co hai nghiem phan biet : x1= "+x1+ " va x2="+x2);

            }
            else
            {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep la : x="+x);
            }
    }
}
