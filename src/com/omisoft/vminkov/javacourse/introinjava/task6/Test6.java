package com.omisoft.vminkov.javacourse.introinjava.task6;

/**
 * Created by developer on 03.11.16.
 */
public class Test6 {
    //int[] array={ 2, 6, 3, 5, 1 };
    static int[] numbers = {45,23,11,89,77,98,4,28,65,43};
    static int a;
    static int b;

    public static void main(String[] args){
        MergeSort ms = new MergeSort();
        ms.newSort(numbers);
        ms.doMergeSort(a, b);
        for(int i = 0; i< numbers.length; i++){
            System.out.print(i);
            System.out.print(" ");
        }
    }



}
