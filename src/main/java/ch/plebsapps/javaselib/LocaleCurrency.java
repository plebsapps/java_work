package ch.plebsapps.javaselib;

import java.util.Currency;
import java.util.Locale;

public class LocaleCurrency {

    public static void main(String[] args) {

        //getInformationGerman(Locale.GERMAN);
        //getPrintfWithLocal();
        getCurrency();
        //TODO Currency sollte man vertiefen.....
    }


    private static void getCurrency() {

        for (Currency availableCurrency : Currency.getAvailableCurrencies()) {
            System.out.println(availableCurrency + " " + availableCurrency.getDisplayName());
        }
    }

    private static void getPrintfWithLocal() {

        //Mit Tausendser Trenner
        System.out.printf(Locale.US, "%,f%n", 10000000.5);
        System.out.printf(Locale.GERMANY, "%,f%n", 10000000.5);
        System.out.printf(Locale.CHINA, "%,f%n", 10000000.5);

        //Ohne Tausender Trenner
        System.out.printf(Locale.US, "%f%n", 10000000.5);
        System.out.printf(Locale.GERMANY, "%f%n", 10000000.5);
        System.out.printf(Locale.CHINA, "%f%n", 10000000.5);

    }

    private static void getInformationGerman(Locale local) {
        System.out.println(local.toLanguageTag());
        System.out.println("getLanguage() = " + local.getLanguage());
        System.out.println("getCountry() = " + local.getCountry());
        System.out.println("getDisplayName() = " + local.getDisplayName());
        System.out.println("getDisplayCountry() = " + local.getDisplayCountry());

        local = Locale.US;

        System.out.println(local.toLanguageTag());
        System.out.println("getLanguage() = " + local.getLanguage());
        System.out.println("getCountry() = " + local.getCountry());
        System.out.println("getDisplayName() = " + local.getDisplayName());
        System.out.println("getDisplayCountry() = " + local.getDisplayCountry());

        local = Locale.CANADA;

        System.out.println(local.toLanguageTag());
        System.out.println("getLanguage() = " + local.getLanguage());
        System.out.println("getCountry() = " + local.getCountry());
        System.out.println("getDisplayName() = " + local.getDisplayName());
        System.out.println("getDisplayCountry() = " + local.getDisplayCountry());

    }
}
