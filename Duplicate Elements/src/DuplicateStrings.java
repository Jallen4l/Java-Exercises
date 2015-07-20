//Finding a duplicate Interger Using Hash sets

//HashSet extends Set and creates a collection that uses a hash table for storage
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
 
public class DuplicateStrings
{
    public static void main(String[] args)
    {
    	//Create and populate an array with strings
        String[] array = {"one","one","two","three","four","five","six","seven","eight","nine","nine","ten","ten"};
        //Create a hash set in order to iterate (repeat process) the array
        System.out.println("Before Iteration : " + Arrays.toString(array));
        Set<String> set = new HashSet<String>();
        //For each loop which tries to add each value from the array to a HashSet
        for(int i = 0; i < array.length ; i++)
        {
            //If same string is already present then add method will return FALSE
            if(set.add(array[i]) == false)
            {
            	//Print duplicate item found until iteration is complete
                System.out.println("Duplicate element found : " + array[i]);
            }
        }
        System.out.println("After Iteration : " + set + " no order");
    }
}

//A hash set will only allow an element to be added to the set if the element does NOT already exist


