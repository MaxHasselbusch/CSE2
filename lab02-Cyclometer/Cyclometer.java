//Maximilian Hasselbusch
//September 3, 2014
//CSE2
//Section 112
//This program will be able to print the number of minutes, number of counts, and
//the distance for each trip.  In addition, it will be able to calculate the distance
//for both trips.

//define a class
public class Cyclometer{
    //main method is required for every java program
    public static void main(String[] args) {
        //our input data
        int secsTrip1=480; //seconds for trip 1
        int secsTrip2=3220; //seconds for trip 2
        int countsTrip1=1561; //counts for trip 1
        int countsTrip2=9037; //counts for trip 2
        //our intermediate variables and output data
        double wheelDiameter=27.0, //diameter of the wheel
        PI=3.14159, //value of pi
        feetPerMile=5280, //number of feet in one mile
        inchesPerFoot=12, //number of inches in one foot
        secondsPerMinute=60; //number of seconds in one minute
        double distanceTrip1, distanceTrip2,totalDistance; //distance of trip 1 + distance of trip 2 = total distance
    
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+"minutes and had "
            +countsTrip1+" counts."); 
        //how long trip 1 took and how many counts
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+"minutes and had "
            +countsTrip2+" counts.");
        //how long trip 2 took and how many counts
        //run the calculations; store the values
        //calculating the distance for trip 1 and trip 2 in both inches and miles
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above gives distance in inches
        //(for each count, a rotation of the wheel travels the diameter inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculates distance of trip 2
        totalDistance=distanceTrip1+distanceTrip2; //calculates total distance
        
            //Print out the output data.
            System.out.println("Trip 1 was "+distanceTrip1+" miles"); //distance for trip 1
            System.out.println("Trip 2 was "+distanceTrip2+" miles"); //distance for trip 2
            System.out.println("The total distance was "+totalDistance+" miles"); //total distance for both trips
            
    } //end of main method
} //end of class