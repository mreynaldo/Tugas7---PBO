/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas7;

/**
 *
 * @author Reynaldo
 */
public class no_1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Deret bilangan ganjil dan genap dari 0 - 20 :");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " bilangan genap");
            } else {
                System.out.println(i + " bilangan ganjil");
            }
        }
    }

}
