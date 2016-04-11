/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan;

/**
 *
 * @author asus
 */
public class Latihan {
    public static void main(String[] args) {
       Latihan  belajar = new Latihan();
       belajar.tambah(1,2);
        belajar.kurang(5,6);
	System.out.print(belajar.fungsiTambah(2,4));
    }
    
    private void tambah(int a, int b) {
        int hasil;
        hasil = a + b;
         System.out.println(hasil);
    }
    private void kurang (int a, int b) {
            int hasil;
            hasil = a - b;
             System.out.println(hasil);
            }
    private int fungsiTambah(int a, int b) {
        return a + b;
    }
    }