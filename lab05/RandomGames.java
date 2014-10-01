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
        char input = (char) gamesInput.next();
        
        //make sure the entered value is a string
        switch (input){
            case 'R':
            case 'r':
            case 'C':
                int roll1 = (int) Math.random()*6;
                System.out.println(+roll1);
            case 'c':
            case 'P':
            case 'p':
            default: System.out.println("You did not enter a valid letter");    
        }
    }//end of main method
}//end of class
