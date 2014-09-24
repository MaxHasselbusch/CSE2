//Maximilian Hasselbusch
//September 23, 2014
//CSE2
//hw04 - TimePadding
//This program will read an input of the number of seconds that have passed in a day
//and output the current conventional time.

//import the scanner
import java.util.Scanner;

//define the class
public class TimePadding{
    //add the main method
    public static void main(String [] args){
        //declare an instance of the scanner
        Scanner timeInput;
        //construct the scanner
        timeInput = new Scanner(System.in);
        
        //ask the user for the input of seconds
        System.out.print("Enter the time in seconds: ");
        
        //make sure that the input is an int
        if (timeInput.hasNextInt()){
            
            //assign the input to a variable
            int timeSeconds = timeInput.nextInt();
            
            //find current minutes
            int timeMinutes = (timeSeconds / 60);
            int currentMinutes = (timeMinutes % 60);
            
            //find current hours
            int timeHours = (timeMinutes / 60);
            int currentHours = (timeHours % 24) % 24;
            
            //find current seconds
            int currentSeconds = (timeSeconds % 60);
            
            //make sure input is positive
            if (timeSeconds > 0){
            //if the seconds and minutes do not need to be adjusted
            if ((currentSeconds >= 10) && (currentMinutes >= 10) && (currentHours <= 12)){
                System.out.println("Current time is: " +(currentHours)+ ":" +currentMinutes+
                ":" +currentSeconds);
            }
            else if((currentSeconds < 10) && (currentMinutes < 10) && (currentHours <= 12)){
                System.out.println("Current time is: " +(currentHours)+ ":0" +currentMinutes+
                ":0" +currentSeconds);
            }
            if(currentHours > 12){
                int newCurrentHours = (currentHours - 12);
                System.out.println("Current time is: " +(newCurrentHours)+ ":0" +currentMinutes+
                ":0" +currentSeconds);
            }
            } //end of if statement making sure the input is positive
            
            else { //else statement that prints if the input is negative
                System.out.println("The number entered must be a positive int");
                return;
            }
            
        } //end of if statement making sure that the input is an int
        else { //else statement that prints if the input is not an int
            System.out.println("The number entered must be a positive int");
            return;
        }
        
    } //end of main method
    
} //end of class