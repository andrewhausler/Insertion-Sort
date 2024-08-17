package code;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Generic Class Insertion Initialization With Implemented AlgorithmBasics
 */
public class Insertion<Type extends Comparable<Type>> implements AlgorithmBasics<Type>
{
    // ArrayList Variable
    private ArrayList<Type> unsortedArray;
    
    // Default Constructor 
    public Insertion()
    {
        unsortedArray = new ArrayList<Type>();
    }

    // Constructor With Already Made Array As Parameter
    public Insertion(ArrayList<Type> unsortedArray)
    {
        this.unsortedArray = unsortedArray;
    }

    /**
     * Sorting Method Which Sorts The Array Using Insertion Sort
     * @return returns the object
     */
    public Insertion<Type> sort()
    {
        
        Type key;
        int j;
        for(int i=1; i<unsortedArray.size(); i++)
        {
            // The Furthest Index To The Right Of The Already Sorted Portion
            j = i-1;
            // The Value We Want To Add To The Already Sorted Portion
            key = unsortedArray.get(i);

            // This While Loop Keeps Checking The Already Sorted Portion To Determine Where Key Should Be Placed
            while(j>=0 && key.compareTo(unsortedArray.get(j)) == -1)
            {
                // Keeps Shifting Any Value Greater Than Key To The Right
                unsortedArray.set(j+1, unsortedArray.get(j));
                // Allows Us To Keep Comparing To The Left
                j-=1;
            }
            // Finally We Place The Key In Its Correct Spot
            unsortedArray.set(j+1, key);
        }
        return this;
    }

    /**
     * Gives Access To Private ArrayList
     * @return returns the arraylist
     */
    public ArrayList<Type> getUnsortedArray()
    {
        return unsortedArray;
    }

    /**
     * Add Another Value To The ArrayList
     * @param value the value to be added
     */
    public void addUnsortedArray(Type value)
    {
        unsortedArray.add(value);
    }

    public ArrayList<Type> getArray()
    {
        return unsortedArray;
    }

    /**
     * Displays The Array Instead Of Memory Address
     * @return returns the array as a string
     */
    public String toString()
    {
        return String.valueOf(unsortedArray);
    }

    // Main Method
    public static void main(String[] args)
    {
        Insertion<Integer> newInsertion = new Insertion<Integer>(new ArrayList<Integer>(Arrays.asList(12, 2, 5, 1, 6, 2, 10)));
        System.out.println("Unsorted: " + newInsertion.getUnsortedArray());
        newInsertion.sort();
        System.out.println("Sorted: " + newInsertion.getUnsortedArray());
    }
    
}