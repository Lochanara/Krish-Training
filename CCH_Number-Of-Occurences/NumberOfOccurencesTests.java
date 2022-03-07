import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class NumberOfOccurencesTests {

    @Test
    public void sortTest() {

        char[] sequence = {'a','a','b'};
        HashMap<Character, Integer> characterIntegerHashMap = NumberOfOccurences.getOccurences(sequence);
        HashMap<Character, Integer> AssertCharacterIntegerHashMap = new HashMap<Character, Integer>() {{
            put('a', 2);
            put('b', 1);
        }};
        assertEquals(AssertCharacterIntegerHashMap.toString(),characterIntegerHashMap.toString());

    }

    @Test
    public void sortWithOneMissingNumberTest() {

        char[] sequence = {'a','A','b','C','C','c'};
        HashMap<Character, Integer> characterIntegerHashMap = NumberOfOccurences.getOccurences(sequence);
        HashMap<Character, Integer> AssertCharacterIntegerHashMap = new HashMap<Character, Integer>() {{
            put('a', 2);
            put('b', 1);
            put('c', 3);
        }};
        assertEquals(AssertCharacterIntegerHashMap.toString(),characterIntegerHashMap.toString());

    }

    @Test
    public void sortWithMultipleMissingNumberTest() {

        char[] sequence = {'c','c','C','Z','z','q'};
        HashMap<Character, Integer> characterIntegerHashMap = NumberOfOccurences.getOccurences(sequence);
        HashMap<Character, Integer> AssertCharacterIntegerHashMap = new HashMap<Character, Integer>() {{
            put('c', 3);
            put('q', 1);
            put('z', 2);
        }};
        assertEquals(AssertCharacterIntegerHashMap.toString(),characterIntegerHashMap.toString());

    }

}
