//Maximilian Hasselbusch
//September 23, 2014
//CSE2
//hw04 - CourseNumber
//This program will read an input of a course at Lehigh and output the semester and year of the course

//import the scanner
import java.util.Scanner;

//define the class
public class CourseNumber{
    //add the main method
    public static void main(String [] args){
        //declare an instance of the scanner
        Scanner input;
        //construct the scanner
        input = new Scanner(System.in);
        //ask the user for an input value
        System.out.print("Enter a six digit number giving the course information: ");
        
        //make sure that the input is an int
        if (input.hasNextInt()){
            
            //assign input to a variabel
            int course = input.nextInt();
            
                if ((course >= 186510) && (course <= 201440)){
                    
                    //determine the course year
                    int courseYear = (int) (course / 100);
                    
                    //determine the course semester
                    int courseSemester = course - (courseYear * 100);
                    
                    //start a switch statement
                    switch (courseSemester) {
                        case 10: System.out.println("The course was offered in the spring semester of " +courseYear); break;
                        case 20: System.out.println("The course was offered in the summer 1 semester of " +courseYear); break;
                        case 30: System.out.println("The course was offered in the summer 2 semester of " +courseYear); break;
                        case 40: System.out.println("The course was offered in the fall semester of " +courseYear); break;
                        //if the course number doesnt end in 10, 20, 30 or 40 the follwing is printed
                        default: System.out.println("The course number is not valid (must in in a 10, 20, 30 or 40 to designate the semester)");
                    } //end of switch statement
                    
                } //end of if statement making sure input is within proper range
                
                else{ //else statement if input is outside range
                    System.out.println("The input is outside the allowable range (186510 - 201440)");
                    return;
                }
                
        } //end of if statement making sure that the input is an int
        else{ //else statement if input isn't an int
            System.out.println("The input value is not a positive int");
            return;
            
        } //end of else statement
    
    } //end of main method
    
} //end of class