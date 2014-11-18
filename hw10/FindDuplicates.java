//Maximilian Hasselbusch
//16 November 2014
//CSE2
//hw10
//FindDuplicates.java
//This program will ask the user to enter 10 ints into an array.  It will then search the array in order to determine if there are any duplicate numbers.

//import the scanner
import java.util.Scanner;

//create the class
public class FindDuplicates {

    //create the main method
    public static void main(String[] arg) {

            //declare the scanner
            Scanner scan = new Scanner(System.in);

            //create the array num
            int num[] = new int[10];

            //initialize a string called answer
            String answer = "";

            //create a do while loop to accept input from the user
            do {
                System.out.print("Enter 10 ints- ");
                for (int j = 0; j < 10; j++) {
                    num[j] = scan.nextInt();
                }
                String out = "The array ";
                out += listArray(num); //return a string of the form "{2, 3, -9}"   
                if (hasDups(num)) {
                    out += "has ";
                }
                else {
                    out += "does not have ";
                }
                out += "duplicates.";
                System.out.println(out);
                out = "The array ";
                out += listArray(num);
                if (exactlyOneDup(num)) {
                    out += "has ";
                }
                else {
                    out += "does not have ";
                }
                out += "exactly one duplicate.";
                System.out.println(out);
                System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
                answer = scan.next();
            } while (answer.equals("Y") || answer.equals("y"));
    } //end of main method

//methods-----------------------------------------------------------------------

    //listArray method
    public static String listArray(int num[]) {
            String out = "{";
            for (int j = 0; j < num.length; j++) {
                if (j > 0) {
                    out += ", ";
                }
                out += num[j];
            }
            out += "} ";
            return out;
    } //end of listArray method

    //hasDups method
    public static boolean hasDups(int[] num) {
            
        //create an int called control
        int control = 1;

            //check to see if there are any duplicates in num []
            for (int i = 0; i < num.length; i++) {

                for (int j = control; j < num.length; j++) {

                    if (num[i] == num[j]) {
                        return true;

                    } //end of if statement

                } //end of for loop

                for (int j = 0; j < i; j++) {

                    if (num[i] == num[j]) {
                        return true;

                    } //end of if statement

                } //end of for loop
                
                control++;
                
            } //end of for loop

        return false;

    } //end of hasDups method
        
    //exactlyOneDup method
    public static boolean exactlyOneDup(int[] num) {

        //create an int called control
        int control = 1;
        
        //create an int called counter
        int counter = 0;

            //check to see if there are any duplicates in num []
            for (int i = 0; i < num.length; i++) {

                for (int j = control; j < num.length; j++) {

                    if (num[i] == num[j]) {
                        counter += 1;

                    } //end of if statement

                } //end of for loop
                
                control++;
                
            } //end of for loop

            if (counter != 1) {
                return false;
            }
            return true;
            
    } //end of exactlyOneDup
        
} //end of class
