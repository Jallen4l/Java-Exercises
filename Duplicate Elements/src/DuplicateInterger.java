//Finding a duplicate Interger Using Hash sets

//HashSet extends Set and creates a collection that uses a hash table for storage
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
 
public class DuplicateInterger
{
    public static void main(String[] args)
    {
    	//Create and populate an array with intergers
        int[] array = {1,1,2,3,4,5,6,7,8,9,9,10,10};
        //Create a hash set in order to iterate (repeat process) the array
        Set<Integer> set = new HashSet<Integer>();
        //For each loop which tries to add each value from the array to a HashSet
        System.out.println("Before Iteration : " + Arrays.toString(array));
        for(int i = 0; i < array.length ; i++)
        {
            //If same integer is already present then add method will return FALSE
            if(set.add(array[i]) == false)
            {
            	//Print duplicate item found until iteration is complete
                System.out.println("Duplicate element found : " + array[i]);
                
                
            }
            
        }
        System.out.println("After Iteration : " + set);
    }
}

//A hash set will only allow an element to be added to the set if the element does NOT already exist


