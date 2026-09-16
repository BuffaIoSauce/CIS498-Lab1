// Author: Tej Kakumanu
// CIS 498 - Lab 1

public class BubbleSort_Tej {

    public static void main(String[] args) {

        // Fix 1: Added square brackets '[]' to declare 'arr' as an integer array (originally: int arr = {...})
        int[] arr = {6, 4, 1, 10, 2, 5, 3, 8, 7, 9};

        // Fix 2: Added data type 'int' to declare the loop counter variable 'i' (originally: for (i = 0; ...))
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Fix 3: Changed comparison from '<' to '>' to sort in ascending order 1 to 10 (originally: arr[j] < arr[j+1])
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    // Fix 4: Added missing semicolon ';' at the end of the statement (originally: arr[j] = arr[j+1])
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Fix 5: Added the update expression 'i++' to increment the loop counter (originally: for (int i = 0; i < arr.length))
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
} // Fix 6: Added missing closing brace '}' to properly close the class definition
