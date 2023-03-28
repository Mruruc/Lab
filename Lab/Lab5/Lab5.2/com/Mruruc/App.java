package com.Mruruc;
public class App {
    public static void main(String[] args) {

        CircularBuffer buffer=new CircularBuffer();
        buffer.push(3);
        buffer.push(9);
        buffer.push(11);
        buffer.push(30);
        buffer.push(52);
        buffer.push(6);
        buffer.push(2);
        buffer.push(5);
        buffer.push(7);
        buffer.push(61);

        buffer.printBuffer();
        System.out.println(buffer.size());
        System.out.println("========================");
        buffer.pop();
        buffer.pop();
        buffer.pop();
        buffer.printBuffer();
        System.out.println(buffer.size());
        System.out.println("========================");
        buffer.push(1);
        buffer.push(4);
        buffer.printBuffer();
        System.out.println(buffer.size());






    }
}
