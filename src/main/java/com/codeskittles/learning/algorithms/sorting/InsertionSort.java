package com.codeskittles.learning.algorithms.sorting;

public class InsertionSort<T extends Comparable<T>> implements ISort<T> {

    @Override
    public void sort(final T[] arrayToSort) {

        for (int i = 1; i < arrayToSort.length; i++) {
            T key = arrayToSort[i];
            int j = i - 1;

            while (j >= 0 && arrayToSort[j].compareTo(key) > 0) {
                arrayToSort[j + 1] = arrayToSort[j];
                j--;
            }

            arrayToSort[j + 1] = key;

        }
    }
}
