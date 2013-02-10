package dip.lab1.student.challenge1;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class DIPPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
         * Uses console for input
         */
        InputStrategy inStrategy = new ConsoleInput();
        
        /*
         * Uses JOptionPane for input
         */
        //InputStrategy inStrategy = new GuiInput();
        
        /*
         * Uses console for output
         */
        OutputStrategy outStrategy = new ConsoleOutput();
        
        /*
         * Uses JOptionPane for output
         */
        //OutputStrategy outStrategy = new GuiOutput();
        
        /*
         * One step process to retreive input and send to output
         */
        outStrategy.outputMsg(inStrategy.inputMsg());
    }
}
