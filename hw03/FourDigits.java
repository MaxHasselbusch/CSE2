//Maximilian Hasselbusch
//September 13, 2014
//CSE 2
//hw03
//Program 3 - FourDigits
//This program will accept a double input from the user and print out the first four
//digits to the right of the decimal point

//import scanner
import java.util.Scanner;

//define a class
public class FourDigits{
    //add a main method
    public static void main(String [] args) {
        //declare an instance of the scanner
        Scanner myScanner;
        //construct this instance
        myScanner = new Scanner (System.in);
        
        //accept the input from the user
        System.out.print("Enter a value in the form of a double (xx.xxxx) and the four digits to the right of the decimal will be displayed: ");
        //accept the value from above
        double inputDouble = myScanner.nextDouble();
        
        //multiply by 10000 and create new variable
        double inputDouble1 = inputDouble * 10000;
        //subtract inputDouble*10000 as an int
        inputDouble1 = (inputDouble1 - (int) inputDouble*10000);
        //convert inputDouble1 to an int without a decimal point
        int inputDouble2 = (int) inputDouble1;
        
        //get the first digit value of inputDouble2
        
        //For below: newInts with letters are the digit values and newInts with numbers are
        //the individual number values and the values that will make finding the next
        //digit value possible.
        
        int newInt1 = (int) (inputDouble2/1000);
        int newIntA = newInt1 * 1000;
        //subtract the first digit value of inputDouble2 from its original form
        int newInt2 = inputDouble2 - newIntA;
        
        //get the second digit value of inputDouble2
        int newInt3 = (int) (newInt2/100);
        int newIntB = newInt3 * 100;
        //subtract the second digit value of inputDouble2 from newInt2
        int newInt4 = newInt2 - newIntB;
        
        //get the third digit value of inputDouble2
        int newInt5 = (int) (newInt4/10);
        int newIntC = newInt5 * 10;
        //subtract the third digit value of inputDouble 2 from newInt4
        int newInt6 = newInt4 - newIntC;
        //the value of newInt6 is also the fourth digit value of inputDouble2
        
        //print out result
        System.out.println("The four digits to the right of the decimal are: " +newInt1+newInt3+newInt5+newInt6);
        
        
    }
}