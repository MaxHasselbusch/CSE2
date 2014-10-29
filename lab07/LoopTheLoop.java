//Maximilian Hasselbusch
//October 11, 2014
//CSE2
//lab07 - LoopTheLoop
//This program will use while loops and break statements to loop loops.

//import the scanner
import java.util.Scanner;

//make a class
public class LoopTheLoop {

    //make the main method
    public static void main(String[] arg) {

            //declare the scanner
            Scanner starScanner = new Scanner(System.in);


            //initialize variables

            int nStars = -1;
            String star = "";

            //create first loop to check for nStars
            while (nStars < 1 || nStars > 15) {

                //ask user for imput
                System.out.print("Enter number of stars in the range of 1-15: ");

                //check to make sure that the input is an int
                if (starScanner.hasNextInt()) {

                    //assign input to a variable
                    nStars = starScanner.nextInt();

                    if (nStars >= 1 && nStars <= 15) {

                        nStars = nStars;


                        //create while loop for printing stars
                        while (nStars > 0) {
                            int nStars1 = nStars;

                            while (nStars1 > 0) {
                                System.out.print("*");
                                nStars1--;
                            }

                            //skip to new line
                            System.out.println();

                            while (nStars > 0) {
                                star += "*";
                                System.out.println(star);
                                nStars--;

                            } //end of second while loop
                        }
                        star = "";

                        //ask user to go again
                        System.out.print("Enter Y or y to go again: ");

                        //check what user typed
                        if (starScanner.hasNext()) {

                            //assign the input to a string
                            String input = starScanner.next();

                            //make a switch statement to do something with the input
                            switch (input) {

                                case "y":
                                case "Y":
                                    continue;
                                default:
                                    break;

                            } //end of switch

                            return;
                        } //end of if statement



                    } //end of if statement
                    else {
                        System.out.println("You did not enter a valid int");
                    }

                } //end of if statement
                else {
                    System.out.println("You did not enter an int");
                    return;
                } //end of else statement
            }
        } //end of main method
} //end of class
