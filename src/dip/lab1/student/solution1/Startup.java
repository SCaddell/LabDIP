package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author Stuart Caddell
 */
public class Startup {

    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */

        //Low-level modules
        Employee emp1 = new HourlyEmployee(10.50, 2020);
        Employee emp2 = new SalariedEmployee(45000, 1250);
        Employee emp3 = new SalariedEmployee(90000,0);

        // High-level module
        // HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output..
        System.out.println("Employee 1 annual compensation: " +
            nf.format(emp1.getAnnualCompensationForEmployee()));
        System.out.println("Employee 2 annual compensation: " +
            nf.format(emp2.getAnnualCompensationForEmployee()));
        System.out.println("Employee 3 annual compensation: " +
            nf.format(emp3.getAnnualCompensationForEmployee() +
                emp3.getEMPLOYEE_TYPE()));
        
    }

}
