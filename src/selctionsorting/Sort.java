
package selctionsorting;
import java.util.Arrays;

public class Sort {
    
   public  int i , min ,count= 0 ,  k = 1 , index , swap;  //variables declartion
  
   Integer[] array = new Integer[5];     //Declare Array with size[5]
    
   
    public void sortArray()
    {
       for(int counter = 0 ; counter < array.length ; counter++ , count++ , k++)
       {
           
            min = array[count];   //Assign first value of Array
        
        for( i = k ; i < array.length ; i++)  //this for loop is use for find Smallest number in Array
        {
            
            if(min > array[i]) //compare one value with all other in Array
            {
                min = array[i];
            }

        }//closing of for loop
           
        index = Arrays.asList(array).indexOf(min); //to find position of element
        
        swap = array[count];  //assign 1st position value  
        
        array[count] = min ;  //stored smallest number at position[0]
        
        array[index] = swap;  //store swap value at position of smallest number in array
           
        
       }//closing of outer for loop
        
        
    }//closing of sortArray method
    
    
    //this method for Show Array Data 
     public void showArrayData()
       {
           
           for(int i = 0 ; i < array.length ; i++)
           {
               System.out.print("[" +array[i] +"]");
           }
           
       }
   
}//closing of Sort Class
