/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihanoop;

import static java.lang.Double.min;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Latihanoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
                
       Scanner scan=new Scanner(System.in);
        System.out.print("Jumlah N : ");
       
        int panjang=scan.nextInt();
        int angka[]=new int[panjang];
        char pil ;
          
        
                for(int i=0;i<panjang;i++)
        {
            System.out.print("Masukkan angka ke-"+i+" : ");
            angka[i]=scan.nextInt();
        }
                  
          
              

        // TODO code application logic here
    
   
    }
}