package java_tuan3_baitap;

import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhậpđộ dài cạnh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập độ dài cạnh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập độ dài cạnh c: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba cạnh đã cho tạo thành một tam giác.");

            if (a == b && b == c) {
                System.out.println("tam giác đều");
            } else if (a == b || a == c || b == c) {
                System.out.println("tam giác cân");
            } else if ((Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) || (Math.pow(b, 2) == Math.pow(c, 2) + Math.pow(a, 2)) || (Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2))) {
                System.out.println("tam giác vuông");
            }
        } else {
            System.out.println("3 độ dài này không thể tạo thành một tam giác được.....");
        }
    }
}
