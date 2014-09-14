//Maximilian Hasselbusch
//September 13, 2014
//CSE2
//hw03
//Program 1 - Bicycle

//import the scanner
import java.util.Scanner;

//define a class
    public class Bicycle{
        //add a main method
        public static void main(String [] args) {
            //Declare an instnace of the scanner
            Scanner myScanner;
            //Construct an instance of the scanner
            myScanner=new Scanner (System.in);
            
            //prompt user to enter values (counts)
            System.out.print("Enter the number of counts on the cyclometer (as an integer >0): ");
            //accept the input from above
            int nCounts=myScanner.nextInt();
            //prompt user for more values (seconds)
            System.out.print("Enter the number of seconds the trip took (as an integer >0): ");
            int nSeconds=myScanner.nextInt();
            
            //diameter of wheel in inches
            double wheelDiameter=27.0;
            //enter value of pi
            double PI=3.14159;
            //enter value of other variables
            int feetPerMile=5280;
            int inchesPerFoot=12;
            int secondsPerMinute=60;
            
            //calculate distance for the trip in miles
            double tripDistance=(nCounts*wheelDiameter*PI)/(inchesPerFoot*feetPerMile);
            //calculate total time for the trip in minutes
            double tripTime=(nSeconds/secondsPerMinute);
            //calculate average speed in miles per hour
            double avgSpeed=(tripDistance/(tripTime/60));
            //round values
            tripDistance=(double) Math.round(tripDistance*100)/100;
            avgSpeed=(double) Math.round(avgSpeed*100)/100;
            tripTime=(double) Math.round(tripTime*100)/100;
            
                //Print out the data
                System.out.println("The distance traveled was "+tripDistance+ " miles and the total time was " +tripTime+" minutes.");
                System.out.println("The average speed for this trip was "+avgSpeed+ " miles per hour.");
            
            
        }
    }