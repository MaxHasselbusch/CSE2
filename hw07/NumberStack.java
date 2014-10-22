//Maximilian Hasselbusch
//21 October 2014
//CSE2
//hw07
//NumberStack.java
//This program will take an input from the user and output 
//a pattern of numbers in three different kinds of loops.

//input the scanner class
import java.util.Scanner;

//create the class
public class NumberStack {

    //create the main method
    public static void main(String[] args) {

            //create an instance of the scanner
            Scanner numScanner = new Scanner(System.in);

            //take input from the user
            System.out.print("Enter a number between 1 and 9: ");

            //make sure user entered an int
            if (numScanner.hasNextInt()) {

                //assign the input to a variable
                int inputNum = numScanner.nextInt();
                int count = 0;
                int printingCount = 1;

                //make sure that the variable is between 1 and 9
                if (inputNum > 0 && inputNum < 10) {

//start using for loop---------------------------------------------------------------

                    System.out.println("Using For Loops:");

                    //loop the loops according to the input number
                    for (int i = 1; i <= inputNum; i++) {

                        //reassign counting variable
                        count = i;

                        //loop the printing for each line of numbers
                        for (int j = count; j > 0; j--) {

                            //loop the printing of the numbers
                            for (int k = 1; k <= printingCount && k > 0; k++) {

                                //print the numbers
                                System.out.print(count);


                            } //end of for loop

                            //skip to next line
                            System.out.println("");

                        } //end of for loop

                        //print dashes
                        for (int dash = printingCount; dash > 0; dash--) {
                            System.out.print("-");
                        }

                        //skip to next line
                        System.out.println("");

                        //increment printingCount
                        printingCount = printingCount + 2;
                    } //end of for loop

//start using while loop--------------------------------------------------------------

                    System.out.println("Using while loops: ");

                    //create new variables
                    int loop1 = 1;
                    int loop2 = 0;
                    int dash1 = 1;

                    //reassign variables
                    printingCount = 1;

                    //loop the loops according to the input number
                    while (loop1 <= inputNum) {

                        //reassign counting variable
                        count = loop1;

                        //reassign dash variable
                        dash1 = 1;
                        
                        //create a new looping variable
                        int count1 = count;

                        //loop the printing for each line of numbers
                        while (count1 > 0) {

                            //reassign loop2 variable
                            loop2 = printingCount;

                            //loop the printing of the numbers
                            while (loop2 <= printingCount && loop2 > 0) {

                                //print the numbers
                                System.out.print(count);

                                //increment loop2
                                loop2--;

                            } //end of for loop

                            //skip to next line
                            System.out.println("");

                            //increment count
                            count1--;

                        } //end of while loop


                        //print dashes
                        while (dash1 <= printingCount) {
                            System.out.print("-");

                            //increment dash1
                            dash1++;

                        }

                        //skip to next line
                        System.out.println("");

                        //increment printingCount
                        printingCount = printingCount + 2;

                        //increment loop1
                        loop1++;

                    } //end of while loop

//start using do while loop-----------------------------------------------------------

                    System.out.println("Using do while loops: ");

                    //create new variables
                    loop1 = 1;
                    loop2 = 0;
                    dash1 = 1;

                    //reassign variables
                    printingCount = 1;

                    //loop the loops according to the input number
                    do{
                        //reassign counting variable
                        count = loop1;

                        //reassign dash variable
                        dash1 = 1;
                        //create a new looping variable
                        int count1 = count;

                        //loop the printing for each line of numbers
                        do{

                            //reassign loop2 variable
                            loop2 = printingCount;

                            //loop the printing of the numbers
                            do{

                                //print the numbers
                                System.out.print(count);

                                //increment loop2
                                loop2--;

                            } //end of do while loop
                            while(loop2 <= printingCount && loop2 > 0); 

                            //skip to next line
                            System.out.println("");

                            //increment count
                            count1--;

                        }
                        while(count1 > 0);  //end of do while loop


                        //print dashes
                        do{
                            System.out.print("-");

                            //increment dash1
                            dash1++;

                        }
                        while(dash1 <= printingCount); 

                        //skip to next line
                        System.out.println("");

                        //increment printingCount
                        printingCount = printingCount + 2;

                        //increment loop1
                        loop1++;

                    }
                    while (loop1 <= inputNum); //end of do while loop

                } //end of if statement making sure input is a valid int
                else {
                    System.out.println("You did not enter a valid number");
                    return;
                }

            } //end of if statement making sure input is an int
            else {
                System.out.println("You did not enter an int");
                return;
            }

        } //end of main method
} //end of class