import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MissingNumberTests {

    @Test
    public void sortTest() {

        int[] sequence = {2,3,1};
        MissingNumber.sortArray(sequence);
        assertEquals(Arrays.toString(new int[]{1,2,3}),Arrays.toString(sequence));

    }

    @Test
    public void sortWithOneMissingNumberTest() {

        int[] sequence = {2,3,1,5};
        MissingNumber.sortArray(sequence);
        assertEquals(Arrays.toString(new int[]{1,2,3,5}),Arrays.toString(sequence));

    }

    @Test
    public void sortWithMultipleMissingNumberTest() {

        int[] sequence = {2,3,1,9,11,7};
        MissingNumber.sortArray(sequence);
        assertEquals(Arrays.toString(new int[]{1,2,3,7,9,11}),Arrays.toString(sequence));

    }

    @Test
    public void FindMissingNumberTest() {

        int[] sequence = {2,3,1,5};
        MissingNumber.sortArray(sequence);
        String Message = MissingNumber.findMissingNumber(sequence);
        assertEquals("Missing number is 4" , Message);

    }

    @Test
    public void FindMultipleMissingNumberTest() {

        int[] sequence = {2,3,1,5,7};
        MissingNumber.sortArray(sequence);
        String Message = MissingNumber.findMissingNumber(sequence);
        assertEquals("More than 1 missing number" , Message);

    }

    @Test
    public void FindNoMissingNumberTest() {

        int[] sequence = {2,3,1,5,4};
        MissingNumber.sortArray(sequence);
        String Message = MissingNumber.findMissingNumber(sequence);
        assertEquals("Missing numbers could be 0 or 6" , Message);

    }
}
