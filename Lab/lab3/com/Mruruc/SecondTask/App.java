package com.Mruruc.SecondTask;

import com.Mruruc.FirstTask.Array;

public class App {
    public static void main(String[] args) {

      // long start=System.nanoTime();

   /*   // Array list=TweakDivisor.tweakDivisor((long)Math.pow(10,18));
         Array list=TweakDivisor.tweakDivisor( 500000000000000000L);
        //list.print();
        long end=System.nanoTime();
        double resultInSeconds = (end - start) / 1_000_000_000.0;
        System.out.println(resultInSeconds);*/

        Array array=TweakDivisor.tweakDivisor(24);
        array.print();
        //array.bubbleSort();
        array.selectionSort();
        array.print();


    }
}
