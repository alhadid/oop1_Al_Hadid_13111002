/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance1;


public class PersegiPanjang extends BangunDatar {

    int pg = 5;
    int ls = 10;

    @Override
    int hitungLuas() {
        int luas;
        luas = pg * ls;
        return luas;
    }

    @Override
    int hitungKeliling() {
        int keliling;
        keliling = (pg + ls) * 2;
        return keliling;
    }

}
