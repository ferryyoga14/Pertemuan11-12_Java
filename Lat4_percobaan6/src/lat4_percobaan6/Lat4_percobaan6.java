/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat4_percobaan6;

/**
 *
 * @author user
 * NIM  : A2.1900069
 *  Nama : Ferry Yoga Perkasa
 *  Kelas: TI-1A
 *  Percobaan 6 Penggunaan Operator Logika Eksklusive OR:
 */
public class Lat4_percobaan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean val1 = true;
boolean val2 = true;
System.out.println(val1 ^ val2);
val1 = false;
val2 = true;
System.out.println(val1 ^ val2);
val1 = false;
val2 = false;
System.out.println(val1 ^ val2);
val1 = true;
val2 = false;
System.out.println(val1 ^ val2);
    }
    
}
