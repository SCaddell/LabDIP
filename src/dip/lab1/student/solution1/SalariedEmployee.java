package dip.lab1.student.solution1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee, AnnualBonus {

    private double annualSalary;    // employee's annual salary
    private double annualBonus;     // employee's annual bonus
    private double exemptHoursExpected; // expected minimum total annual hours
    
    /**
     * Convenience constructor. Is this the best way to go?
     * No, only requiring Salaray at a minimum.
     * @param annualSalary - the employee's annual salary
     */
    public SalariedEmployee(double annualSalary) {
        setAnnualSalaryOrHourlyWage(annualSalary);
        this.annualBonus = 0.00;
        this.exemptHoursExpected = 2080;     // default is 40 hrs per week * 52 weeks
    }
    
    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalaryOrHourlyWage(annualSalary);
        setAnnualBonus(annualBonus);
        exemptHoursExpected = 2080;     // default is 40 hrs per week * 52 weeks
    }
    
    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     * @param exemptHoursExpected - minimum exempt hours expected annually
     */
    public SalariedEmployee(double annualSalary, double annualBonus,
            double hoursExpected) {
        setAnnualSalaryOrHourlyWage(annualSalary);
        setAnnualBonus(annualBonus);
        this.exemptHoursExpected = hoursExpected;
    }

    @Override
    public void setAnnualSalaryOrHourlyWage(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double getAnnualSalaryOrHourlyWage() {
        return annualSalary;
    }

    @Override
    public double getAnnualCompensationForEmployee() {
        return annualSalary + annualBonus;
    }

    @Override
    public void setTotalHrsForYear(double totalHrsForYear) {
        this.exemptHoursExpected = totalHrsForYear;
    }

    @Override
    public double getTotalHrsForYear() {
        return exemptHoursExpected;
    }

    @Override
    public void setAnnualBonus(double bonus) {
        this.annualBonus = bonus;
    }

    @Override
    public double getAnnualBonus() {
        return annualBonus;
    }

    
}
