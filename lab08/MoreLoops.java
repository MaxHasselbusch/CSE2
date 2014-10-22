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
        
        while (!scan.hasNextInt()) {
            
            scan.next(); //get rid of the junk entered by user
            System.out.print("You did not enter an int; try again- ");
        }
        
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

        for (int j = 0; j < n && j < 40; j++) {
            
            for (int k = 0; k < j + 1; k++) {
                System.out.print('*');
            }
            
            System.out.println();
        }
        
        //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
        //WHILE STATEMENTS
        
         /*
        *
        *
        *
        *
        */

//Loop 3------------------------------------------------------------------------

        int k = 4;

        do {
            System.out.println("k=" + k);
            k++;
        }
        while (k < 4);
        
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
        //WITH A WHILE LOOP
        
         /*
        *
        *
        *
        *
        */
        
//Loop 4------------------------------------------------------------------------     

        int count = 0;
        
        while (true) {
            switch (n) {
                default: System.out.println(n + " is > 5 or <1");
                    break;
                case 1:
                case 2:
                    System.out.print("Case 2 ");
                    continue;
                case 3:
                    break;
                case 4:
                    System.out.println("Case 4");
                case 5:
                    System.out.println("Case 5");
                    break;
            }
            count++;
            if (count > 10)
                break;
        }
        
        //COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE USING
        // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
        //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
        //   -5, 1, 20, 5, ETC.
        //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
        //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
        
         /*
        *
        *
        *
        *
        */

//------------------------------------------------------------------------------
        
    }//end of main method
}//end of class
