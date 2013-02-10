package dip.lab1.student.challenge1;

import java.util.Scanner;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class ConsoleInput implements InputStrategy {
    
    Scanner input = new Scanner(System.in);    
 
    @Override
    public String inputMsg() {
        System.out.println ("Enter input: ");
        String msg = input.nextLine();
        return msg;
    }
}
