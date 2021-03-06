/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secpackage;

import java.awt.event.ActionEvent;

/**
 * Action  Listener class for remove button in SECP1_Form
 * @author sanidhya
 */
public class RemoveButtonListener implements java.awt.event.ActionListener
{
    SECP1_Form s = null;
    RemoveButtonListener(SECP1_Form ins)
    {
        s = ins;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int row = s.row;
        if(row != -1)
        {
            SessionPasswordForm form = new SessionPasswordForm(s, row, null,"remove");
        }
        s.setRemoveButtonState(Boolean.FALSE);
        s.setPauseButtonState(Boolean.FALSE);
        s.setUnpauseButtonState(Boolean.FALSE);
    }
}
