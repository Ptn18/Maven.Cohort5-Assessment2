package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        int newLength = integerArray.length +1;
        Integer[] newArray = Arrays.copyOf(integerArray,newLength );
        newArray[newArray.length -1] = valueToBeAdded;

        return newArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
      //get the element at index indexToInsert
        int valueAtIndex = integerArray[indexToInsertAt];
        int count =0;
        for (int i=0; i<integerArray.length; i++) {
            if (integerArray[i] == valueAtIndex) {
                count++;
                integerArray[i]=valueToBeInserted;
            }
        }


        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] inDe = new Integer[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 1) {
                inDe[i] = integerArray[i] - 1;
            } else {
                if (integerArray[i] % 2 == 0) {
                    inDe[i] = integerArray[i] + 1;
                }
            }

        }
        return inDe;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] increment = new Integer[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                increment[i] = integerArray[i] + 1;
            }else{
                increment[i] = integerArray[i];
            }
        }
        return increment;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] decrement = new Integer[input.length];
        for (int i = 0; i < decrement.length; i++) {
            if (input[i] % 2 == 1) {
                decrement[i] = input[i] - 1;
            }else{
                decrement[i] = input[i];
            }
        }
        return decrement;
    }
}
