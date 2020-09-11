package com.codeskittles.learning.algorithms.sorting;

public final class InsertionSort<T extends Comparable<T>> implements ISort<T> {

    public void sort(T[] arrayToSort) {

        for (int i = 0; i < arrayToSort.length - 1; i++) {

            T smallestValue = arrayToSort[i];
            int smallestValueIndex = i;

            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (smallestValue.compareTo(arrayToSort[j]) > 0) {
                    smallestValue = arrayToSort[j];
                    smallestValueIndex = j;
                }
            }

            T temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[smallestValueIndex];
            arrayToSort[smallestValueIndex] = temp;
        }
    }
}
