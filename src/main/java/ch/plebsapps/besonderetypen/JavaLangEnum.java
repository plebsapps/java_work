package ch.plebsapps.besonderetypen;

public class JavaLangEnum{
    public static void main(String[] args) {
        // ausgabeEnum();
        // valueOfEnum();
        // forEnum();
        // dreiMoeglichkeiten();
        // ausgabedefaultCountry();
        // ausgabeIso2();
        // ausgabeRandomCounty();
        // ausgabeIsoCode();
        enumMitSchnittstelle();
    }

    private static void enumMitSchnittstelle() {

        System.out.println(Country3.USA.isBig());
        System.out.println(Country3.UK.isBig());
        System.out.println(Country3.GERMANY.isBig());
    }

    private static void ausgabeIsoCode() {
        System.out.println(Country.GERMANY.iso());
        System.out.println(Country.UK.iso());
        System.out.println(Country.USA.iso());
    }

    private static void ausgabeRandomCounty() {
        System.out.println(Country.random());
        System.out.println(Country.random());
        System.out.println(Country.random());
        System.out.println(Country.random());
    }

    private static void ausgabedefaultCountry() {
        System.out.println(Country.defaultCountry());
    }

    private static void ausgabeIso2() {
        Country2 country = Country2.UK;
        System.out.println(country.getIso());
    }

    private static void dreiMoeglichkeiten() {
        Country germany = Country.GERMANY;

        System.out.println(germany);
        System.out.println(germany.name());
        System.out.println(germany.toString());
    }

    private static void forEnum() {
        for (Country value: Country.values()){
            System.out.println(value);
        }
    }

    private static void valueOfEnum() {
        System.out.println(Country.valueOf("UK"));
        System.out.println(Country.valueOf("Uk"));
    }

    private static void ausgabeEnum() {
        Country germany = Country.GERMANY;
        System.out.println(germany);
        System.out.println(germany.toString());
        System.out.println(germany.ordinal());
        System.out.println(germany.compareTo(Country.UK));
        System.out.println(germany.compareTo(Country.USA));
    }
}

enum Country {
    GERMANY, UK, USA;

    public static Country defaultCountry(){
        return GERMANY;
    }
    public static Country random() {
        return values()[(int)(Math.random()*3)];
    }

    public String iso(){
        return switch (this){
            case GERMANY ->  "de";
            case UK -> "uk";
            case USA -> "usa";
        };
    }
}

enum Country2 {
    GERMANY("de"), UK("uk"), USA("usa");

    private final String iso;
    Country2(String iso){this.iso = iso;}

    public String getIso(){
        return iso;
    };
}

interface IsBigCountry{
 boolean isBig();
}

enum Country3 implements IsBigCountry{
    GERMANY("de"), UK("uk"),
    USA("usa") {
        @Override
        public boolean isBig() {
            return true;
        }
    };

    Country3(String de) {
    }

    @Override
    public boolean isBig() {
        return false;
    }
}