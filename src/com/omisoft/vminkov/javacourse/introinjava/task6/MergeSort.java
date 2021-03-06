package com.omisoft.vminkov.javacourse.introinjava.task6;

/**
 * Created by developer on 03.11.16.
 */
public class MergeSort {
    int[] numbers={45,23,11,89,77,98,4,28,65,43};
    private int[] array;
    private int[] tempMergArr;
    private int length;

    public void newSort(int[] numbers) {
        this.array = numbers;
        this.length = numbers.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    public void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }
}
