//create the class
public class MethodCalls{
    
    //create addDigit method
    public static int addDigit( int x, int y){
        
        //if x is negative
        if(x < 0){
            
            int newX = x * -1;
            
            String input1 = Integer.toString(newX);
            String input2 = Integer.toString(y);
        
            String output = input2 + input1;
        
            int output1 = Integer.parseInt(output) * -1;
        
            return output1;
        }
        
        //if y is negative
        if(y < 0){
            
            int newY = y * -1;
            
            String input1 = Integer.toString(x);
            String input2 = Integer.toString(newY);
        
            String output = input2 + input1;
        
            int output1 = Integer.parseInt(output) * -1;
        
            return output1;
            
        }
        
        //if neither are negative
        else{
            
            String input1 = Integer.toString(x);
            String input2 = Integer.toString(y);
        
            String output = input2 + input1;
        
            int output1 = Integer.parseInt(output);
        
            return output1;
        }
    }
    
    //create join method
    public static int join( int x, int y){
        
        int output = addDigit(y, x);
        
        return output;
   
    }

    //create the main method
    public static void main(String []  arg){
        
        //create variables
        int a=784,b=22,c;
        
        //invoke addDigit method
        c=addDigit(a,3);
        
        //print out the results
        System.out.println("Add 3 to "+a+" to get "+c);
        
        //invoke addDigit method again
        c=addDigit(addDigit(c,4),5);
        
        //print out the results
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        
        //print the results of addDigit with -98 and 3
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        
        //invoke join
        c=join(a,b);
        
        //print out the results
        System.out.println("Join "+a+" to "+b+" to get "+c);
        
        //invoke join and then use join with that
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        
        //print out the results of join with -9 and -90
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
        
        
   
        
    }
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
