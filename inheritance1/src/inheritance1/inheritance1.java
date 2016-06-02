/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance1;



/**
 *
 * @author elmillah
 */
public class inheritance1 {

    public static void main(String[] args) {
    BangunDatar hitung = new Persegi();
    System.out.println(hitung.hitungKeliling());
    System.out.println(hitung.hitungLuas());
    
    
    BangunDatar hitung1 = new PersegiPanjang();
    System.out.println(hitung1.hitungKeliling());
    System.out.println(hitung1.hitungLuas());
    
    
    BangunDatar hitung2 = new SegiTiga();
    System.out.println(hitung2.hitungKeliling());
    System.out.println(hitung2.hitungLuas());
    } 
    
}
