/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5_2;

import java.util.Scanner;

/**
 *
 * @author nasozu
 */
public class Pertemuan5_2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
    
         System.out.println("Alas");
         double alas = myInput.nextDouble();
         System.out.println("tinggi");
         double tinggi = myInput.nextDouble();
         double luas = (alas*tinggi)/2;
         System.out.println("Luas Segitiga : " + luas);
    }
}
