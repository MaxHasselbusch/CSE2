//Maximilian Hasselbusch
//12 November 2014
//CSE2
//lab12
//ArrayMath.java
//This program's purpose is to perform various mathematical functions on arrays

//create the class
public class ArrayMath {
    
    //create the main method
    public static void main(String[] arg) {
        
        //define 5 arrays
        double x[] = {
                2.3, 3, 4, -2.1, 82, 23
            },
            y[] = {
                2.3, 3, 4, -2.1, 82, 23
            },
            z[] = {
                2.3, 13, 14
            },
            w[] = {
                2.3, 13, 14, 12
            },
            v[],
            u[] = {
                2.3, 12, 14
            };
        
        //add arrays x and y together to create array v
        v = addArrays(x, y);
        
        //display the results
        System.out.println(display(x) + " \n  + " + display(y) + "\n   = " + display(v));
        System.out.println(display(x) + " \n  + " + display(z) + "\n   = " + display(addArrays(x, z)));
        System.out.println("It is " + equals(x, y) + " that " + display(x) +
            " == " + display(y));
        System.out.println("It is " + equals(z, w) + " that " + display(z) +
            " == " + display(w));
        System.out.println("It is " + equals(u, z) + " that " + display(u) +
            " == " + display(z));

    }//end of main method
    
    //display method
    public static String display(double[] x) {
        String out = "{";
        for (int j = 0; j < x.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += x[j];
        }
        return out + "}";
    }//end of display method
    
    //addArrays method
    public static double[] addArrays(double [] input, double [] input2){
        
        //create a new array
        double [] totalArray = new double [input.length];
        
        int lengthDiff = input.length;
        
        //if one array is shorter than the other, find the differece in length
        if(input.length > input2.length){
            lengthDiff = (input.length - input2.length);
        }
        
        //add the arrays
        for(int i = 0; i < lengthDiff; i++){
            totalArray[i] = input[i] + input2[i];
        }
        //add the parts of the arrays that arent equal in length
        if(input.length > input2.length){
            for(int j = lengthDiff; j < input.length; j++){
                totalArray[j] = input[j] + 0;
            }
        }
        //return the final array
        return totalArray;
        
        
    }//end of addArrays method
    
    //equals method
    public static boolean equals(double [] input, double [] input2){
        
        //verify that the inputted arrays are of the same length
        if((input.length > input2.length) || (input2.length > input.length)){
            return false;
        }
        
        //check to see if the arrays are equal
        for(int i = 0; i < input.length; i++){
            if(input[i] != input2[i]){
                return false;
            }
        }
        return true;
    }//end of equals method
}//end of class
