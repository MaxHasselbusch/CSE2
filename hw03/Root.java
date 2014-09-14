//Maximilian Hasselbusch
//September 13, 2014
//CSE 2
//hw03
//Program 2 - Root
//This program will accept an inputed value and find its cube root
//and the value of that value cubed.

//import the scanner
import java.util.Scanner;

//define a class
    public class Root{
        //add the main method
        public static void main(String [] args) {
            //declare an instance of the scanner
            Scanner myScanner;
            //construct an instance of the scanner
            myScanner=new Scanner (System.in);
            
            //accept input from the user
            System.out.print("Enter the value of x: ");
            //accept the value from the scanner above
            int xValue=myScanner.nextInt();
            
            //calculate first guess
            double guess1=xValue/3;
            //calculate guess 2
            double guess2=((guess1*guess1*guess1)+xValue)/(3*guess1*guess1);
            //calculate guess 3
            double guess3=((2*guess2*guess2*guess2)+xValue)/(3*guess2*guess2);
            //calculate guess 4
            double guess4=((2*guess3*guess3*guess3)+xValue)/(3*guess3*guess3);
            //calculate guess 5
            double guess5=((2*guess4*guess4*guess4)+xValue)/(3*guess4*guess4);
            //calculate guess 6
            double guess6=((2*guess5*guess5*guess5)+xValue)/(3*guess5*guess5);
            
            //cube guess 5
            double finalCube=guess6*guess6*guess6;
            
                //print out the results
                System.out.println("The cube root of "+xValue+ " is "+guess6+ ".");
                System.out.println("The cube of the cube root is: "+guess6+"*"+guess6+"*"+guess6+"="+finalCube+".");
                
        }
    }