package dip.lab1.student.challenge1;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class MessageService {
    private static final String MSG = "Hello";
    
    public void outputMsg(OutputStrategy out) {
        out.outputMsg(MSG);
    }
    
}
