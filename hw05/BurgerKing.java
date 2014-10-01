//Maximilian Hasselbusch
//30 September 2014
//CSE2
//hw05
//BurgerKing.java
//This program will ask the user for input of burger, soda or fries and
//output options pertaining to each individual choice

//import scanner
import java.util.Scanner;

//create class
public class BurgerKing {
    
    //create the main method
    public static void main(String [] args){
        
        //create the scanner
        Scanner bkInput = new Scanner(System.in);
        
        //take input from the user
        System.out.print("Enter a letter indicating your choice of: \n");
        System.out.print("Burger (B or b) \n"); 
        System.out.print("Soda (S or s) \n"); 
        System.out.print("Fries (F or f) \n");
        
        //create a variable with the input
        String input = bkInput.next();
        
        if (input.length() == 1) {
        
        //create a switch statement to decide what to do
        switch (input){
            
            //case for burger
            case "B": case "b":
                //ask the user for input
                System.out.print("Enter A or a for 'all the fixins' \n");
                System.out.print("Enter C or c for cheese \n");
                System.out.print("Enter N or n for none of the above \n");
                      
                //accept the input
                char burger = bkInput.next().charAt(0);
                
                //create a switch statement for burger fixins
                switch(burger){
                    case 'A': case 'a': System.out.println("You ordered a burger with all the fixins");  break;
                    case 'C': case 'c': System.out.println("You ordered a burger with cheese"); break;
                    case 'N': case 'n':System.out.println("You ordered a plain burger"); break;
                default: System.out.print("You did not enter a valid letter \n");
                }//end of switch statement 'burger'
                
            //end program
            break;
            
            //case for soda
            case "S": case "s":
                //ask the user for input
                System.out.print("Do you want Pepsi? (P or p) \n");
                System.out.print("Coke? (C or c) \n");
                System.out.print("Sprite? (S or s) \n");
                System.out.print("Or Mountain Dew? (M or m) \n");
                
                //accept the input
                char soda = bkInput.next().charAt(0);
                
                //create a switch statement for kind of soda
                switch(soda){
                    case 'P': case 'p': System.out.println("You ordered a Pepsi");  break;
                    case 'C': case 'c': System.out.println("You ordered a Coke"); break;
                    case 'S': case 's': System.out.println("You ordered a Sprite"); break;
                    case 'M': case 'm': System.out.println("You ordered a Mountain Dew"); break;
                default: System.out.println("You did not enter a valid letter");
                }//end of switch statement 'soda'
            
            //end program
            break;
            
            //case for fries
            case "F": case "f":
                //ask the user for input
                System.out.print("Do you want a large or small order of fries? (L or l; S or s) \n");
                
                //accept the input
                char fries = bkInput.next().charAt(0);
                
                //create a switch statement for size of fries
                switch(fries){
                    case 'L': case 'l': System.out.println("You ordered a large fry"); break;
                    case 'S': case 's': System.out.println("You ordered a small fry"); break;
                default: System.out.println("You did not enter a valid letter");
                }//end of switch statement 'fries'
            
            //end program
            break;
            
        //default for switch statement 'input'
        default: System.out.println("You did not enter a valid letter");
                
        }//end of switch statement 'input'
        
        }//end of if statement making sure input has one character
        else {
            System.out.println("Looking for a single letter");
            return;
        }
    }//end of main method
}//end of class