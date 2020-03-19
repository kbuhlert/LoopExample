public class KontoApp {
    public static void main(String[] args) {
        //Aufg 1 GFLArrayLoops
        int[] feld = new int[]{2,4,5,7};
        int feldsumme = 0;

        for(int zahlenwert : feld){
            feldsumme = feldsumme + zahlenwert;
        }
        System.out.println(feldsumme);

        //Aufg 2
        feldsumme = 0;  //Feldsumme wieder auf 0 gesetzt, Array (feld) ist oben bereits angelegt

        for(int i= 0; i<feld.length; i++){
            feldsumme = feldsumme + (feld [i]*3);
        }
        System.out.println(feldsumme);

        //Aufg 4
        feldsumme = 0;  //Feldsumme wieder auf 0 gesetzt, Array (feld) ist oben bereits angelegt

        for(int i= 0; i<feld.length; i++){
            feldsumme = (feld [i+1]*3) + (feld [i]*3);
        }
        System.out.println(feldsumme);
    }

    /*static int arraysumme (int[] feld){

    }*/
}
