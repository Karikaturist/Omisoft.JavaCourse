package com.omisoft.vminkov.javacourse.introinjava.task3;

/**
 * Created by developer on 02.11.16.
 */
public class Test3 {
    public static void main(String args[]){
        ArrayFunc arrayFunc = new ArrayFunc();
        int [] array = {9, 8, 4, 5, 2, 1, 3};
        System.out.println("The sum of elements is - " + arrayFunc.getSum(array));

        int minElement = arrayFunc.getMinElement();
        System.out.println("The minimal element of the array is = " + minElement);

        System.out.println("The array elements are: " + arrayFunc.printArray(array));
    }
}
