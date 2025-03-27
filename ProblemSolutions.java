
/******************************************************************
 *
 *   Wyatt Harris COMP 272 001
 *
 *   This java file contains the problem solutions of isSubSet, findKthLargest,
 *   and sort2Arrays methods. You should utilize the Java Collection Framework for
 *   these methods.
 *
 ********************************************************************/

import java.util.*;
class ProblemSolutions {

    /**
     * Method: isSubset()
     *
     * Given two arrays of integers, A and B, return whether
     * array B is a subset if array A. Example:
     *      Input: [1,50,55,80,90], [55,90]
     *      Output: true
     *      Input: [1,50,55,80,90], [55,90, 99]
     *      Output: false
     *
     * The solution time complexity must NOT be worse than O(n).
     * For the solution, use a Hash Table.
     *
     * @param list1 - Input array A
     * @param list2 - input array B
     * @return      - returns boolean value B is a subset of A.
     */

    public boolean isSubset(int list1[], int list2[]) {
        // ADD YOU CODE HERE -- DON'T FORGET TO ADD YOR NAME AT TOP OF FILE
        Hashtable<Integer, Integer> listFirst = new Hashtable<>();
        for (int i = 0; i < list1.length; i++) {
            listFirst.put(list1[i], list1[i]); //Genius coder over here.
        }
        for (int j : list2) {
            if (!listFirst.containsKey(j)) {
                return false;
            }
        }
        return true;
    }


    /**
     * Method: findKthLargest
     *
     * Given an Array A and integer K, return the k-th maximum element in the array.
     * Example:
     *      Input: [1,7,3,10,34,5,8], 4
     *      Output: 7
     *
     * @param array - Array of integers
     * @param k     - the kth maximum element
     * @return      - the value in the array which is the kth maximum value
     */

    public int findKthLargest(int[] array, int k) {
        if(array == null || array.length < k) {
            return -1;
        }
        int length = array.length;
        int array2[] = new int[length];
        for (int i = 0; i < length; i++) {
            array2[i] = array[i];
        }
        Arrays.sort(array2);
        return array2[length - k];
    }


    /**
     * Method: sort2Arrays
     *
     * Given two arrays A and B with n and m integers respectively, return
     * a single array of all the elements in A and B in sorted order. Example:
     *      Input: [4,1,5], [3,2]
     *      Output: 1 2 3 4 5
     *
     * @param array1    - Input array 1
     * @param array2    - Input array 2
     * @return          - Sorted array with all elements in A and B.
     */

    public int[] sort2Arrays(int[] array1, int[] array2) {

        // ADD YOU CODE HERE
        int length1 = array1.length;
        int length2 = array2.length;
        int[] sortedArray = new int[length1 + length2];
        System.arraycopy(array1, 0, sortedArray, 0, length1);
        System.arraycopy(array2, 0, sortedArray, length1, length2);
        Arrays.sort(sortedArray);
        //Evil solution
        return sortedArray;
    }

}
