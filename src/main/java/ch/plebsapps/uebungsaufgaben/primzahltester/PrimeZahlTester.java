package ch.plebsapps.uebungsaufgaben.primzahltester;

import java.util.ArrayList;

public class PrimeZahlTester{

    public static void main(String[] args) {
        int[] prime = {1,659,17,115,2154,1949,2731};

        ArrayList<Integer> primeResult = new ArrayList<>();

        for (int testPrim : prime) {
            if (testerPrimEffizenter(testPrim)){
                primeResult.add(testPrim);
            }
        }

        for (Integer primeZahl : primeResult) {
            System.out.println("Dieses ist eine Primzahl:" +  primeZahl);
        }
    }

    static boolean testerPrim(int testPrim){
        if(testPrim == 1){
            return false;
        }

        for (int i = 2; i < testPrim/2; i++) {
            if(testPrim % i == 0){
                return false;
            }
        }
        return true;
    }

    static boolean testerPrimEffizenter(int testPrim){
        if(testPrim == 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(testPrim); i++) {
            if(testPrim % i == 0){
                return false;
            }
        }
        return true;
    }
}