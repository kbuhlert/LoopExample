package com.company;

import java.util.Arrays;

public class Uebung_ArrayAusgabe {

    public static void main(String[] args) {
        int[]array1 = new int[]{1,2,3,4,5};
        //Array mit for-Schleife einzeln ausgeben
        for (int i = 0; i< array1.length; i++)
        {
            System.out.println(array1[i]);
        }
        System.out.println("-----");
        //Array mit for-each-Schleife einzeln ausgeben
        for (int index:array1) {
            System.out.println(index);
        }
        System.out.println("-----");
        //Array mit vordefinierter Methode ausgeben
        System.out.println(Arrays.toString(array1));
    }
}
