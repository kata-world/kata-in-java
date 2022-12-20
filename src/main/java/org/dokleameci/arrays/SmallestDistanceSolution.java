package org.dokleameci.arrays;

import java.util.Arrays;

public class SmallestDistanceSolution {

    // O((nlogn) + (mlogm)) time complexity where n is the length of ArrayONe and m the length of ArrayTwo
    // O(1) space time
    public int[] smallestDistancePair(int[] arrayOne, int[] arrayTwo) {

        if (arrayOne.length < 1 || arrayTwo.length < 1)
            throw new ArrayIndexOutOfBoundsException("Arrays should have a minimum length of 1.");

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int[] pairOfIndexes = new int[2];
        int idxOne = 0;
        int idxTwo = 0;

        int smallest = Integer.MAX_VALUE; // 2^32-1
        int current;

        while (idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
            int firstNum = arrayOne[idxOne];
            int secondNum = arrayTwo[idxTwo];

            if (firstNum < secondNum) {
                current = secondNum - firstNum;
                idxOne++;
            } else if (secondNum < firstNum) {
                current = firstNum - secondNum;
                idxTwo++;
            } else {
                return new int[]{firstNum, secondNum};
            }

            if (smallest > current) {
                smallest = current;
                pairOfIndexes = new int[]{firstNum, secondNum};
            }
        }

        return pairOfIndexes;
    }
}
