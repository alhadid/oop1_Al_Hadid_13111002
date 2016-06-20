package ConverterPanjang;
/**
 *   
 public Converter(){
 * @author hadid
 */
public class Converter {
    int KM, MM, CM, M, M2, CM2;
    
 public Converter(){         
        }

    public Converter(int KM, int MM, int CM, int M, int CM2, int M2) {
        this.KM = KM;
        this.MM = MM;
        this.CM = CM;
        this.M = M;
        this.M2 = M2;
        this.CM2 = CM2;
    }

    public int getM2() {
        return M2;
    }

    public void setM2(int M2) {
        this.M2 = M2;
    }

    public int getCM2() {
        return CM2;
    }

    public void setCM2(int CM2) {
        this.CM2 = CM2;
    }
    
    public int getKM() {
        return KM;
    }

    public void setKM(int KM) {
        this.KM = KM;
    }

    public int getMM() {
        return MM;
    }

    public void setMM(int MM) {
        this.MM = MM;
    }

    public int getCM() {
        return CM;
    }

    public void setCM(int CM) {
        this.CM = CM;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }
    
  
    
   int ConvertMeterToCenti(int M){
      int Centi;
          Centi = 100 * M;
      return Centi;
                  
   }
   
  int ConvertCentiToMeter(int CM){
       int Meter;
        Meter = (int) (CM / 0.01);
        return Meter;
   }
  
  int ConvertKiloMeterToMeter(int KM){
      int Meter2;
     Meter2 = KM  * 1000;
     return Meter2;
   }
  
   int ConvertMiliMeterToCenti(int MM){
       int Centi2;
       Centi2 = (int) (MM / 0.1);
       return Centi2;
       
   }
   
   int ConvertCentiToMiliMeter(int CM2){
       int Mili;
       Mili =   CM2 * 10;
       return Mili;
       
   }
   
   int ConvertMeterToMiliMeter(int M2){
       int Mili2;
       Mili2 = M2 * 1000;
       return Mili2;
       
   }
   
}
