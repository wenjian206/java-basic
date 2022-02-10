package Exercise;
import java.util.*;

public class EggCal {

	public static void main(String[] args) {
	       
        int eggs = 0;         
        int gross = 0;       
        
     /* How many eggs are left over, above an
        integral number of gross? This number
        can be computed as eggs % 144, and is
        in the range 0 to 143.  This number will
        be divided into dozens and extras. */
        int aboveGross = 0;           
        
        int dozens = 0;       
        int extras = 0;       
                           
     
       System.out.println("How many eggs do you have?");
       Scanner numberOfEggs = new Scanner(System.in);
       int eggs1 = numberOfEggs.nextInt();
  
      //will give the number of gross
        gross = eggs1 / 144;
      
      //the number of eggs left over from gross
        aboveGross = eggs1 % 144;
        
        
      //If there are N eggs in the pile, the number of dozens is N/12
        dozens = aboveGross / 12;
      
        
      //the number of extra eggs is N%12
        extras = aboveGross % 12;          
        
        System.out.println("Your number of eggs is : " + gross);
        System.out.println("You have " + dozens + " dozen(s) eggs" );
        System.out.println("You also have " + extras +" extra eggs");
        
       

     } //end of main
	

  } 