package nilaimakmin;
import java.util.Scanner;
public class Nilaimakmin {
    

    public static void main(String[] args) {
        int N, bil , i, nilaiMin = 1000;
        char pil;
        
        Scanner input = new Scanner(System.in);
        
        N = input.nextInt();
        pil = input.next().charAt(0);
        
        if (pil = 'A') {
        for (i = 0; i < N; i++) {
            bil = input.nextInt();
            if (bil < nilaiMin) {
                nilaiMin = bil;
             }
            System.out.println(nilaiMin);
            
             }
        } else if (pil = 'B') {
            bil > nilaimaks
        }
   
    }
    
}
