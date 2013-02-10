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
        
        //InputStrategy inStrategy = new ConsoleInput();
        InputStrategy inStrategy = new GuiInput();
        
        //OutputStrategy outStrategy = new ConsoleOutput();
        OutputStrategy outStrategy = new GuiOutput();
        
        outStrategy.outputMsg(inStrategy.inputMsg());
        //MessageService msgService = new MessageService();
        //msgService.outputMsg(outStrategy);
    }
}
