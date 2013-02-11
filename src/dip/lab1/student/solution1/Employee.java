package dip.lab1.student.solution1;

/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned
 * so far.
 *
 * @author Stuart Caddell
 */
public interface Employee {
    
    /**
     * Sets Annual Salary or Hourly Wage
     */
    public void setAnnualSalaryOrHourlyWage(double annualSalaryOrHourlyWage);
    
    /**
     * gets Annual Salary or expected Wages not including Bonus (if appropriate)
     * @return 
     */
    public double getAnnualSalaryOrHourlyWage();
    
    /**
     * Annual Salary or expected Wages including Bonus (if appropriate)
     * @return 
     */
    public double getAnnualCompensationForEmployee();
   
    /**
     * This would be a requirements decision, but for now I am leaving it here.
     * Obviously it is beneficial for hourly employees.  My reason for 
     * requiring it for salary (and any future employee types) is that all
     * all salaries have at a minimum an "unspoken" minimum number of hours
     * to be worked by the employee.  This can vary by geographic location,
     * or whether or not the salaried employee is "full time" or not.
     * @param totalHrsForYear -- think carefully about this
     */
    public void setTotalHrsForYear(double totalHrsForYear);
    
    /**
     * Is this polymorphic? Yes, see above comment.  In the Northeast U.S. a 
     * lot of salary work weeks are based upon a 37.5 hour work week.
     * (working 9 to 5 with a half hour off for lunch).  In the Midwest 40 hours
     * is expected.  (37.5 hrs * 52 weeks versus 40 hrs * 52 weeks)
     * Having this info for all employees is helpful. 
     * @return
     */
    public double getTotalHrsForYear();

}
