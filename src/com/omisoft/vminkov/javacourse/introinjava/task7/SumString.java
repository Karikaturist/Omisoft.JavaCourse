package com.omisoft.vminkov.javacourse.introinjava.task7;

/**
 * Created by developer on 07.11.16.
 */
public class SumString {
//    String num1="394";
//    String num2="761";

    static int m,n, s;
    static StringBuilder strB=new StringBuilder();


    public static String sum(String num1, String num2, String result){
        Integer x = Integer.valueOf(num1);
        Integer y = Integer.valueOf(num2);
        int buff=0;
        while(x!=2){
            m=x%10;
            n=y%10;
            s=m+n;
            if(s>9){
                buff=s%100;
                s=m+n+buff;
                strB.insert(0, Integer.toString(s));
            }else strB.insert(0, Integer.toString(s));
         }

        result = " "+strB;
        System.out.print(result);
        return result;
    }
}
