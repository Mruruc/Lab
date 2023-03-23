package com.Mruruc;

public class FindTravial {

    public static int linearSearch(int[] arr,int element){
        if(arr.length<=0){
            return -1;
        }
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}
