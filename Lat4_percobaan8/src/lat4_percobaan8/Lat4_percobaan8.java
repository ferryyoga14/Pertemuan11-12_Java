/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat4_percobaan8;

/**
 *
 * @author user
 */
public class Lat4_percobaan8 {

    /**
     * @param args the command line arguments
     */
   public static void main( String[] args ){
String status = "";
int grade = 80;
//mendapatkan status pelajar
status = (grade >= 60)?"Passed":"Fail";
//print status
System.out.println( status );
    }
    
}
