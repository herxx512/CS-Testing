import java.util.Iterator;
import java.util.LinkedList;

public class Algorithms {

    // Project Part 3:
    // Step 1 Linked Lists:
    public static LinkedList sumLinkedList(LinkedList num1, LinkedList num2){

        Iterator<Integer> num1Descending = num1.descendingIterator();

        // number1 = 321 and placement is used to place each number is the correct place (ones, tens, hundred)
        int number1 = 0;
        int placement = 1;

        while(num1Descending.hasNext()){
            number1 += placement * num1Descending.next();
            placement *= 10;
        }

        Iterator<Integer> num2Descending = num2.descendingIterator();

        // number2 = 654 and placement is used to place each number is the correct place (ones, tens, hundred)
        int number2 = 0;
        placement = 1;

        while(num2Descending.hasNext()){
            number2 += placement * num2Descending.next();
            placement *= 10;
        }

        // Sum of the 2 numbers
        String sumNumber = String.valueOf(number1 + number2);

        // LinkedList of the new number by looping through the sum number, convert Character to Integer, and add it to the list
        LinkedList<Integer> newLL = new LinkedList<>();

        for(int i = 0; i < sumNumber.length(); i++){
            newLL.add(Character.getNumericValue(sumNumber.charAt(i)));
        }

        return newLL;
    }
//  Runtime Complexity: O(n)

    // Step 2 Sorting:
    public static void insertionSort(int[] arr){

        // Keeps track of unsorted index
        for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++){
            int newElement = arr[unsortedIndex];

            int i;

            // Look  for the correct position to insert element (shifting)
            for (i = unsortedIndex; i > 0 && arr[i-1] > newElement; i--){
                arr[i] = arr[i-1];
            }

            arr[i] = newElement;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
//  Out of the three sortings (Insertion, Quick, and Merge), Insertion have the best runtime efficiency.
//  Their runtime complexity are Insertion: O(n^2), Quick: O(nlogn), and Merge: O(nlogn).


    // Step 3 Recursion:
    public static int recursiveIndex(int[] arr, int num){
        return recursiveIndex2(arr, num, 0);
    }

    public static int recursiveIndex2(int[] arr, int num, int index){
        if (index == arr.length){
            return 1;
        }

        if (num == arr[index]){
            return index;
        }

        return recursiveIndex2(arr, num, index + 1);
    }
//  Runtime complexity is O(n)
}
