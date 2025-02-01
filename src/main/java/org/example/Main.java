package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        PlayGround playGround = new PlayGround();
        boolean result = playGround.oddOrEven(11);
        System.out.println("Odd or even function result -> " + result);

        long fact = playGround.factorial(7);
        System.out.println("Factorial is -> " + fact);

        String str = "Hello World!";
        System.out.println("Reversed String is -> " + playGround.reverse(str));

        System.out.println("Fibonacci series iterative -> " + playGround.fibonacciIterative(7));
        System.out.println("Fibonacci series recursive -> " + playGround.fibonacciRecursive(5));

        System.out.println("The number is prime -> " + playGround.checkPrime(51));

        ArrayList<String> yearList = new ArrayList<>(Arrays.asList("1970", "1970", "1980", "1970", "1990", "1980", "2000", "2000", "2020", "2010", "2000"));
        HashMap<String, Integer> map = new HashMap<>();
        map = playGround.getFrequencyCounter(yearList);
        System.out.println("Generated frequency counter -> " + Arrays.asList(map));
        System.out.println("Most frequest year list -> " + playGround.getMostFrequentFromMap(map));
    }

}