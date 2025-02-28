
/**
 * Write a description of class Country here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Country
{   
    //I used Google to see how the String methods work.
    private String upper_case_letters;
    private String lower_case_letters;
    
    public void country (String countryName)
    {
        upper_case_letters = countryName.toUpperCase();
        lower_case_letters = countryName.toLowerCase();
        
        
        System.out.println(upper_case_letters.substring(0,1) + lower_case_letters.substring(1, lower_case_letters.length()) + 
                           "(" + upper_case_letters.substring(0, 3) + ")");   
    }
}
