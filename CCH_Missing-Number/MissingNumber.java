import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

public class MissingNumber {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] sequence = {};

        try {

            sequence = getSequence();

        } catch (InvalidSequenceException e) {

            System.out.println("Invalid Sequence Entered : " + e.getInvalidSequence());
            System.exit(0);

        }


        sortArray(sequence);

        String Message = findMissingNumber(sequence);

        System.out.println(Message);

    }

    public static int[] getSequence() throws InvalidSequenceException{

        System.out.println("Please Enter Number Sequence Separated By Commas : ");
        String sequenceString = sc.nextLine();
        String[] sequenceStringArray = sequenceString.split(",");
        validateSequenceStringArray(sequenceStringArray);
        int[] sequenceIntArray = new int[sequenceStringArray.length];

        for (int i = 0; i < sequenceStringArray.length; i ++) {

            sequenceIntArray[i] = Integer.valueOf(sequenceStringArray[i].trim());

        }

        return sequenceIntArray;
    }

    public static void validateSequenceStringArray(String[] sequenceStringArray) throws InvalidSequenceException{

        for (String s : sequenceStringArray) {

            if (!s.trim().matches("\\d+")) {

                throw new InvalidSequenceException(s);

            }

        }

    }

    public static void sortArray(int[] sequence) {

        boolean sorted = false;

        while (!sorted){

            sorted = true;

            for (int i = 0; i < sequence.length - 1; i++) {

                if (sequence[i] > sequence[i+1]) {

                    sorted = false;
                    int tempInt = sequence[i];
                    sequence[i] = sequence[i+1];
                    sequence[i+1] = tempInt;

                }

            }

        }

    }

    public static String findMissingNumber(int[] sequence) {

        List<Integer> missingNums = new ArrayList<>();

        for (int i = 0; i < sequence.length - 1; i++) {

            int potentialMissingNumber = sequence[i] + 1;

            while (potentialMissingNumber != sequence[i+1]){

                missingNums.add(potentialMissingNumber);
                potentialMissingNumber += 1;

            }

        }

        if (missingNums.size() > 1) {

            return "More than 1 missing number";

        } else if (missingNums.size() == 1) {

            return "Missing number is " + missingNums.get(0);

        } else {

            return "Missing numbers could be " + (sequence[0] - 1) + " or " + (sequence[sequence.length - 1] + 1);

        }

    }
}
