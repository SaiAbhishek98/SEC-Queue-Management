/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secpackage;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Action  Listener class for add button in SECP1_Form
 * @author sanidhya
 */
public class AddButtonListener implements java.awt.event.ActionListener
{
    
    SECP1_Form s = null;

    AddButtonListener(SECP1_Form aThis) 
    {
        s = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        loginForm login = new loginForm(s);
        login.setVisible(true);
    }
    
}
