//Maximilian Hasselbusch
//28 October 2014
//CSE2
//hw08
//HW8.java
//This program gives practice in writing methods and using overloaded
//methods.

//import the scanner
import java.util.Scanner;

//create the class
public class HW8 {

    //create the first getInput method
    public static char getInput(Scanner scan, String cont) {

        //loop the method
        while (true) {

            //assign a variable to the input
            String con = scan.next();

            //take the value of the char
            char con1 = con.charAt(0);

            //check to see if the char is valid
            if (con1 != 'c' && con1 != 'C') {
                System.out.println("You did not enter a character from the list 'Cc'; try again - ");

                getInput(scan, "Cc");
            }
            //return it if it is
            else {
                return con1;
            }
        }
    }

    //create the second getInput method
    public static char getInput(Scanner scan, String yynn, int i) {

            //loop the method
            while (true) {

                //assign input to a variable
                String yesNo = scan.next();

                //create a char from the input
                char in = yesNo.charAt(0);

                //end method if it goes through 5 times
                if (i == 1) {
                    System.out.println("You failed 5 times");
                    return 'x';

                } //end of if

                //if i is not 1, do this
                else {
                    //check to see what the input is
                    switch ( in ) {
                        case 'y':
                        case 'Y':
                        case 'n':
                        case 'N':
                            return in;

                        default:
                            System.out.println("You did not enter a character from the list" +
                                "y, Y, n or N; please try again");
                            getInput(scan, "yYnN", i - 1);

                    }


                }

            }

        } //end of second getInput method

    //create the third getInput method
    public static char getInput(Scanner scan, String print, String numbers) {

        //loop method
        while (true) {
            System.out.println(print);
            System.out.println("Enter one of: " + numbers);

            //get input
            String num = scan.next();

            //assign input to char
            char numb = num.charAt(0);

            //create switch
            switch (numb) {

                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    return numb;


                default:
                    System.out.println("You did not enter an acceptable character");

                    getInput(scan, "Choose a digit.", "0123456789");


            }
        }
    }

    //end of third getInput method

    //create the main method
    public static void main(String[] arg) {

            //create a variable of type char    
            char input;

            //declare an instance of the scanner
            Scanner scan = new Scanner(System.in);

            //ask the user for input to continue
            System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");

            //get the input
            input = getInput(scan, "Cc");

            //print what the user entered
            System.out.println("You entered '" + input + "'");

            //ask the user to confirm their input
            System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");

            //get the input from the user, asking for it 5 times or until it is given properly
            input = getInput(scan, "yYnN", 5);

            //make sure something was entered
            if (input != 'x') {

                //if something was entered, print out the input
                System.out.println("You entered '" + input + "'");
            }

            //as the user for input again
            input = getInput(scan, "Choose a digit.", "0123456789");

            //display what the user entered
            System.out.println("You entered '" + input + "'");

        } //end of main method

} //end of class