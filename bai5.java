import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao ba canh cua tam giac:");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int max=0,max1=1,max2=2;
        int min=0,min1=1,min2=2;
        if (a==b)
            if (a<c) {
                min1 = a;
                min2 = b;
                max = c;
            }
            else {
               max1=a;
               max2=b;
               min=c;
            }
        else
            if (b==c)
                if (b<a) {
                    min1 = c;
                    min2 = b;
                    max = a;
                }
                else {
                    max1=c;
                    max2=b;
                    min=a;
                }
            else
                if (a==c)
                    if (a<b) {
                        min1=a;
                        min2=c;
                        max=b;
                    }
                    else {
                        max1=a;
                        max2=c;
                        min=b;
                    }
                else{
                    if (a<b) {
                        max = b;
                        min1 =a;
                    }
                    else {
                        max =a;
                        min1=b;
                    }
                    int tg=max;
                    if (tg<c) {
                        max=c;
                        min2=tg;
                    }
                    else
                        min2=c;
                }
        if(a+b<c||a+c<b||b+c<a)
            System.out.println("Ba canh nhap vao khong the tao thanh mot tam giac");
        else
        {
            System.out.println("Ba canh nhap vao co the tao thanh mot tam giac");
            if (a==b&&a==c)
                System.out.println("Ba canh nhap vao tao thanh mot tam giac deu");
            else
                if (min1==min2||max1==max2)
                    System.out.println("Ba canh nhap vao tao thanh mot tam giac can ");
                else
                    if (max*max==min1*min1+min2*min2)
                        System.out.println("Ba canh nhap vao tao thanh mot tam giac vuong ");
                    else
                        System.out.println("Ba canh nhap vao tao thanh mot tam giac thuong ");
        }
    }
}
