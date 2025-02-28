
/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Zoo
{
    private ArrayList<Bird> zooBirds;
    
    public Zoo() {
        zooBirds = new ArrayList<Bird>();
        zooBirds.add (new Bird ("blue", "pigeon", 2));
        zooBirds.add (new Bird ("red", "Red Cardinal", 3));
        zooBirds.add (new Bird ("green", "Hawk", 4));
        zooBirds.add (new Bird ("blue", "Blue Jay", 5));
        zooBirds.add (new Bird ("blue", "Eagle", 1));
    }
    
   
    
    public void blueBirds(){     
        int count = 0;
        
        for (Bird bird : zooBirds)
        {
            if (bird.color.equals("blue"))
            {
                count++;
            }
        }
        
        System.out.println("There is/are " + count + " blue bird(s).");
    }
}
