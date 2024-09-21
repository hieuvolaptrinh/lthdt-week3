package java_tuan3_baitap;

import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập 2 số a và b:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        sc.nextLine();
        System.out.println("Chọn phép toán (cộng: +, trừ: -, nhân: *, chia: /):");
        char pt = sc.nextLine().charAt(0); // tránh lỗi vì khi mà mình khai báo char mà next là nó lấy chuỗi nên sẽ bị lỗi
        float result = 0;
        if (pt == '+') {
            result = a + b;
        } else if (pt == '-') {
            result = a - b;
        } else if (pt == '*') {
            result = a * b;
        } else if (pt == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Không thể chia cho 0.");
            }
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
        System.out.println("kết quả phép tính "+pt+ " là : "+ result);

    }

}
