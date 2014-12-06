//Maximilian Hasselbusch
//5 December 2014
//CSE2
//hw11
//MatrixSorter.java
//This program will create a 3d array then find the minumum value and sort the third
//slab

//import the scanner
import java.util.Scanner;

//create the class
public class MatrixSorter {

    //create the main method
    public static void main(String args[]) {
            
            //create the mat3d array
            int mat3d[][][];
            
            //invoke buildMat3d to initialize it
            mat3d = buildMat3d();
            
            //invoke mat3d to show it
            show(mat3d);
            
            
            System.out.println("The smallest entry in the 3D matrix is " +
                
                //find the minimum value of the entire array
                findMin(mat3d));

            System.out.println("After sorting the 3rd matrix we get");

            //sort the array
            sort(mat3d[2]);

            //show the array
            show(mat3d);

        } //end of main method

    //create the buildMat3d method
    public static int[][][] buildMat3d() {

            int array1[][][] = new int[3][20][20];

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < (3 + (2 * i)); j++) {

                    for (int k = 0;
                        (k < (j + i + 1)); k++) {
                        array1[i][j][k] = (int)(1 + (Math.random() * 99));
                    }

                }

            }
            return array1;

        } //end of buildMat3d method

    //create show method
    public static void show(int array[][][]) {

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < (3 + (2 * i)); j++) {


                    for (int k = 0;
                        (k < (j + i + 1)); k++) {
                        System.out.print(array[i][j][k] + " ");
                    }
                    System.out.println("");

                }
                System.out.println("");
            }
        } //end of show method

    //create find min method
    public static int findMin(int array[][][]) {

            int min = array[0][0][0];

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < (3 + (2 * i)); j++) {

                    for (int k = 0;
                        (k < (j + i + 1)); k++) {
                        if (array[i][j][k] < min) {
                            min = array[i][j][k];
                        }
                    }
                }
            }
            return min;
        } //end of findMin method

    //create the sort method
    public static void sort(int array[][]) {

        int count = 3;

        //sort the array
        for (int i = 0; i < 7; i++) {

            //check the entire subarray
            for (int k = 0; k < (count); k++) {

                //set the minimum index
                int minIndex = k;
                int min = array[i][k];

                //check each individual number
                for (int j = k + 1; j < (count); j++) {

                    if (min > array[i][j]) {
                        min = array[i][j];
                        minIndex = j;
                    }

                }

                if (minIndex != k) {
                    array[i][minIndex] = array[i][k];
                    array[i][k] = min;
                }

            }
            count++;
        }

    } //end of sort method

} //end of class