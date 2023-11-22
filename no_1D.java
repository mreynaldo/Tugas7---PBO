/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas7;

/**
 *
 * @author Reynaldo
 */
public class no_1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            if (i == 0) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            }
        }
    }

}
