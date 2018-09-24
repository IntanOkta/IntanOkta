/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author Intan Okta
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int umur;
        boolean cantik;
        
        System.out.println("Intan Oktaviyani A.B");
        System.out.print("Masukkan Umur = ");
        umur = keyboard.nextInt();
        System.out.println("Cantik ? (True/False)");
        cantik = keyboard.nextBoolean();

        if (umur > 23 && cantik == true) {
            System.out.println("Mau Nikah ....");

        } else if (umur > 23) {
            System.out.println("Mikir Dulu ...");

        } else {
            System.out.println("Tidak Mau");
        }
    }
}
