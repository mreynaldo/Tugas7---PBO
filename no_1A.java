/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas7;

/**
 *
 * @author Reynaldo
 */
public class no_1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ini adalah Deret Bilangan Prima dan Bukan Bilangan Prima :");
        for (int i = 0; i <= 20; i++) {
            boolean isPrime = true;
            if (i == 0 || i == 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " bukan bilangan prima");
            }
        }
    }

}
