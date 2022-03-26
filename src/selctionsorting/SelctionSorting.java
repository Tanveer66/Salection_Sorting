
package selctionsorting;


public class SelctionSorting {

   
    public static void main(String[] args) {
        
        //Create object of Sort Class
        Sort arr = new Sort();
        
        //Assign values to Array by Object
        arr.array[0] = 3 ;
        
        arr.array[1] = 2 ;
        
        arr.array[2] = 1 ;
        
        arr.array[3] = 4 ;
        
        arr.array[4] = 5 ;
        
         System.out.println("Unsorted Array :");
         arr.showArrayData();   //method calling
        
         arr.sortArray(); //call this method to Sort the unsorted Data 
        
         System.out.println("\nSorted Array :");
         arr.showArrayData();
        
         System.out.println("\n");
    }
    
}
