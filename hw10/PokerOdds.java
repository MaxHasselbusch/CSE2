//Maximilian Hasselbusch
//18 November 2014
//CSE2
//hw10
//PokerOdds.java
//This program will generate a random poker hand and then simulate 10000 hands
//and count the number of times that a hand with a pair of a specific rank occurs,

//import the Random object
import java.util.Random;

//import the scanner
import java.util.Scanner;

//create the class
public class PokerOdds {

  //showHands method
  public static void showHands() {

      //create the scanner
      Scanner scan = new Scanner(System.in);

      //initialize the variable to see if user wants to go again
      String answer = " ";

      //loop the entire process
      do {

        //generate the "deck"
        int[] deck = new int[52];

        for (int i = 0; i < deck.length; i++) {
          deck[i] = i;
        }

        //generate the array for the ranks
        String[] ranks = {
          "ace", "king", "queen", "jack", "ten", "nine", "eight", "seven", "six", "five", "four", "three", "two"
        };

        //generate the array for the suits
        String[] suits = {
          "clubs", "diamonds", "hearts", "spades"
        };



        //generate the hand
        int[] hand = new int[5];

        for (int i = 0; i < hand.length; i++) {
          hand[i] = -1;
        }

        int cardDrawn = 0;
        int temp = 0;
        int countDown = 1;

        //draw the cards
        for (int i = 0; i < hand.length; i++) {

          cardDrawn = (int)(Math.random() * (deck.length - countDown));

          hand[i] = deck[cardDrawn];

          temp = deck[deck.length - countDown];

          deck[cardDrawn] = -1;

          deck[deck.length - countDown] = deck[cardDrawn];

          deck[cardDrawn] = temp;

          countDown++;

          //display the cards
          System.out.println("You drew " + ranks[hand[i] % 13] +
            " of " + suits[hand[i] / 13] + ".");
        }
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        answer = scan.next();

      } while (answer.equals("Y") || answer.equals("y"));

    } //end of showHands method

  //simulateOdds method
  public static void simulateOdds() {

      //create the array for the frequency of pairs
      double[] frequency = new double[13];

      for (int i = 0; i < frequency.length; i++) {
        frequency[i] = 0.0;
      }

      //generate the array for the ranks
      String[] ranks = {
        "ace", "king", "queen", "jack", "ten", "nine",
        "eight", "seven", "six", "five", "four", "three", "two"
      };

      int counter = 0;
      int notCounter = 0;

      for (int i = 0; i < 10000; i++) {

        //generate the "deck"
        int[] deck = new int[52];

        for (int t = 0; t < deck.length; t++) {
          deck[t] = t;
        }

        //generate the hand
        int[] hand = new int[5];

        for (int k = 0; k < hand.length; k++) {
          hand[k] = -1;
        }

        int cardDrawn = 0;
        int temp = 0;
        int countDown = 1;

        //draw the cards
        for (int f = 0; f < hand.length; f++) {

          cardDrawn = (int)(Math.random() * (deck.length - countDown));

          hand[f] = deck[cardDrawn];

          temp = deck[deck.length - countDown];

          deck[cardDrawn] = -1;

          deck[deck.length - countDown] = deck[cardDrawn];

          deck[cardDrawn] = temp;

          countDown++;

        }

        int control = 1;
        int internalCounter = 0;

        //check the see if there are any duplicates
        for (int p = 0; p < hand.length; p++) {

          for (int j = control; j < hand.length; j++) {

            if (hand[p] % 13 == hand[j] % 13) {
              internalCounter += 1;
            } //end of if statement

          } //end of for loop

          control++;
        }

        if (internalCounter != 1) {
          notCounter += 1;
        }

        //if there only is one pair, do the same thing again to isolate it
        else {
          //reset control to 0
          control = 0;

          for (int p = 0; p < hand.length; p++) {

            for (int j = control; j < hand.length; j++) {

              if (hand[p] % 13 == hand[j] % 13) {

                frequency[hand[j] % 13] += .2;
                break;

              } //end of if statement

            } //end of for loop
            control++;

          } //end of for statement

        } //end of else statement

      } //end of for loop

      //print the results
      System.out.println("------------------------");
      System.out.println("Total with pairs:");
      System.out.println("Rank \t Frequency");

      for (int x = 0; x < ranks.length; x++) {

        System.out.print(ranks[x] + "\t" + Math.round(frequency[x]));
        System.out.println("");
      }

      System.out.println("------------------------");
      System.out.println("Total without pairs: " + notCounter);

    } //end of simulate odds method

  //create the main method
  public static void main(String[] arg) {

      //invoke showHands
      showHands();

      //invoke simulateOdds
      simulateOdds();

    } //end of main method
} //end of class