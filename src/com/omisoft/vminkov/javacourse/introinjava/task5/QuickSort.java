package com.omisoft.vminkov.javacourse.introinjava.task5;

/**
 * Created by developer on 03.11.16.
 */
public class QuickSort {
    int[] numbers = {9, 8, 4, 5, 2, 1, 3};
    //int[] sorted= new int[7];

    /**
     *
     * @param low
     * @param high
     */
    public void qSort(int[] arr, int low, int high){
        int i=low;
        int j=high;

        if (low >= high)
            return;

        for(int n=0; n<numbers.length; n++){
            System.out.print(numbers[n]);
        }

        int pivot = numbers[low+(high-low)/2];
        while(i<j){
            while(numbers[i]<pivot){
                i++;
            }
            while(numbers[j]>pivot){
                j--;
            }
            if(i<=j){
                exchange(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            qSort(numbers,low, j);
        if (i < high)
            qSort(numbers,i, high);
        System.out.println();
        for(int n=0; n<numbers.length; n++){
            System.out.print(numbers[n]);
        }
    }

    /**
     *
     * @param i
     * @param j
     */
    private void exchange(int i, int j) {
        int buff=numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=buff;
    }
}
