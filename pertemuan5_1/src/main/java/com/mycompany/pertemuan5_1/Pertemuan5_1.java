/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5_1;
import java.util.Scanner;

/**
 *
 * @author nasozu
 */
public class Pertemuan5_1 {

    public static void main(String[] args) {
       Scanner myInput = new Scanner(System.in);
    
         System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
         System.out.println("Nama Karyawan:");
         String name = myInput.nextLine();
         System.out.println("Alamat:");
         String address = myInput.nextLine();
         System.out.println("Usia:");
         int age = myInput.nextInt();
         System.out.println("Gaji:");
         double salary = myInput.nextDouble();
         
         // Output input by user
         System.out.println("---------------");
         System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
        System.out.println(" Nama : " + name);
        System.out.println(" Alamat : " + address);
        System.out.println("Usia: " + age + "Tahun");
        System.out.println("Gaji: Rp " + salary);
    }
            
}
