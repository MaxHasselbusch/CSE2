//Maximilian Hasselbusch
//October 11, 2014
//CSE2
//lab07 - LoopTheLoop
//This program will use while loops and break statements to loop loops.

//import the scanner
import java.util.Scanner;

    //make a class
    public class LoopTheLoop{
        
        //make the main method
        public static void main(String [] arg){
            
            //declare the scanner
            Scanner starScanner = new Scanner(System.in);
            
            //initialize variables
            String star = "";
            int nStars = -1;
            
            //ask user for imput
            System.out.print("Enter number of stars in the range of 1-15: ");
            
            //check to make sure that the input is an int
            if(starScanner.hasNextInt()){
                
                //assign input to a variable
                nStars = starScanner.nextInt();
                
                    //create while loop for printing stars
                        while((nStars > 0) && (nStars <= 15));{
                            System.out.print("*");
                            nStars--;
                            
                        }//end of while loop
                        
                        //skip to new line
                        System.out.println("");
           
                        //start second while loop
                        while(nStars > 0){
                            star+="*";
                            System.out.println(star);
                            nStars--;
                        }//end of second while loop 
                    }//end of if statement
                    
                    else{
                        System.out.println("You did not enter a valid int");
                        return;
                    }//end of else statement
                    
            }//end of if statement checking if input is an int
            else{
                System.out.println("You did not enter a valid number");
                return;
            }
                
        }//end of main method
        
    }//end of class