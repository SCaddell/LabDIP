
package dip.lab1.student.challenge1;

import javax.swing.JOptionPane;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class GuiOutput implements OutputStrategy {
    @Override
    public void outputMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
