/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan10_1;

/**
 *
 * @author nasozu
 */
public class aritmatika3 {
    public int pengurangan(int a, int b) {
        return a - b;
    }
    
    public int perkalian(int a, int b) {
        return a * b;
    }
    
    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("pembagi tidak boleh nol.");
        }
        return (double) a/b;
    }
    
    public double pangkat(int a, int b) {
        return Math.pow(a, b);
    }
}
