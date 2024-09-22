/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm trung bình: ");
        double dtb = sc.nextDouble();
        if(dtb<=10 && dtb>=8)
            System.out.println("Giỏi");
        else
            if(dtb<8 && dtb>=6.5)
                System.out.println("Khá");
            else 
                if(dtb<6.5 && dtb >=5)
                    System.out.println("Trung bình");
                else
                    if(dtb<5)
                    System.out.println("Yếu");
    }
}
