/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihanoop1;

/**
 *
 * @author asus
 */
public class Latihanoop1 { 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereublic static void main (String[] args){
	Contoh nama = new Contoh();

nama.namaSaya();

System.out.println(nama.namaSaya());
nama.pertambahan();	
}


//fungsi -> sesuatu yang mengembalikan nilai
public String namaSaya(){
return "Hadid";
}

public void pertambahan() {
	int a = 1; 
	int b = 2;
	System.out.println(a+b);
}
}
    }
    
}
