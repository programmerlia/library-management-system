package lmsfinal;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class REUSABLES {
        
    public static  DefaultListModel modelBook = new DefaultListModel();
    public static  DefaultListModel modelIsbn = new DefaultListModel();
    public static  ArrayList<String> arrBook = new ArrayList<>();
    public static  ArrayList<String> arrIsbn = new ArrayList<>();
    
    
    
      public static boolean checkNotNull(Object... objects) {
        for (Object obj : objects) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }
      
    
      
     
}
