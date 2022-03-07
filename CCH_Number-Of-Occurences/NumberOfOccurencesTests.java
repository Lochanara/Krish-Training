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

        char[] sequence = {'a','a','b'};
        HashMap<Character, Integer> characterIntegerHashMap = NumberOfOccurences.getOccurences(sequence);
        HashMap<Character, Integer> AssertCharacterIntegerHashMap = new HashMap<Character, Integer>() {{
            put('a', 2);
            put('b', 1);
        }};
        assertEquals(AssertCharacterIntegerHashMap.toString(),characterIntegerHashMap.toString());

    }

    @Test
    public void sortWithMultipleMissingNumberTest() {

        char[] sequence = {'a','a','b'};
        HashMap<Character, Integer> characterIntegerHashMap = NumberOfOccurences.getOccurences(sequence);
        HashMap<Character, Integer> AssertCharacterIntegerHashMap = new HashMap<Character, Integer>() {{
            put('a', 2);
            put('b', 1);
        }};
        assertEquals(AssertCharacterIntegerHashMap.toString(),characterIntegerHashMap.toString());

    }

    @Test
    public void FindMissingNumberTest() {

        char[] sequence = {'a','a','b'};
        HashMap<Character, Integer> characterIntegerHashMap = NumberOfOccurences.getOccurences(sequence);
        HashMap<Character, Integer> AssertCharacterIntegerHashMap = new HashMap<Character, Integer>() {{
            put('a', 2);
            put('b', 1);
        }};
        assertEquals(AssertCharacterIntegerHashMap.toString(),characterIntegerHashMap.toString());

    }

    @Test
    public void FindMultipleMissingNumberTest() {

        char[] sequence = {'a','a','b'};
        HashMap<Character, Integer> characterIntegerHashMap = NumberOfOccurences.getOccurences(sequence);
        HashMap<Character, Integer> AssertCharacterIntegerHashMap = new HashMap<Character, Integer>() {{
            put('a', 2);
            put('b', 1);
        }};
        assertEquals(AssertCharacterIntegerHashMap.toString(),characterIntegerHashMap.toString());

    }

    @Test
    public void FindNoMissingNumberTest() {

        char[] sequence = {'a','a','b'};
        HashMap<Character, Integer> characterIntegerHashMap = NumberOfOccurences.getOccurences(sequence);
        HashMap<Character, Integer> AssertCharacterIntegerHashMap = new HashMap<Character, Integer>() {{
            put('a', 2);
            put('b', 1);
        }};
        assertEquals(AssertCharacterIntegerHashMap.toString(),characterIntegerHashMap.toString());

    }
}
