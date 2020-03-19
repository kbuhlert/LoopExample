public class LoopApp {
    public static void main(String[] args) {



        double erg = 0;
        for(int i=2; i<=100; i++ ){
            erg = erg + 1.0/i;
        }
        System.out.println(erg);

        int erg2 = 0;
        for (int a=3; a<= 9000; a=a+3){
            erg2 = erg2 + a;
        }
        System.out.println(erg2);

    }
}
