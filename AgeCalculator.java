
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    private int currentYear = 2025;
    private int age;
    
    public int age(int yearOfBirth)
    {
          age = currentYear - yearOfBirth;
        
          if(age >= 16)
          {
              System.out.println("You can drive.");
          }
          
          else
          {
              System.out.println("You can drive in " + (16-age) + " years.");
          }
          
          return age;
    }
}
