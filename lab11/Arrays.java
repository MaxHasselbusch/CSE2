//Maximilian Hasselbusch
//5 November 2014
//CSE2
//lab11
//Arrays.java
//This program's purpose is to create an array then store ints within it
//and sort them.

//import the scanner
import java.util.Scanner;

//class
public class Arrays {

    //main method
    public static void main(String[] args) {

            //allocate the array
            int[] array1 = new int[10];

            //create a scanner
            Scanner myScanner = new Scanner(System.in);

            int input = 0;

            //get input from the user-------------------------------------------
            System.out.print("Enter 10 ints - ");

            for (int i = 0; i < 10; i++) {
                input = myScanner.nextInt();
                array1[i] = input;
            }

            //find the minimum of the array entries-----------------------------
            int min = array1[0];

            for (int k = 1; k < 10; k++) {
                if (array1[k] < min) {
                    min = array1[k];
                }
            }
            System.out.println("Minimum: " + min);

            //find the maximum of the array entries-----------------------------
            int max = array1[0];

            for (int k = 1; k < 10; k++) {
                if (array1[k] > max) {
                    max = array1[k];
                }
            }
            System.out.println("Maximum: " + max);

            //find the sum of the array entries---------------------------------
            int sum = 0;

            for (int j = 0; j < array1.length; j++) {
                sum += array1[j];
            }
            System.out.println("Sum: " + sum);
            
            
            //copy the contents of the array into a new one---------------------
            int [] array2 = new int[10];
            
            for(int y = 0; y < array2.length; y++){
                array2[y] = array1[y];
            }
            
            //print out the contents of the array-------------------------------
  
            for(int x = 0; x < array1.length; x++){

                System.out.print(array1[x] + "\t" + array2[9 - x]);
                System.out.println("");
            }

        } //end of main method
} //end of class