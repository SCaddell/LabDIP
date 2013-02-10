
package dip.lab1.student.challenge1;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class ConsoleOutput implements OutputStrategy {
    @Override
    public void outputMsg(String msg) {
        System.out.println(msg);
    }
    
}
