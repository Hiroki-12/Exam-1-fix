
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    private double totalsalary;
    private double netpay;
    
    public void salary(int workedHours, double hourlyWage)
    {
        
        totalsalary = workedHours*hourlyWage;
        System.out.println("Your total salary is: " + totalsalary);
        netpay = totalsalary - (totalsalary*0.3);
        System.out.println("Your netpay is: " + netpay);
         
    }
}
