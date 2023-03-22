package com.Mruruc.FirstTask;


public class Divisor {

    public static Array divisor(long num){

        Array list=new Array();
        for (long i = 1; i <=num; i++) {
            if(num%i==0){
              list.add(i);
            }
        }
        return list;
    }
}