
package nilaimaxmin;

import java.util.Scanner;


public class NilaiMaxMin {
        public static void main(String[]args ) { 

    int Nilai, bil1, bil2, i, Min = 1000, Max = 0, jml = 1;
        char pil;

        Scanner input = new Scanner(System.in);

        Nilai = input.nextInt();
        pil = input.next().charAt(0);

        if (pil == 'A') {
            for (i = 0; i < Nilai; i++) {
                bil1 = input.nextInt();
                if (bil1 <= Min) {
                    if (bil1 == Min) {
                        jml++;
                    }
                    Min = bil1;
                }
            }
            System.out.println(Min);
            System.out.println(jml);
        } else if (pil == 'B') {
            for (i = 0; i < Nilai; i++) {
                bil2 = input.nextInt();
                if (bil2 >= Max) {
                    if (bil2 == Max) {
                        jml++;
                    }
                    Max = bil2;
                }
                System.out.println(Max);
                System.out.println(jml);
            }
        }
    }
}
    
    

