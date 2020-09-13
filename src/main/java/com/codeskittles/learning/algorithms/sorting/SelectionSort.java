package com.codeskittles.learning.algorithms.sorting;

public final class SelectionSort<T extends Comparable<T>> implements ISort<T> {

    public void sort(final T[] arrayToSort) {

        for (int i = 0; i < arrayToSort.length - 1; i++) {

            T smallestValue = arrayToSort[i];
            int smallestValueIndex = i;

            // Find the smallest values index in the array from i to end of the array
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (smallestValue.compareTo(arrayToSort[j]) > 0) {
                    smallestValue = arrayToSort[j];
                    smallestValueIndex = j;
                }
            }

            // Bring the smallest value to the position i.
            T temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[smallestValueIndex];
            arrayToSort[smallestValueIndex] = temp;
        }
    }
}
