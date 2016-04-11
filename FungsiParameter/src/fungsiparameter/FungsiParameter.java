/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fungsiparameter;

/**
 *
 * @author asus
 */
public class FungsiParameter {
public static void Cetak(int a){
     System.out.println("Nilai + 1" );
}
   
    public static void main(String[] args) {
        FungsiParameter  fungsi = new FungsiParameter();
        System.out.println(fungsi.fungsiTambah(2,4));
    int x;
   for (x=0; x<6; x++){
     Cetak(x);
   }
   System.out.println("Nilair akhir: "+x);   
    }
     private int fungsiTambah(int a, int b) {
        return a + b;
     }
    
}
