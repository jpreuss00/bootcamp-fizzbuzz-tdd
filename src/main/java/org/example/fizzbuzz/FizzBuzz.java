package org.example.fizzbuzz;

public class FizzBuzz {

    public static void main(String...args) {
        for (int i = 1; i < 101; i++){
        String fizzBuzz = fizzbuzz(i);
        if (i < 100){
        System.out.print(fizzBuzz + ", ");
        } else {
        System.out.print(fizzBuzz);
        System.out.println(" ");
            }
        }
    }

    public static String fizzbuzz(int number) {
        if (number % 15 == 0){
            return "FizzBuzz";
        }
        else if (number % 3 == 0){
            return "Fizz";
        }
        else if (number % 5 == 0){
            return "Buzz";
        }
        return Integer.toString(number);
        }
    }