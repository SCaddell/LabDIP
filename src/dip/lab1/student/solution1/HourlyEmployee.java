package dip.lab1.student.solution1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author Stuart Caddell
 */
public class HourlyEmployee implements Employee {
    
    private double hourlyRate = 0;  // hourly wage for employee
    private double totalHrsForYear = 0; // total expected hours per year 
            
    
    /**
     * Convenience constructor. Is this the best way to go?
     * Yes, ensures we do not have employees with wages, but no hours,
     * or hours but no wage.
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setAnnualSalaryOrHourlyWage(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    @Override
    public void setAnnualSalaryOrHourlyWage(double hourlyWage) {
        // Need validation edits
        this.hourlyRate = hourlyWage;
    }

    @Override
    public double getAnnualSalaryOrHourlyWage() {
        return hourlyRate;
    }

    @Override
    public double getAnnualCompensationForEmployee() {
        return hourlyRate * totalHrsForYear;
    }

    @Override
    public void setTotalHrsForYear(double totalHrsForYear) {
        // Need validation edits
        this.totalHrsForYear = totalHrsForYear;
    }

    @Override
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

}
