/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat5_percobaan1;

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Lat5_percobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(
System.in) );
        
        String name = "";
System.out.print("Please Enter Your Name:");
try{
name = dataIn.readLine();
}catch( IOException e ){
System.out.println("Error!");
}
System.out.println(" Selamat Pagi Sayangku," + name +"!");
    }
    
}
