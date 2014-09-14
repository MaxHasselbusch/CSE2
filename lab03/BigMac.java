//Maximilian Hasselbusch
//September 10 2014
//CSE2
//lab03
//This program will compute the cost of of buying Big Macs.  It will use the Scanner class to obtain
//from the user how many Big Macs, the cost per big mac, and the percentage tax (which depends on the
//state; 6% in PA).  It will then display the total cost

//import the scanner
import java.util.Scanner;
    //define the class
    public class BigMac {
        //enter the main method
        public static void main (String [] args) {
            //Declare an instance of the scanner
            Scanner myScanner;
            //Construct an instance of the scanner
            myScanner = new Scanner( System.in );
            
            //Prompt the user to enter values
            System.out.print("Enter the number of Big Macs(an integer > 0): ");
            
            //accept user input
            int nBigMacs = myScanner.nextInt();
            System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): ");
            double bigMac$ = myScanner.nextDouble();
            System.out.print("Enter the percent tax as a whole number (xx): ");
            double taxRate = myScanner.nextDouble();
            taxRate/=100; //user enters precent, but I want proportion
            
            //Print the output in a good format
            double cost$;
            int dollars,  //whole dollar amount of cost
                    dimes, pennies; //for storming digits to the right of the decimal point for the cost$
            cost$ = nBigMacs*bigMac$*(1+taxRate);
            //get the whole amount, dropping decimal fraction
            dollars=(int)cost$;
            //get dimes amount, eg., (int)(6.73*10) % 10 -> 67 % 10 -> 7
            //where the % (mod) operator returns the remainder
            //after the division: 583%100 -> 83, 27%5 -> 2
            dimes=(int)(cost$*10)%10;
            pennies=(int)(cost$*100)%10;
            System.out.println("The total cost of " +nBigMacs+ " Big Macs, at $"+bigMac$ +
            " per Big Mac, with a" +" sales tax of "+(int)(taxRate*100) +"%, is $"+dollars+'.'+dimes+pennies);
            
        }// end of main method
    }//end of class
    