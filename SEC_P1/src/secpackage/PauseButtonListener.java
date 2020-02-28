/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secpackage;

import java.awt.event.ActionEvent;

/**
 * Action  Listener class for add button in SECP1_Form
 * @author sanidhya
 */
public class PauseButtonListener implements java.awt.event.ActionListener
{

    SECP1_Form s = null;
    PauseButtonListener(SECP1_Form ins)
    {
        s = ins;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object status = null;
        int row = s.row;
        SessionPasswordForm form = new SessionPasswordForm(s, row, "Paused","pause");
        form.setVisible(true);                    

    }
    
}
