
package inheritance1;
public class SegiTiga extends BangunDatar {
int alas =5;
int tinggi =10;
    @Override
    int hitungLuas() {
        int luas;
        luas = (alas * tinggi) / 2;
        return luas;
    }

    @Override
    int hitungKeliling() {
        int keliling;
        keliling = (alas + tinggi) * 2;
        return keliling;
    }

}
