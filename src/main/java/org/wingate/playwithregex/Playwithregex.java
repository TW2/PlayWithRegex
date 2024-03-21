package org.wingate.playwithregex;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author util2
 */
public class Playwithregex {

    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            System.out.println("PlayWithRegex starts...");
            FlatLightLaf.setup();
            MainFrame mf = new MainFrame();
            mf.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e) {
                    super.windowClosing(e);
                    System.out.println("PlayWithRegex ends...");
                }
            });
            mf.setTitle("Play with Regex (Licensed under LGPL 2.1 terms by TW2)");
            mf.setLocationRelativeTo(null);
            mf.setVisible(true);
            System.out.println("PlayWithRegex has started!");
        });
    }
}
