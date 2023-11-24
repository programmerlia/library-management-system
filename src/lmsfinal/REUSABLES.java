package lmsfinal;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class REUSABLES {
    
    public static String strngBook="";
    public static String strngIsbn="";
    
      public static boolean checkNotNull(Object... objects) {
        for (Object obj : objects) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }
      
      public static void showNotif(String message) {
        JFrame f = new JFrame();
        f.setUndecorated(true); // No border
        f.setLayout(new BorderLayout());
        f.setSize(320, 80);
        f.setBackground(Color.BLACK);
        f.setLocationRelativeTo(null); 

        JLabel label = new JLabel(message, SwingConstants.LEFT);
        label.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0)); 
        label.setFont(new Font("Century Gothic", Font.BOLD, 16));
        label.setForeground(Color.BLACK);
        label.setBackground(Color.WHITE);
        f.add(label, BorderLayout.WEST);
        f.setVisible(true);
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
        timer.setRepeats(false); 
        timer.start();
    }
}
