package code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.ArrayList;

public class InsertionTesting
{
    @Test
    public void testInsertion()
    {
        Insertion<Integer> myInsertion = new Insertion<Integer>(new ArrayList<Integer>(Arrays.asList(3, 6, 2, 7, 2, 4, 11, 10, -1)));
        ArrayList<Integer> preSortedInsertion = new ArrayList<Integer>(Arrays.asList(-1, 2, 2, 3, 4, 6, 7, 10, 11));
        myInsertion.sort();
        assertEquals(preSortedInsertion, myInsertion.getArray());
    }
}