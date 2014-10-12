//Maximilian Hasselbusch
//September 24, 2014
//CSE2
//lab05 - RandomGames
//This program will take input from the user declaring their game of choice.  The program will then
//go through processes that simulate either roulette, craps or picking a card.

//import the scanner class
import java.util.Scanner;

//define a class
public class RandomGames{
    
    //add the main method
    public static void main(String [] args){
        
        //construct the scanner
        Scanner gamesInput = new Scanner(System.in);
        
        //ask the user for the input string
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
        
        //assign the value to variable input
        String input = gamesInput.next();
        
        //initialize variables for picking a card
        String cardNumber = "2";
        
        if (input.length() == 1){ 
            
            //make sure the entered value is a string
            switch (input){
                
                //if the user enters an R or r
                case "R": case "r":
                    
                    
                    //calculate the value of the roulette spin
                    int roulleteSpin = (int) (Math.random()*36);
                    
                    if (roulleteSpin == 0){
                        
                        //calculate 0 or 00
                        int roulleteZero = (int) (Math.random()*2);
                        
                        //switch statement for 0
                        switch (roulleteZero){
                            case 0: 
                                System.out.println("0"); break;
                            case 1:
                                System.out.println("00"); break;
                        }//end of switch statement
                    }//end of if statement for roulleteSpin = 0
                    
                    //if roulleteSpin is not 0
                    else{
                        System.out.println(+ roulleteSpin );
                    }
                    
                    //end the program
                    break;
                
                //if the user enters a c or a C
                case "C": case "c":
                    
                    //calculate the results of each roll
                    int roll1 = (int) (Math.random()*6);
                    int roll2 = (int) (Math.random()*6);
                    int totalRoll = roll1 + roll2;
                    
                    //print out the results
                    System.out.println("You rolled a "+ roll1 +" and a "+ roll2 +", totaling "+ totalRoll + ".");
                    
                    //end the program
                    break;
                
                case "P": case "p":
                    
                    //calculate the number for the card
                    int cardNum = (int) (Math.random()*13);
                    int cardSuit = (int) (Math.random()*4) + 1;
                    
                    //switch statement to find out value of card
                    switch (cardNum){
                        case 0: 
                            cardNumber = "an ace"; break;
                        case 1:
                            cardNumber = "a two"; break;
                        case 2:
                            cardNumber = "a three"; break;
                        case 3:
                            cardNumber = "a four"; break;
                        case 4:
                            cardNumber = "a five"; break;
                        case 5:
                            cardNumber = "a six"; break;
                        case 6:
                            cardNumber = "a seven"; break;
                        case 7:
                            cardNumber = "an eight"; break;
                        case 8:
                            cardNumber = "a nine"; break;
                        case 9:
                            cardNumber = "a ten"; break;
                        case 10:
                            cardNumber = "a jack"; break;
                        case 11:
                            cardNumber = "a queen"; break;
                        case 12:
                            cardNumber = "a king"; break;
                    }
                    
                    //switch statement for suits of a card
                    switch (cardSuit){
                        case 1:
                            System.out.println("You picked "+ cardNumber +" of hearts.");
                            break;
                        case 2:
                            System.out.println("You picked "+ cardNumber +" of clubs.");
                            break;
                        case 3:
                            System.out.println("You picked "+ cardNumber +" of spades.");
                            break;
                        case 4:
                            System.out.println("You picked "+ cardNumber +" of diamonds.");
                            break;
                    }//end switch statement
                    
                    //end program
                    break;
                    
                default: System.out.println("You did not enter a valid letter");    
            }//end of switch statement
            
        }//end of if statement making sure input is 1 character long
        else{
            System.out.println("Please enter an input 1 character long");
        } return;
        
    }//end of main method
}//end of class