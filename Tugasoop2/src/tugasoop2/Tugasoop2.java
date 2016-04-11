/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugasoop2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Tugasoop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input  = new Scanner (System.in);
        String Hari [] = new String [5];
        String pel;
        pel = "";
        
        System.out.println("Program Pengkodean Untuk Mata Kuliah");

        for (int a=0; a<Hari.length; a++)
        {
            System.out.print("Kode Mata kuliah " + a + " untuk : ");
            pel = input.nextLine();
            Hari [a]= pel;
        }
        for (int a=0; a<Hari.length; a++)
        {
            System.out.print("Kode kuliah " + a + " adalah : ");
            System.out.println(Hari[a]);
        }

    }
} 

  
// TODO code application logic her    }
   
