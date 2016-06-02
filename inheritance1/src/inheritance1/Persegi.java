
package inheritance1;
public class Persegi extends BangunDatar {

    int sisi =5;
    @Override

    int hitungLuas() {
        int luas;
        luas = sisi * sisi;
        return luas;

    }

    @Override
    int hitungKeliling() {
        int keliling;
        keliling = 4 * sisi;
        return keliling;
    }

}