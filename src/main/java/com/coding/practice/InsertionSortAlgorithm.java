package com.coding.practice;

public class InsertionSortAlgorithm {

    public static void main(String[] args) {

        Integer[] input = {5, 2, 4, 6, 1, 3};
        for (Integer integer : input) {
            System.out.print(integer + " ");
        }
        System.out.println();
        insertionSort(input);
        for (Integer integer : input) {
            System.out.print(integer + " ");
        }

    }

    private static void insertionSort(Integer[] input) {

        for (int j = 1; j < input.length; j++) {
            int key = input[j];
            int i = j - 1;
            //tweak the condition for non-increasing to non-decreasing
            while (i >= 0 && input[i] < key) {
                input[i + 1] = input[i];
                i = i - 1;
            }
            input[i + 1] = key;
        }
    }
}
