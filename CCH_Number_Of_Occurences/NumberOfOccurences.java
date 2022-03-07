import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class InvalidSequenceException extends Exception{

    private String invalidSequence;

    public InvalidSequenceException(String invalidSequence) {

        this.invalidSequence = invalidSequence;

    }

    public String getInvalidSequence() {

        return invalidSequence;

    }

}

public class NumberOfOccurences {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char[] sequence = {};

        try {

            sequence = getSequence();

        } catch (InvalidSequenceException e) {

            System.out.println("Invalid Sequence Entered : " + e.getInvalidSequence());
            System.exit(0);

        }

        getOccurences(sequence);

    }

    public static char[] getSequence() throws InvalidSequenceException{

        System.out.println("Please Enter Charachter Sequence With No Spaces : ");
        String sequenceString = sc.nextLine();
        char[] sequenceCharArray = sequenceString.toCharArray();
        validateSequenceCharArray(sequenceCharArray);

        return sequenceCharArray;
    }

    public static void validateSequenceCharArray(char[] sequenceCharArray) throws InvalidSequenceException{

        for (char c : sequenceCharArray) {

            if (!Character.isLetter(c)) {

                throw new InvalidSequenceException(String.valueOf(c));

            }

        }

    }

    public static void getOccurences(char[] sequence) {

        HashMap<Character, Integer> charachterHashMap = new HashMap<>();

        for (char c : sequence) {

            if (charachterHashMap.containsKey(Character.toLowerCase(c))){

                int num = charachterHashMap.get(Character.toLowerCase(c));
                charachterHashMap.replace(Character.toLowerCase(c), num + 1);

            } else {

                charachterHashMap.put(Character.toLowerCase(c),0);

            }

        }

        System.out.println(charachterHashMap);

    }

}
