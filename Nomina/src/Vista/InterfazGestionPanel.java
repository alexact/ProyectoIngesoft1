/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author Nicolás Mayorga
 */
public class InterfazGestionPanel {
    public static JInternalFrame returnInternal(JPanel panel, String text) {
        JInternalFrame interno = new JInternalFrame(text);
        interno.add(panel);
        interno.setClosable(true);
        interno.pack();
        interno.setLocation(250, 50);
        interno.setVisible(true);
        return interno;
    }
}
