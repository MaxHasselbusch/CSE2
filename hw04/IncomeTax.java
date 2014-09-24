//Maximilian Hasselbusch
//CSE2
//hw04 - IncomeTax
//This program will prompt the user to enter an input giving thousands of dollars in income and will
//print out the amount of income tax.

//import scanner
import java.util.Scanner;
//define the class
public class IncomeTax{
    //add the main method
    public static void main(String [] args){
        //declare an instance of the scanner
        Scanner myScanner;
        //construct the scanner
        myScanner = new Scanner (System.in);
        
        //accept input from the user
        System.out.print("Enter your income in thousands as an int: ");
        
        //make sure that the input is an int greater than or equal to 0
        if (myScanner.hasNextInt()) {
            
            //assign input to a variable
            int income = myScanner.nextInt();
            
                //if income is less than 20,000
                if (income < 20 && income >= 0) {
                    double tax = (income * .05) * 1000;
                    System.out.println("The tax rate on $" +income*1000+ " is 5%, and the total tax is $" +tax);
                }
                //if income is greater than or equal to 20,000 but less than 40,000
                else if (income >= 20 && income < 40) {
                    double tax = (income * .07) * 1000;
                    System.out.println("The tax rate on $" +income*1000+ " is 7%, and the total tax is $" +tax);
                
                }
                //if income is greater than or equal to 40,000 but less than 78,000
                else if (income >= 40 && income < 78){
                    double tax = (income * .12) * 1000;
                    System.out.println("The tax rate on $" +income*1000+ " is 12%, and the total tax is $" +tax);
                
                }
                //if income is greater than or equal to 78,000
                else if (income >= 78){
                    double tax = (income * .14)* 1000;
                    System.out.println("The tax rate on $" +income*1000+ " is 14%, and the total tax is $" +tax);
            
                
                }
                //if user doesn't enter a positive in
                else {
                    System.out.println("You did not enter a positive int");
                    return;
                }
    
        } //end of if statement checking status of input
        
        } // end of main method
    } //end of class
