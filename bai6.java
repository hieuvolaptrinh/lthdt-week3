import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, kq = 0;
        char kt;
        System.out.print("Nhập phép tính: ");
        kt = sc.next().charAt(0);
        System.out.println("Nhap hai so a va b:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if (kt == '+')
            kq = a + b;
        else
            if (kt == '-')
                kq = a - b;
            else
                if (kt == '*')
                    kq = a * b;
                else
                    if (kt == '/')
                        if (b != 0)
                            kq = a / b;
                        else {
                            System.out.println("Không thể chia cho 0.");
                            return;
                        }
                    else {
                        System.out.println("Phép tính không hợp lệ.");
                        return;
                    }
        System.out.println("Kết quả: " + kq);
    }
}