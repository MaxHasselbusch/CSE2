/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;

public class Enigma1{
  
  public static void main(String []arg){
    
    double percent;
    
      System.out.print("Enter a value for the percent (0, 1,...99)- ");
    
        double x=((new Scanner(System.in)).nextDouble());
    
          System.out.println("You entered "+x+"%");
   
   //print out the proportion remaining for select percentages
   if( x / 100 == 0.07){  //when the user enters 7
   
      System.out.println("The proportion remaining is "+0.93);
   }
    else if( x / 100.0 == 0.41){//when the user enters 41
    
      System.out.println("The proportion remaining is "+0.59);
    }
    else if(1.0 - (x / 100.0) == 0.86){//when the user enters 14
    
      System.out.println("The proportion remaining is "+0.86);
    }
    else if( x/100.0 == 0.33){//when the user enters 33
    
      System.out.println("The proportion remaining is "+0.67);
    }
    else if(1-x/100.0 == 0.4){//when the user enters 60
    
      System.out.println("The proportion remaining is "+0.40);
    }
    
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 *   Any kind of odd input produces an answer that is insufficient.  The second part will not print if
 *   the input is 7, 41 or 33.  It will print for 14 and 60, however.  I fixed the errors by changing
 *   the if statements for the odd outputs to finding the decimal value of the percentage, not what was
 *   remaining.
 */
