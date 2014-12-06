//Maximilian Hasselbusch
//19 November 2014
//CSE2
//lab13
//MultiArrays.java
//This program's purpose is to create random multidimensional arrays and sort them in ascending order

//create the class
public class MultiArrays{
    
    //create the main method
    public static void main(String [] args){
        
        //establish the array length
        int arrayL = 0;
        int newLength = 0;
        
        //allocate the array
        int [] [] array = new int [5][];
        
        //initialize the array rows
        for(int i = 0; i < 5; i++){
            arrayL = (newLength * 3) + 5;
            
            array[i] = new int[arrayL];
            
            for(int j = 0; j < arrayL; j++){
                array[i][j] = (int) (Math.random()*39);
            }
            newLength++;
        }
        
        //reset the variables for array length
        arrayL = 0;
        newLength = 0;
        
        //display the arrays
        System.out.println("Arrays before sorting: ");
        
        for(int k = 0; k < 5; k++){
            
            arrayL = (newLength * 3) + 5;
            
            for(int g = 0; g < arrayL; g++){
                System.out.print(array[k][g] + " ");
            }
            System.out.println("");
            newLength++;
        }
        
        System.out.println("Arrays after sorting: ");
        
        
        
        //sort the arrays
        for(int i = 0; i < 5; i++){
            
            int min = 0;
            int temp = 0;
            
            //check the entire subarray
            for(int k = 0; k < (array[i].length - 1); k++){
                
                //set the minimum index
                min = k;
                
                //check each individual number
                for(int j = k+1; j < (array[i].length); j++){
                    
                    if(array[i][j] < array[i][min]){
                        min = j;
                    }
                    
                }
                
                temp = array[i][min];
                array[i][min] = array[i][k];
                array[i][k] = temp;
                
            }
            
        }
        
        //reset the variables for array length
        arrayL = 0;
        newLength = 0;
        
        //display the sorted arrays
        for(int k = 0; k < 5; k++){
            
            arrayL = (newLength * 3) + 5;
            
            for(int g = 0; g < arrayL; g++){
                System.out.print(array[k][g] + " ");
            }
            System.out.println("");
            newLength++;
        }
    }//end of main method
}//end of class