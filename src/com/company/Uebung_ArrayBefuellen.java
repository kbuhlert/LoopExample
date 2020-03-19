package com.company;

import java.util.Arrays;

public class Uebung_ArrayBefuellen {
    public static void main(String[] args) {
        int arraylengh = 5;
        int[] array1 = new int[arraylengh];
        for(int i = 0; i<arraylengh; i++){
            int index = i*i;
            array1[i]= index;
        }
        System.out.println(Arrays.toString(array1));
    }
}
