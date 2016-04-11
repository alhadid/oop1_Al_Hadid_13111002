package j2dsnakegame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class J2dsnakegame extends JFrame {
    
    public J2dsnakegame() {
        add(new board());
        setResizable(false);
        pack();
        setTitle("Hadid snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
        
    public static void main (String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame ex =  new J2dsnakegame();
            ex.setVisible(true);  
        });
    }
}
        

/**
 *
 * @author asus

    
}
