package ch.plebsapps.objectorientierung;

public class OverrideMethod {
    public static void main(String[] args) {
        //Referenztyp      Objekttyp
        Appliance r1 = new FireAlarm();

    }
}

class Appliance {
    private double watt;

    public Appliance log(){
        return this;
    }

    public final double watt(){
        return watt;
    }
}

class FireAlarm extends Appliance{
    @Override
    public FireAlarm log() {
        return this;
    }
}

class RadioAnlage extends Appliance{

}