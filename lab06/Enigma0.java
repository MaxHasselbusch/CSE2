/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{
  
  public static void main(String arg []){
    
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter an int- ");
    
    int n = 0;
    
    if(scan.hasNextInt()){
      
      n = scan.nextInt();
    
        System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  } //end of main method
  
} //end of class

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 
 The variable n had to be defined outside of the if statements to begin with.  When the scanner accepts
 input, it reassigns the value of n to what the user entered.  This new value will be used throughout the
 rest of the program.  In addition, when defining the rest of the variabels above the if statement,
 n had to be removed since it was already declared.
 */
