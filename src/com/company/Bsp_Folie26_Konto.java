package com.company;

public class Bsp_Folie26_Konto {
   public static void main(String[] args) {
        konto(10,2000,0.025);
    }
    public static void konto (int jahre, int einlage, double zinssatz){
        double kontostand = einlage;
       for(int i = 1; i<=jahre; i++){
           double kontostandzins = kontostand + einlage*zinssatz;
           kontostand=kontostandzins;
           System.out.println("Einlage inkl Zins: " + kontostand + "€ / Jahr " + i);
       }
   }
}


