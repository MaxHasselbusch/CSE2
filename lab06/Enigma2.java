import java.util.Scanner;

public class Enigma2{
  
  public static void main(String [] arg){
    
    int n=40,k=60;
    
    String out="";
    
    switch(n){
      case 12: 
      case 13: out+="13";
      case 40: out+="40/0";
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *  
 *  The java.lang execption says that the error is dividing by zero.  In line 14, the value of 40
 *  is being divided by 0.  By changing the types of values from numbers to a string in line 13 and 14, 
 *  the system was able to print out the correct value.
 * 
 */
