package com.Mruruc;

public class App {

    public static void main(String[] args) {


        int[] arr={12,14,17,21,35,52,61,69,72,80};
        int result=BinarySearch.search(arr,1);
        System.out.println(result);

      /*  long startB=System.nanoTime();
        BinarySearch.search(arr,99);
        long endB=System.nanoTime();
        long resultBinary=endB-startB;
        System.out.println(resultBinary);

        long startL=System.nanoTime();
        FindTravial.linearSearch(arr,99);
        long endL=System.nanoTime();
        long resultLinear=endL-startL;
        System.out.println(resultLinear);*/





    }
}
