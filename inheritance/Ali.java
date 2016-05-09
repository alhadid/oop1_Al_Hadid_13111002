

package inheritance;


public class Ali extends Manusia{
int x = 10, y = 2, z ;
    
    
    @Override
    public void melihat() {
        System.out.println("Ali" + super.mata);
    }

    @Override
    public void lari() {
        super.lari(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void minum() {
        super.minum(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void makan() {
        super.makan(); //To change body of generated methods, choose Tools | Templates.
    }

   public void belajar() {
       System.out.println("Ali Belajar");
   }
    
   public void Penjumlahan() {
       
       System.out.println(z= x + y);
   }
    
  
}
