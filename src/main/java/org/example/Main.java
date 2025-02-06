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

        String[] logs = {"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20", "10.0.0.3 - GET 2020-08-24","10.0.0.3 - GET 2020-08-24","10.0.0.3 - GET 2020-08-24","10.0.0.4 - GET 2020-08-24"};
        playGround.mostFrequestIpAddress(logs);

        System.out.println("Result of fractionToRecurringDecimal -> " + playGround.fractionToRecurringDecimal(1, 3));
        System.out.println("Result of reverse words in a String -> " + playGround.reverseWords("The sky is blue"));

        System.out.println("Result of encode string in a array -> " + playGround.encodeInputString("aaaaabbbbccc"));
    }

}