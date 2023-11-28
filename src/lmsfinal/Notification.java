package lmsfinal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Notification {
    public static void show(String message) {
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
        frame.setLayout(new BorderLayout());
        frame.setSize(320, 80);
        frame.setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel(message, SwingConstants.LEFT);
        label.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        label.setFont(new Font("Century Gothic", Font.BOLD, 16));
        label.setForeground(Color.BLACK);
        label.setBackground(Color.BLACK);
        frame.add(label, BorderLayout.WEST);

        frame.setVisible(true);

        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

   
}
