
package java_tuan3_baitap;

import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("vui long nhap so a, b, c ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("so lon nhat la" + a);
        } else {
            if (b > c) {
                System.out.println("so lon nhat la" + b);
            } else {
                System.out.println("so lon nhat la" + c);
            }
        }
    }

}
