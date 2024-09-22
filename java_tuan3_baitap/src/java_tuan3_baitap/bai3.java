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
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        double delta = b*b - 4*a*c;
        if(delta>0)
        {
            double x1 = (-b + Math.sqrt(delta)) / 2*a;
            double x2 = (-b - Math.sqrt(delta)) / 2*a;
            System.out.println("x1 = " +x1);
            System.out.println("x2 = " +x2);
        }
        else 
            if(delta==0)
            {
                double x = -b/2*a;
                System.out.println("x = " +x);
            }
            else 
                System.out.println("Phương trình vô nghiệm");
    }
    
}
