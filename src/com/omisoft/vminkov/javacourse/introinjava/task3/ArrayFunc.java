package com.omisoft.vminkov.javacourse.introinjava.task3;

/**
 * Created by developer on 02.11.16.
 */
public class ArrayFunc {
    private int [] arr = {9, 8, 4, 5, 2, 1, 3};
    private int [] array;

    public ArrayFunc() {
        this.array = this.arr;
    }

    public int getMinElement(){
        int min=100;
        array= this.arr;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    /**
     *
     * @param array
     * @return
     */
    public String printArray(int [] array){
        String elements=array[0]+"";
        for (int i=1; i<array.length; i++) {
            elements = elements.concat(" "+ array[i]);
        }
        return elements;
    }

    /**
     *
     * @param arr
     * @return
     */
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
