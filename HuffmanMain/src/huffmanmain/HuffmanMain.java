package huffmanmain;

/**
 * 
 * @author Robert C. Ilardi
 * rogue logic
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer; 

public class HuffmanMain {

    private int[] charCounts;
    private float[] charProbabilities;
    private int totalBytes;
    private int distinctChars;
    private int[] charsOrder;
    
    public static final int MAX_CHAR = 256;
    public static final int MAX_BUFFER = 1024;
    public static final int COMPRESS = 0;
    public static final int DECOMPRESS = 1;
    
    private LengthNode root;
    private ArrayList huffmanCodes;
    private HuffmanCode padding;
    
    public HuffmanMain() {
        charCounts = new int[MAX_CHAR];
        charProbabilities = new float[MAX_CHAR];   
        clearStats();
    }

    //Clear statistical data
    private void clearStats() {
        totalBytes = 0;
        distinctChars = 0;
        root = null;
        huffmanCodes = null;
        
        for (int i = 0; i < MAX_CHAR; i++) {
            charCounts[i] = 0;
            charProbabilities[i] = 0.0f;
        }    
    }

    //Get The Counts OF each Instance of each unique ASCII
    //character in an array of bytes.
    //the data from a input stream such as a file.
    private void countCharacters(byte[] bArr, int len) {
        int iv;
        
        if (bArr != null) {
            totalBytes += len;
            
            for (int i = 0; i < bArr.length && i < len ; i++) {
                iv = bArr[i] & 0xff;
                charCounts[iv]++;
            }    
        }
    }
   
    //Same as the method directly above.
    private void countCharacters(byte[] bArr) {
        if (bArr != null) {
            countCharacters(bArr, bArr.length);
        } 
    } 
    
    //Analyze an Input Stream.
    //Read each byte from the stream and collect
    //statistical information such as character counts
    //and probabilities. Also sort the character order
    //with the most frequent characters first!
    private void analyzeStream(InputStream ins)
            throws IOException {
        byte[] ba = new byte[MAX_BUFFER];
        int cnt;
        
        do {
            cnt = ins.read(ba);
            
            if (cnt > 0) {
                countCharacters(ba, cnt);
            }
        } while (cnt != -1);
        
        calculateProbabilities();
        sortCharOrder();
    }   
            
        
    
                
                
    
    
            
            
            
            
            
            
    public static void main(String[] args) {
     
    }

    

  
   
    
}
