/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan10_2;

/**
 *
 * @author nasozu
 */
public class aritmatika {
    private int bilangan1;
    private int bilangan2;
    
    public aritmatika(int bilangan1, int bilangan2) {
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
    }
    
    public int pengurangan() {
        return bilangan1 - bilangan2;
    }
    
    public int perkalian() {
        return bilangan1 * bilangan2;
    }
    
    public int pembagian() {
        if (bilangan2 != 0) {
            return bilangan1 / bilangan2;
        } else {
            throw new ArithmeticException("pembagi tidak boleh nol.");
        }
    }
    
    public double pangkat(){
        return Math.pow(bilangan1, bilangan2);
    }
}
