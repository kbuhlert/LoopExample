package com.company;

public class Bsp_Folie25 {
    public static void main(String[] args) {
        //a) Summe Zahlen 1-10 mit for-Schleife
        int start = 1;
        int stopp = 10;
        int summe = 0;
        for (int i=start; i<stopp+1; i++){
            summe = i+summe;
        }
        System.out.println("Die Summe von " + start + " bis " + stopp + " ist " + summe);

        //b) Summe der Zahlen i/2
        double startKomma = 1.0;
        double halbe = 0.0;
        for (double i=startKomma; i<stopp+1; i++){
            halbe = i/2 + halbe;
        }
        System.out.println(halbe);
    }
}
