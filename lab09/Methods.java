//Maximilian Hasselbusch
//October 15, 2014
//CSE2
//lab08 - MoreLoops
//The goal of this lab is to write methods in order to make a program work

//import the scanner
import java.util.Scanner;

//create the class
public class Methods {

    //create the three methods for use within the main method
    public static int getInt(Scanner scan) {
        int input = 0;
        
        
            while(!scan.hasNextInt()){
                System.out.println("You did not enter an int; try again - ");
                input = scan.nextInt();
            }
            input = scan.nextInt();
        return (input); 
         
    }
    public static int larger(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static boolean ascending(int a, int b, int c) {
            if (a < b && b < c) {
                return true;
            }
            else
                return false;
        }
        //create the main method
    public static void main(String[] arg) {

            Scanner scan = new Scanner(System.in);
            int a, b, c;
            System.out.println("Enter three ints");



            a = getInt(scan);
            b = getInt(scan);
            c = getInt(scan);

            System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
            System.out.println("The larger of " + a + ", " + b + ", and " + c +
                " is " + larger(a, larger(b, c)));
            System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b +
                ", and " + c + " are in ascending order");


        } //end of main method
} //end of class
