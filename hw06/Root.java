//Maximilian Hasselbusch
//12 October 2014
//CSE2
//hw06
//Root.java
//This program will take an input from the user and output a very close approximation of the square root of that number.  

//input the scanner class
import java.util.Scanner;

//create the class
public class Root{
    
    //create the main method
    public static void main(String [] args){
        
        //create an instance of the scanner
        Scanner rootScanner = new Scanner(System.in);
        
        //ask user for input
        System.out.print("Enter a double greater than 0 to get its square root: ");
        
            //check to make sure that input is a double
            if (rootScanner.hasNextDouble()){
                
                //assign input to a variable
                double root = rootScanner.nextDouble();
                
                //make sure input is greater than zero
                if (root > 0){
                    
                    //create variables
                    double high = (1 + root);
                    double low = 0;
                    double middle = 0;
                    double newHigh = high;
                    double newLow = low;
                    double squareRoot = 0;
                    
                        //create a while loop to find the square root
                        while ((newHigh - newLow) >= .00000001*(high)){
                        
                            //create an if statement to keep high and low in check
                            if ((newLow * newLow) < root && (newHigh * newHigh) > root){
                              
                              //calculte middle
                              middle = ((newHigh + newLow) / 2);
                              
                              
                              //create an if statement to find out if middle is greater than root
                              if (middle * middle > root){
                                  
                                  //newHigh is now equal to middle
                                  newHigh = middle;
                              }
                              //if middle is less than high
                              else{
                                  
                                  //newLow is now equal to middle
                                  newLow = middle;
                              }
                            }
                            //end of if statement
                            
                        squareRoot = middle;
                            
                        }//end of while loop
                        
                        
                        System.out.println("The square root of "+ root +" is " + squareRoot);
                        
                        
                }//end of if statement making sure that input is greater than 0
                else{
                    System.out.println("The input is not greater than 0.  Try again.");
                    return;
                }//end of else statement
                
            
            
            }//end of if statement making sure that input is a double
            else{ //if input is not a double
                System.out.println("The value you entered is not a double.  Try again.");
                return;
            }//end of else statement
        
        
        
    }//end of main method
    
}//end of class