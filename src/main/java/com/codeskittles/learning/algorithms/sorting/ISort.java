package com.codeskittles.learning.algorithms.sorting;

public interface ISort<T extends Comparable<T>> {
    void sort(T[] arrayToSort);
}
