package com.omisoft.vminkov.javacourse.introinjava.task2;

/**
 * Created by developer on 01.11.16.
 */
public class LCMfunc {

    /**
     *
     * @param a
     * @param b
     * @return The lowest common multiple
     */
    public int lcm(int a, int b)
    {
        int a2=a;
        int b2=b;
        while (a2 != b2) {
            if (a2 > b2){
                b2 +=b;
            }else{
                a2 += a;
            }
        }
        return a2;

    }
}
