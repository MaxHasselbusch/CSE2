//Maximilian Hasselbusch
//September 23, 2014
//CSE2
//hw04 - Month
//This program will ask the user for a month, then display the total number of days in the month. 

//import the scanner
import java.util.Scanner;
//define the class
public class Month{
    //add the main method
    public static void main(String [] args){
        //declare an instance of the scanner
        Scanner input;
        //construct the scanner
        input = new Scanner (System.in);
        //ask the user for the month
        System.out.print("Enter the number of the month as an integer (1-12): ");
        
        //make sure input is an int
        if (input.hasNextInt()){
            
            //accept input and assign to a variable
            int month = input.nextInt();
            
            //make sure input is between 1 and 12
            if ((month >= 1) && (month <= 12)){
                //start a switch statement
                switch (month) {
                    //check to see which month is inputed, and the number of days are printed out
                    case 1: System.out.println("The month has 31 days"); break;
                    
                    //if the month is february, ask for the year from the user
                    case 2: System.out.print("Enter the year: ");
                        //make sure input is an int
                        if (input.hasNextInt()){
                            //assign input to a variable
                            int year = input.nextInt();
                            //start an int statement to make sure the year is within an allowable range
                            if (year >= 0) {
                                if (year % 400 == 0){
                                    System.out.println("The month has 29 days");
                                }
                                else {
                                    System.out.println("The month has 28 days");
                                }
                            } //end of if statement making sure that the year is positive 
                            else { //else statement if the year is invalid
                                System.out.println("You did not enter a positive year");
                                return;
                            }
                        } //end of if statement making sure that the year is an int
                        else { //else statement if the year is not an int
                            System.out.println("You did not enter an int value");
                            return;
                        }
                        break;
                    case 3: System.out.println("The month has 31 days"); break;
                    case 4: System.out.println("The month has 30 days"); break;
                    case 5: System.out.println("The month has 31 days"); break;
                    case 6: System.out.println("The month has 30 days"); break;
                    case 7: System.out.println("The month has 30 days"); break;
                    case 8: System.out.println("The month has 31 days"); break;
                    case 9: System.out.println("The month has 30 days"); break;
                    case 10: System.out.println("The month has 31 days"); break;
                    case 11: System.out.println("The month has 30 days"); break;
                    case 12: System.out.println("The month has 31 days"); break;
                } //end of switch statement
            
            } //end of if statement making sure input is in the right range
            
            else { //else statement if input is not between 1 and 12
            System.out.println("You did not enter a positive int between 1 and 12");
            return;
            }
            
        } //end of if statement checking the status of the input
        
        else { //else statement if input is not a positive int
            System.out.println("You did not enter a positive int between 1 and 12");
            return;
        }
        
    }//end of the main method
     
} //end of class