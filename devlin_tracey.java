public class BubbleSort {
    public static void main(String[] args) {

        int comparePosition;

        int[] numbers = {6, 4, 1, 10, 2, 5, 3, 8, 7, 9};

        for (int passNumber = 0; passNumber < numbers.length - 1; passNumber++) { //start a new pass through the list
            for (comparePosition = 0; comparePosition < numbers.length - 1 - passNumber; comparePosition++) { //walk through the unsorted part, one spot at a time

                if (numbers[comparePosition] > numbers[comparePosition + 1]) {    //if this number is bigger than the one next to it
                    int temporaryValue = numbers[comparePosition];                //hold onto this number for a second
                    numbers[comparePosition] = numbers[comparePosition + 1];      //move the smaller number into this spot
                    numbers[comparePosition + 1] = temporaryValue;                //drop the held number into the next spot (that's the swap)
                }                                                                  //NOTE: this is one pass, it takes several passes to fully sort
            }
        }

        for (int printPosition = 0; printPosition < numbers.length; printPosition++) { //walk through the sorted list, printing each one
            System.out.println(numbers[printPosition]);
        }
    }
}