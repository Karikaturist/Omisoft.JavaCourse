package com.omisoft.vminkov.javacourse.introinjava.task5;

/**
 * Created by developer on 03.11.16.
 */
public class Test5 {

    public static void main(String[] args){
        //System.out.println("main 5");
        int[] numbers = {9, 8, 4, 5, 2, 1, 3};
        for(int n=0; n<numbers.length; n++) {
            System.out.print(numbers[n]);
        }
        QuickSort quickSort=new QuickSort();
        quickSort.qSort(numbers,9,3);
        System.out.println();
        for(int n=0; n<numbers.length; n++) {
            System.out.print(numbers[n]);
        }// int[] aa = new int[2];




    }
}
