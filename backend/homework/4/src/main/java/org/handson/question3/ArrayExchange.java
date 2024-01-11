package org.handson.question3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.handson.MyLogger;

public class ArrayExchange<T> {
    /**
     * This function exchanges two elements in an array.
     *
     * @param  array         the array in which elements should be exchanged
     * @param  elementOne    the first element to be exchanged
     * @param  elementTwo    the second element to be exchanged
     * @return               the modified array with elements exchanged
     */
    public T[] arrayExchange(T[] array, T elementOne, T elementTwo) {
        List<T> listOfArray = new ArrayList<>(Arrays.asList(array));
        
        // Find the indices of the elements
        int indexOne = listOfArray.indexOf(elementOne);
        int indexTwo = listOfArray.indexOf(elementTwo);
        
        // Swap the elements using Collections.swap()
        Collections.swap(listOfArray, indexOne, indexTwo);
        
        return listOfArray.toArray(array);
    }

    /**
     * A description of the entire Java function.
     *
     * @param  args      	the command line arguments
     */
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        ArrayExchange<Integer> arrayExchange = new ArrayExchange<>();
        Integer[] array1 = arrayExchange.arrayExchange(array, 1, 3);
        MyLogger.customLogger(Arrays.toString(array1), "DEBUG");
    }
}
