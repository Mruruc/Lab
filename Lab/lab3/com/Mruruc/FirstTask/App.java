package com.Mruruc.FirstTask;

public class App {

    public static void main(String[] args) {

    /*    Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number that you want to find divisors:");
        long number=scan.nextLong();*/

        long start=System.nanoTime();

        Array list= Divisor.divisor(24);

        long end=System.nanoTime();

        double resultInSeconds = (end - start) / 1_000_000_000.0;
        System.out.println(resultInSeconds);

      //  list.print();
    }
}
