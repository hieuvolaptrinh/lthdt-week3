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
        float result = 0; // biến lưu kết quả
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

    }// mình có thể sài Switch - case
//     switch (n) {
//         case 1:
//             System.out.println("Phép cộng");
//             System.out.println("Ket qua cua lua chon cua ban la:" + (a + b));
//             break;
//         case 2:
//             System.out.println("Phép trừ");
//             System.out.println("Ket qua cua lua chon cua ban la:" + (a - b));
//             break;
//         case 3:
//             System.out.println("Phép nhân");
//             System.out.println("Ket qua cua lua chon cua ban la:" + (a * b));
//             break;
//         case 4:
//             System.out.println("Phép chia");
//             if(b != 0)
//                 System.out.println("Ket qua cua lua chon cua ban la:" +(a / b));
//             else
//                 System.out.println("Khong the thuc hien phep chia.");
//             break;
//         default:
//             System.out.println("Khong ton tai.");
//             break;

// }
}
