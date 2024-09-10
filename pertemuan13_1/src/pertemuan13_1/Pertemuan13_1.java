/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan13_1;

/**
 *
 * @author nasozu
 */
public class Pertemuan13_1 {

    /**
     * @param args the command line arguments
     */
    class CalculatorSederhana {
        public int tambah (int a, int b) {
            return a + b;
        }
        public int kurang (int a, int b) {
            return a - b;
        }
        public int kali (int a, int b) {
            return a * b;
        }
        public int bagi (int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("pembagi tidak boleh nol");
            }
            return a / b;
        }
    }
    
    public static void main(String[] args) {
        pertemuan13_1 objekLuar = new pertemuan13_1();
        CalculatorSederhana kalkulator = objekLuar.new CalculatorSederhana();
        
        System.out.println("Hasil pertambahan: " + kalkulator.tambah(20, 10)));
        System.out.println("Hasil pengurangan: " + kalkulator.kurang(20, 10)));
        System.out.println("Hasil perkalian: " + kalkulator.kali(20, 10)));
        System.out.println("Hasil pembagian: " + kalkulator.bagi(20, 10)));
    }
    
}
