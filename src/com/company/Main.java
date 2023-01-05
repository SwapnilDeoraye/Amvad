package com.company;

public class Main {

    public int add(int a, int b){
        int c = a + b;
        System.out.println("Good");
        return c;
    }

    public static void main(String[] args) {
        System.out.println("I can do it");
        Main main = new Main();
        int d = main.add(12, 12);
        System.out.println(d);

        int f = main.add(222, 12);
        System.out.println(f);
    }

    public int add1(int a, int b) {
        int c = a + b;
        System.out.println("Good");
        return c;
    }
}
