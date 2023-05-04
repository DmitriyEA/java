package org.example;

import java.util.Random;

public class hw1_go{
    public static void main(String[] args){
        Random random = new Random();
        int number1 = random.nextInt(2000);
        System.out.println("Случайное число: "+number1);
        int temp = 2;
        int count = 0;
        while (temp <= number1){
            temp = temp * 2;
            count++;
        }
        System.out.println("Старший бит (самая большая степень двойки не превосходящаая это число): "+count);
        System.out.println("2 ^ "+count+" = "+Math.pow(2, count));


        System.out.println();
        int[] m1 = new int[Short.MAX_VALUE];
        int number2 = random.nextInt(10);
        int j = 0;
        System.out.println("Short (максимальное число): "+Short.MAX_VALUE);
        System.out.println("Делитель: " + number2);
        for (int i=0; i < Short.MAX_VALUE-1; i++){
            if (i % number2 == 0 & i != 0){
                m1[j] = i;
                j++;
            }
        }

        System.out.println();
        for (int k=0; k<m1.length-1; k++){
            System.out.println(m1[k]);
        }

    }
}

