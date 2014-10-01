//Maximilian Hasselbusch
//30 September 2014
//CSE2
//hw05
//BoolaBoola.java
//This program will randomly create three true or false statements 
//with random choices of && and ||.  The computer will then ask the user
//what the answer is and reply if they are correct.

//import the scanner
import java.util.Scanner;

//create the class
public class BoolaBoola {
    
    //create the main method
    public static void main(String [] args){
        
        //set up the scanner
        Scanner boolaInput = new Scanner(System.in);
        
        //create the three variables for determening true and false
        int rand1 = (int) (Math.random()*2);
        int rand2 = (int) (Math.random()*2);
        int rand3 = (int) (Math.random()*2);
        
        //create variables for the || and &&
        int log1 = (int) (Math.random()*2);
        int log2 = (int) (Math.random()*2);
        
        //define variables
        boolean random1 = true;
        boolean random2 = true;
        boolean random3 = true;
        
        String final2 = "a";
        String final3 = "b";
        
            //switch statement for rand1
            switch (rand1){
                case 0: random1 = true; break;
                case 1: random1 = false; break;
            }//end of switch for rand1
        
            //switch statement for rand2
            switch(rand2){
                case 0: random2 = true; break;
                case 1: random2 = false; break;
            }//end of switch for rand2
        
            //switch statement for rand3
            switch(rand3){
                case 0: random3 = true; break;
                case 1: random3 = false; break;
            }//end of switch for rand3
        
                //find out results of combination of random and logic variables
                
                //if statement if log1 = 0
                if (log1 == 0){
                    if (log2 == 0){
                        boolean final1 = random1 && random2 && random3;
                        
                        //assign strings to final1 if it is true or false
                        if (final1){
                            final2 = "T";
                            final3 = "t";
                        }//end of if above
                        else{
                            final2 = "F";
                            final3 = "f";
                        }//end of else above
                            //ask user for input
                            System.out.print("Does "+ random1 +" && "+ random2 + " && "+ random3 +
                            " have the value true(T/t) or false(F/f)? ");
                        
                            //assign the value to a variable
                            String inputV = boolaInput.next();
                            
                            if (inputV.equals(final2) || inputV.equals(final3)){
                                System.out.println("Correct");
                            }//end of if above
                            else{
                                System.out.println("Incorrect, try again");
                            }//end of else above
                        
                        }//end of if for log 2 == 0
                        
                     if (log2 == 1){
                        boolean final1 = random1 && random2 || random3;
                        
                        //assign strings to final1 if it is true or false
                        if (final1){
                            final2 = "T";
                            final3 = "t";
                        }//end of if above
                        else{
                            final2 = "F";
                            final3 = "f";
                        }//end of else above
                        
                            //ask user for input
                            System.out.print("Does "+ random1 +" && "+ random2 + " || "+ random3 +
                            " have the value true(T/t) or false(F/f)? ");
                        
                            //assign the value to a variable
                            String inputV = boolaInput.next();
                            
                            if (inputV.equals(final2) || inputV.equals(final3)){
                                System.out.println("Correct");
                            }//end of if above
                            else{
                                System.out.println("Incorrect, try again");
                            }//end of else above
                        
                        }//end of if for log 2 == 1   
                        
                    }//end of if for log1 == 0
                if (log1 == 1){
                    if (log2 == 0){
                        boolean final1 = random1 || random2 && random3;
                        
                        //assign strings to final1 if it is true or false
                        if (final1){
                            final2 = "T";
                            final3 = "t";
                        }//end of if above
                        else{
                            final2 = "F";
                            final3 = "f";
                        }//end of else above
                        
                            //ask user for input
                            System.out.print("Does "+ random1 +" || "+ random2 + " && "+ random3 +
                            " have the value true(T/t) or false(F/f)? ");
                        
                            //assign the value to a variable
                            String inputV = boolaInput.next();
                            
                            if (inputV.equals(final2) || inputV.equals(final3)){
                                System.out.println("Correct");
                            }//end of if above
                            else{
                                System.out.println("Incorrect, try again");
                            }//end of else above
                        
                        }//end of if for log 2 == 0
                        
                     if (log2 == 1){
                        boolean final1 = random1 || random2 || random3;
                        
                        //assign strings to final1 if it is true or false
                        if (final1){
                            final2 = "T";
                            final3 = "t";
                        }//end of if above
                        else{
                            final2 = "F";
                            final3 = "f";
                        }//end of else above
                        
                            //ask user for input
                            System.out.print("Does "+ random1 +" || "+ random2 + " || "+ random3 +
                            " have the value true(T/t) or false(F/f)? ");
                        
                            //assign the value to a variable
                            String inputV = boolaInput.next();
                            
                            if (inputV.equals(final2) || inputV.equals(final3)){
                                System.out.println("Correct");
                            }//end of if above
                            else{
                                System.out.println("Incorrect, try again");
                            }//end of else above
                        
                        }//end of if for log 2 == 1   
                        
                    }//end of if for log1 == 1
    }//end of main method
}//end of class