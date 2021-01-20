package com;

public class Example {
    @Test(param1 = 10, param2 = 15)
    public static void printSum(int a, int b){
        System.out.println("Parameters : a = " + a +  " , b = " + b + " . Result of (a+b) = " + (a+b));
    }

    @Test(param1 = 123, param2 = 77)
    public static void printSum2(int a, int b){
        System.out.println("Parameters : a = " + a +  " , b = " + b + " . Result of (a+b) = " + (a+b));
    }

    public static void info(int a, int b){
        System.out.println("a = " + a + " , b = " + b);
    }
}
