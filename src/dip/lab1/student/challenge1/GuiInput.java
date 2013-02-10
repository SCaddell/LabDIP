package dip.lab1.student.challenge1;

import javax.swing.JOptionPane;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class GuiInput implements InputStrategy {

    String msg;
    
    @Override
    public String inputMsg() {
        msg = JOptionPane.showInputDialog("Enter input: ");
        return msg;
    }
}
