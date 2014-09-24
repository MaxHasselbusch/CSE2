//Maximilian Hasselbusch
//September 17, 2014
//CSE2
//lab04 - Big Mac Again
//This program will obtain data from the user that gives how many Big Macs they want and whether or not they want an order of fries.
//Then, it will print out the cost of the meal back to the user.

//start by importing the scanner
import java.util.Scanner;
    //define the class
    public class BigMacAgain {
        //add the main method
        public static void main(String [] args) {
            //declare an instance of the scanner
            Scanner myScanner;
            //construct the scanner
            myScanner = new Scanner (System.in);
            
            //asign variables for cost of Big Mac and Fries
            double costBigMac$ = 2.22;
            double costFries$ = 2.15;
            
            //ask the user for number of Big Macs
            System.out.print("Enter the number of Big Macs: ");
            
            //check whether the input is an int or not
            if (myScanner.hasNextInt()){
                
                //accept user input
                int nBigMacs = myScanner.nextInt();
                
                //verify that the input value is greater than 0
                if (nBigMacs > 0){ //if this is true, proceed with calculations
                    System.out.print("Would you like fries with that? (Enter Y, y, N or n)"); //accept the user input
                    
                    String answer = myScanner.next(); // assign input to string value 'answer'
                    
                    if (answer.equals("Y") || answer.equals("y")){ //check to see if customer wants fries
                    
                        System.out.println("The cost of fries is: " +costFries$);
                        System.out.println("The cost of your meal is: " +((costBigMac$ * nBigMacs) + costFries$));
                        
                    } //end of if statement above
                    
                    else if(answer.equals("N") || answer.equals("n")){ //check to see if customer doesn't want fries
                    
                        System.out.println("The cost of your meal is: " +(costBigMac$ * nBigMacs));  
                        
                    } //end of else if statement above
                    
                    else{ //if customer enters something other than 'Y, N, y, n'
                        System.out.println("You did not enter an appropriate answer"); //error message
                        return; //leaves the program
                    }
                    
                } //end of if statement 'nBigMacs > 0' 
                else{ //if the customer enters '0'
                    System.out.println("You do not want any Big Macs"); //error message
                    return; //leaves the program
                }
                
            } //end of if statement 'myScanner.hasNextInt()'
            else{ //if the customer enters something other than an int
                System.out.println("You did not enter a valid number"); //error message
                return; //leaves the program
            }
            
        } //end of main method
    } //end of class
            
                    