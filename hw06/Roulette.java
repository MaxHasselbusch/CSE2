//Maximilian Hasselbusch
//11 October 2014
//CSE2
//hw06
//Roullete.java
//This program will run a simulation 1000 times and count how many times a roullete wheel
//lands on a random number in a series of 100 spins

//create the class
public class Roulette{
    
    //create the main method
    public static void main(String [] args){
    
        //find chosen random number 
        int random = (int) (Math.random()*38);
        
        //create variables for use in loops
        int spinValue = 0;
        int totalWinnings = 0;
        int totalZero = 0;
        int totalPositive = 0;
        
        //create the sentinel values
        int sentinel1 = 1000;
    
        //create a while loop to run the simulation 1000 times
        while(sentinel1 > 0){
        
            //create the variables that will be used over each time the loop
            //loops
            int sentinel2 = 100;
            int numberWins = 0;
            int winnings = 0;
            int numberPositive = 0;
            int numberZero = 0;
            
            //create a while loop to spin the wheel 100 times
            while(sentinel2 > 0){
                spinValue = (int) (Math.random()*38);
                
                //create if statement to check to see if spin is equal to 
                //selected random number
                if (spinValue == random){
                    //add 1 win
                    numberWins+= 1;
                }//end of if statement
                
                //decrement sentinel2
                sentinel2--;
                
            }//end of while loop for sentinel2
            
            //calculate winnings for 100 spins
            winnings = (numberWins * 36);
                
                //check if winnings are greater than 100
                if (winnings > 100){
                    numberPositive += 1;
                }//end of if statement
                //check if random number never comes up
                else if (winnings == 0){
                    numberZero +=1;
                }//end of else if statement
             
            //calculate totals for all three catagories
            totalWinnings = (winnings + totalWinnings);  
            totalZero = (numberZero + totalZero);
            totalPositive = (numberPositive + totalPositive);
            //decrement sentinel1
            sentinel1--;
            
        }//end of loop for sentinel1
        
        
    System.out.println("Number of times walking away with money: " +totalPositive);
    System.out.println("Number of times winning nothing: " +totalZero);
    System.out.println("Total money won for 1000 cycles: $" +totalWinnings);
    }//end of main method
}//end of class