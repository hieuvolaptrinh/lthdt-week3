/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_tuan3_baitap;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai1 {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Nhập a: ");
           double a = sc.nextInt(); // dao sua kieu du lieu
           if(a==0)
               System.out.println("a bằng 0");
           else
               if(a>=0)
                   System.out.println("a là số dương");
               else
                   System.out.println("a là số âm");
    }
}
