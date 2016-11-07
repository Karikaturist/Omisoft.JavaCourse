package com.omisoft.vminkov.javacourse.introinjava.task1;

/**
 * Created by developer on 01.11.16.
 */
public class GCDfunc {

    /**
     *
     * @param a
     * @param b
     * @return The greatest common separator
     */
    public int gcs(int a, int b)
    {
        while (a!=b)
            {
                if(a>b)
                {
                    a=a-b;
                }
                else {
                    b = b - a;
                }
            }

        return a;

    }
}
