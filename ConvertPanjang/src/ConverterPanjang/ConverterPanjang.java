package ConverterPanjang;

/**
 *
 * @author Hadid
 */
public class ConverterPanjang {
public static void main(String[] args) {
  Converter PJG = new Converter();
  Converter PJG2 = new Converter(20, 30, 40, 50, 60, 70);
  
  System.out.print(PJG.ConvertKiloMeterToMeter(20)+ " Meter = ");
  System.out.println(PJG2.KM + " KiloMeter ");
  System.out.print(PJG.ConvertMeterToCenti(50)+ " CentiMeter =  ");
  System.out.println(PJG2.M + " Meter ") ;
  System.out.print(PJG.ConvertCentiToMiliMeter(60)+ " MiliMeter = ");
  System.out.println(PJG2.CM2 + " CentiMeter ") ;
  System.out.print(PJG.ConvertMeterToMiliMeter(70)+ " Meter = ");
  System.out.println(PJG2.M2 + " MiliMeter ") ;
  System.out.print(PJG.ConvertCentiToMeter(40)+ " CentiMeter = ");
  System.out.println(PJG2.CM + " Meter ");
  System.out.print(PJG.ConvertMiliMeterToCenti(30)+ " MiliMeter = ");
  System.out.println(PJG2.MM + " CentiMeter ");
    
  
          
       
     
    
}

    
}

