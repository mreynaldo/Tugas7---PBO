/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas7;

/**
 *
 * @author Reynaldo
 */
public class no_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int a=4;
        
        System.out.print("    ");
        for(int i=1; i<=a; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        
        for (int i = 0; i <= a; i++) {
            System.out.print("-----");
        }
        System.out.println();
        
        for (int i = 1; i <= a; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= a; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
    
}
