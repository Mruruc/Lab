package com.Mruruc.SecondTask;

import com.Mruruc.FirstTask.Array;

public class TweakDivisor {

    public static Array tweakDivisor(long num) {

        Array list = new Array();
        list.add(num);

        // Loop through all numbers from 2 up to the square root of the input number.
        for (long i = 2; i <= Math.sqrt(num); i++) {
            // If the input number is divisible by the current number, add it to the list.
            if (num % i == 0) {
                list.add(i);
              // list.add(num/i);

                // If the current number is not the square root of the input number, add its corresponding factor to the list as well.

                 if (i != Math.sqrt(num)) {
                     list.add(num / i);
               }
            }
        }
        return list;
    }

}
