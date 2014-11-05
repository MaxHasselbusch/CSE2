//Maximilian Hasselbusch
//4 November 2014
//CSE2
//hw09
//BlockedAgain.java
//This program's purpose is to create a sequence of methods used to solve a larger
//problem by breaking it into smaller ones

//import the scanner
import java.util.Scanner;

//create the class
public class BlockedAgain{
    
//create the methods
    
//Method getInt-----------------------------------------------------------------
    public static int getInt(){
        
        //initialize input
        int input = 0;
        
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //ask for input
        System.out.print("Enter an int between 1 and 9, inclusive: ");
        
        //invoke checkInt
        boolean case1 = checkInt(scan);
        
        //check the return value of checkInt
        if(case1 == true){
            
            //if it is good, continue
            input = scan.nextInt();   
        }
        else{
            //if not, repeat process
            System.out.println("You did not enter an int, please try again");
            input = getInt();

        }
        
        //invoke checkRange
        int input1 = checkRange(input);
        
        //check the return value of checkRange
        if(input1 == 1){
            
            //if it is good, return input
            return input;
        }
        else{
            //if it is not, repeat the process
            System.out.println("The int is out of the allowable range, try again");
            input = getInt();
            return input;
        }

    }//end of getInt

//Method checkInt---------------------------------------------------------------
    public static boolean checkInt(Scanner scan){
        
        //make sure user inputed int
        if(scan.hasNextInt()){
            
            //return true
            return true;
        }
        else{
            
            //if not, return false
            return false;
        }
    }//end of checkInt
    
//Method checkRange-------------------------------------------------------------  
    public static int checkRange(int a){
        
        //assign input to a variable
        int input2 = a;
        
        //check to make sure input is between 0 and 9
        if(a >= 0 && a <= 9){
            return 1;
        }
        else{
            return 2;
        }
  
    }//end of checkRange

//Method allBlocks--------------------------------------------------------------
    public static void allBlocks(int x){
        
        //skip to next line
        System.out.println("");
        
        //invoke block()
        block(x);
        
    }

//Method block------------------------------------------------------------------
    public static void block(int x){
        
        //create variable to keep track of number of numbers printed per line
        int y = 1;
        
        //print the proper number of blocks
        for(int i = 1; i <= x; i++){
            
            //invoke line
            line(i, y);
            
            //increment y
            y += 2;
        }

    }

//Method line-------------------------------------------------------------------
    public static void line(int x, int y){
        
        //print out the proper number of lines
        for(int input = x; input > 0; input--){
            
            //print out the proper number of numbers per line
            for(double j = y; j > 0; j--){
            
            System.out.print(x);
            }
            
            System.out.println("");
        }
        
        //print the dashes
        for(double input = y; input > 0; input--){
            System.out.print("-");
        }
        
        System.out.println("");
    }
    
//Main Method-------------------------------------------------------------------

    //create the main method
    public static void main(String []s){
        
        //create integer m
        int m;
        
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 

        //invoke the allBlocks method
        allBlocks(m);
        
    }//end of main method
}//end of class
