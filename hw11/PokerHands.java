//Maximilian Hasselbusch
//5 December 2014
//CSE2
//hw11
//PokerHands.java
//This program will prompt the user to enter a five card hand, print it out,
//then print out the rank of the hand.

//import the scanner
import java.util.Scanner;

//create the class
public class PokerHands {

    //create the main method
    public static void main(String args[]) {

        //create arrays to store values of the hand
        int[] cards = new int[52];
        int[] ranks = new int[13];
        int[] hand = new int[5];

        //initialize the arrays
        for (int i = 0; i < cards.length; i++) {
            cards[i] = 0;
        }
        for (int j = 0; j < hand.length; j++) {
            hand[j] = 0;
        }
        for (int k = 0; k < ranks.length; k++){
            ranks[k] = 0;
        }

        //create variables to control the following for loop
        int suitValue = 0;
        int rankValue = 0;
        int cardValue = 0;

        //create a for loop to get the cards from the user
        for (int j = 0; j < 5; j++) {
            suitValue = getSuit();
            cardValue = getRank(suitValue);
            cards[cardValue] = cards[cardValue] + 1;
            
            //go through this loop if a card was already entered
            while (cards[cardValue] > 1) {

                System.out.println("You already entered that card, try again");
                suitValue = getSuit();
                cardValue = getRank(suitValue);
                cards[cardValue] = cards[cardValue] + 1;
                
            }//end of while loop
            
            hand[j] = cardValue;
            
        }//end of for loop
        
        //invoke showOneHand to display the chosen hand
        showOneHand(hand);
        
        //enter hand values into an array to count frequency of rank
        for(int i = 0; i < hand.length; i++){
            ranks[(hand[i] % 13)] += 1;
        }
        
        //enter frequency of the frequencies into a new array
        int [] freqArray = new int[5];

        for(int i = 0; i < freqArray.length; i++){
            for(int j = 0; j < ranks.length; j++){
                if(ranks[j] == i){
                    freqArray[i] += 1;
                }
            }
        }

    } //end of main method

    //create the getHand method
    public static int getSuit() {

        //create the scanner
        Scanner myScan = new Scanner(System.in);

        System.out.print("Enter the suit: 'c', 'd', 'h', or 's' - ");

        int suitValue = 0;

        String input = myScan.next();

        if (input.equals("c") || input.equals("d") || input.equals("h") || input.equals("s")) {

            if (input.equals("c")) {
                suitValue = 1;
            }
            else if (input.equals("d")) {
                suitValue = 2;
            }
            else if (input.equals("h")) {
                suitValue = 3;
            }
            else if (input.equals("s")) {
                suitValue = 4;
            }

            return suitValue;
        }

        System.out.println("You didn't enter a valid input, try again - ");

        return getSuit();

    }

    //create the getRank method
    public static int getRank(int suit) {

        //create the scanner
        Scanner myScan = new Scanner(System.in);

        System.out.print("Enter the rank: 'a', 'k', 'q', 'j', '10', ...'2'- ");

        int cardNum = 0;
        int newSuit = (suit - 1) * 13;
        String input = myScan.next();

        if (input.equals("a") || input.equals("k") || input.equals("q") || input.equals("j")) {
            if (input.equals("a")) {
                cardNum = 0;
            }
            else if (input.equals("k")) {
                cardNum = 1;
            }
            else if (input.equals("q")) {
                cardNum = 2;
            }
            else if (input.equals("j")) {
                cardNum = 3;
            }
            cardNum = cardNum + newSuit;
            return cardNum;
        }
        int realInput = Integer.parseInt(input);
        if (realInput > 1 && realInput < 11) {
            cardNum = realInput + 2;
            cardNum = cardNum + newSuit;
            return cardNum;
        }

        System.out.println("You didn't enter a valid input, try again - ");
        cardNum = getRank(suit);
        return cardNum;
    }

    //create the showOneHand method
    public static void showOneHand(int hand[]) {

            //create two strings with the suits and the values of the cards
            String suit[] = {
                "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
            };
            String face[] = {
                "A ", "K ", "Q ", "J ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ",
                "8 ", "9 ", "10 "
            };

            //create the output string   
            String out = "";

            //start a for loop for the suits
            for (int s = 0; s < 4; s++) {
                out += suit[s];

                //start a for loop for the ranks
                for (int rank = 0; rank < 13; rank++) {

                    //start a for loop to evaulate each card
                    for (int card = 0; card < 5; card++) {

                        //check the value of the card
                        if (hand[card] / 13 == s && hand[card] % 13 == rank) {
                            out += face[rank];
                        } //end of if statement

                    } //end of loop

                    //move to the next line 

                } //end of loop
                out += '\n';

            } //end of loop

            //print out the hand
            System.out.println(out);

        } //and of showOneHand method

} //end of class