package com.lost.mvpejercicio;

public class FizzBuzz {


    public String convert(int value) {

        boolean esMultiplodeTres = value % 3 == 0;
        boolean esMultiploDeCinco = value % 5 == 0;

        if(esMultiplodeTres && esMultiploDeCinco){
            return "FizzBuzz";
        }

        if(esMultiplodeTres){
            return "Fizz";
        }

        if(esMultiploDeCinco){
            return "Buzz";
        }

        return String.valueOf(value);
    }
}
