package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//import java.util.Map;

public class PlayGround {

    //Program to check if a number is even or odd
    public boolean oddOrEven(int num){
        boolean result = num%2 == 0? true: false;
        return result;
    }

    //Program to get the factorial of a number
    public long factorial(int num){
        long fact = new Long(0);
        if (num == 0){
            fact = 1L;
        } else if (num != 0){
            fact = (num * factorial(num - 1));
        }
        return fact;
    }

    //Program to reverse a string
    public String reverse(String str){
        char temp;
        char[] strArray = str.toCharArray();
        System.out.println("String Array -> " + Arrays.toString(strArray));
        for(int i = 1; i <= strArray.length/2; i++){
            temp = strArray[i-1];
            strArray[i-1] = strArray[strArray.length - (i)];
            strArray[strArray.length - (i)] = temp;
        }

        return  String.valueOf(strArray);
    }

    //Program to print the given number of numbers in a Fibonacci series using iterative approach
    public ArrayList<Integer> fibonacciIterative(int num){
        int fib1 = 0;
        int fib2 = 1;
        int fib3;
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(fib1);
        numList.add(fib2);
        while(num > 2){
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
            numList.add(fib3);
            num-=1;
        }

        return numList;
    }

    //Program to print the given number of numbers in a Fibonacci series using recursive approach
    public ArrayList<Integer> fibonacciRecursive(int num){
        ArrayList<Integer> fibList = new ArrayList<>();
        int fib;
        if(num <= 0){
            return fibList;
        }

        fibList.add(0);
        if (num == 1){
            return fibList;
        }
        fibList.add(1);
            for(int i = 2; i < num; i++){
                fib = fibList.get(i-1) + fibList.get(i-2);
                fibList.add(fib);
            }
        return fibList;
    }

    //Program to check if a number is a prime number or not
    public boolean checkPrime(int num) {
        int count = 0;
        ArrayList<Integer> factorList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count += 1;
                factorList.add(i);
            }
        }
        if (factorList.size() == 2 && factorList.get(0) == 1 && factorList.get(1) == num && count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public HashMap<String, Integer> getFrequencyCounter(ArrayList<String> yearList){
        HashMap<String, Integer> map = new HashMap<>();
        for(String year: yearList){
            map.put(year, map.getOrDefault(year, 0) + 1);
        }
        return map;
    }

    public ArrayList<String> getMostFrequentFromMap(HashMap<String, Integer> map){
        int freq = 0;
        ArrayList<String> freqList = new ArrayList<>();
        for(String str: map.keySet()){
            freq = Math.max(freq, map.get(str));
        }
        for(String str: map.keySet()){
            if (map.get(str) == freq){
                freqList.add(str);
            }
        }
        return freqList;
    }

    public void mostFrequestIpAddress(String[] logs){
        //String[] logs = {"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20", "10.0.0.3 - GET 2020-08-24","10.0.0.3 - GET 2020-08-24","10.0.0.3 - GET 2020-08-24","10.0.0.4 - GET 2020-08-24"};
        HashMap<String, Integer> map = new HashMap<>();
        int freq = 0;
        ArrayList<String> mostFrequentIp = new ArrayList<>();
        for(String log : logs){
            String[] arr = log.split(" ");
            map.put(arr[0], map.getOrDefault(arr[0], 0) + 1);
        }
        System.out.println("Log Hashmap -> " + Arrays.asList(map));

        for(String ip: map.keySet()){
            freq = Math.max(freq, map.get(ip));
        }

        System.out.println("Value of freq is -> " + freq);

        for(String ip: map.keySet()){
            if(map.get(ip) == freq){
                mostFrequentIp.add(ip);
            }
        }

        System.out.println("Most frequently occurring ip address is -> " + mostFrequentIp);
    }


    public String fractionToRecurringDecimal(int numerator, int denominator){
        if (numerator == 0){
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)) {
            ans.append("-");
        }

        long num = (long)Math.abs((long)numerator);
        long den = (long)Math.abs((long)denominator);

        long q = num/den;
        long r = num%den;
        ans.append(String.valueOf(q));

        if (r == 0){
            return ans.toString();
        }

        ans.append(".");

        HashMap<Long, Integer> map = new HashMap<>();
        while(r != 0){
            if(map.containsKey(r)){
                int pos = map.get(r);
                ans.insert(pos, "(");
                ans.append(")");
                return ans.toString();
            } else {
                map.put(r, ans.length());
                r = r*10;
                q = r/den;
                r %= den;
                ans.append(String.valueOf(q));
            }
        }

        return ans.toString();
    }

}
