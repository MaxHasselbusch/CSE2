//Maximilian Hasselbusch
//October 15, 2014
//CSE2
//lab08 - MoreLoops
//The goal of this lab is to rewrite loops as different types


//import the scanner
import java.util.Scanner;

//create the class
public class MoreLoops {
    
    //create the main method
    public static void main(String[] arg) {
        
        //declare an instance of the scanner
        Scanner scan = new Scanner(System.in);
        
//Loop 1 -----------------------------------------------------------------------     
        
        int n = 0;

        System.out.print("Enter an int- ");
        
        do{
            if(!scan.hasNextInt()){
            
            scan.next(); //get rid of the junk entered by user
        
            System.out.print("You did not enter an int; try again- ");
            }
            
        } while (!scan.hasNextInt());
        
        //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
        //DO-WHILE LOOP
        
        
        /*
        * The above loop takes input from a user and checks to make sure that
        * the input is an int.  If it is not an int, it will ask again and again
        * until an int is entered.
        *
        */

//Loop 2 -----------------------------------------------------------------------

        n = scan.nextInt();
        
        int j = 0;
        
        
        while(  j < n && j < 40) {
            
            int k = 0;
            
            while (k < (j + 1)) {
                System.out.print('*');
                k++;
            }
            
            j++;
            System.out.println();
        }
        
        //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
        //WHILE STATEMENTS
        
         /*
        * The above code assigns the input value to n, the creates other integers
        * such as j and k.  It prints out the number of stars entered in consecutive 
        * rows of increasing number of stars.
        *
        */

//Loop 3------------------------------------------------------------------------

        int k = 4;

       while (k <= 4){
           
            System.out.println("k=" + k);
            k++;
        }
        
        
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
        //WITH A WHILE LOOP
        
         /*
        * This code assigns the value of 4 to a new integer, k.  It then prints
        * out k = 4 once.
        *
        *
        */
        
//Loop 4------------------------------------------------------------------------     

    
        
        for (int count = 0; count <= 10; count++){
            
            for(boolean var = true; var == true;){
                if( n > 5 || n < 1){
                    System.out.println(n + " is > 5 or <1");
                    break;
                }
                if (n == 1){
                   System.out.print("Case 2 ");
                
                   continue;
                }
                if (n == 2){
                   System.out.print("Case 2");
                   continue;
                }
                if(n == 3){
                    break;
                }
                if(n == 4){
                    System.out.println("Case 4");
                    System.out.println("Case 5");
                    break;
                }
                if(n ==5){
                    System.out.println("Case 5");
                    break;
                }
                if (count == 10){
                    break;
                }
        
              
            }
            
        
            }
        
        
        //COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE USING
        // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
        //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
        //   -5, 1, 20, 5, ETC.
        //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
        //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
        
         /*
        * The above code checks to see whether or not n is greater than 5 or
        * less than 1. By default, it prints that n is greater than 5 or less than
        * 1 and only goes to the other statements if n is 1, 2, 3, 4, or 5.  
        * It cycles through this 10 times unless a 2 or 1 is entered, which
        * will cause an infinite loop of case 2.
        */

//------------------------------------------------------------------------------
        
    }//end of main method
}//end of class
