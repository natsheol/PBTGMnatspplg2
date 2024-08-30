/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10_1;
import java.util.Scanner;

/**
 *
 * @author nasozu
 */
public class Pertemuan10_1 {

    public static void main(String[] args) {
      Scanner myInput = new Scanner(System.in);
      
      aritmatika3 aritmatika = new aritmatika3();
      System.out.print("masukkan bilangan pertama");
      int a = myInput.nextInt();
      
      System.out.print("masukkan bilangan kedua");
      int b = myInput.nextInt();
      
      System.out.print("pengurangan: " + aritmatika.pengurangan(a,b));
      System.out.print("perkalian: " + aritmatika.perkalian(a,b));
      
      try {
          System.out.print("pembagian: " + aritmatika.pembagian(a,b));
      } catch (ArithmeticException e) {
          System.out.print("terjadi kesalahan: " + e.getMessage());
      }
      
      System.out.print("pangkat: " + aritmatika.pangkat(a,b));
    }
}
