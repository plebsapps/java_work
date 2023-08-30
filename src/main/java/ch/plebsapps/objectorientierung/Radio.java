package ch.plebsapps.objectorientierung;

public class Radio {
    private String name;
    private String senderName;

    public static Radio ofName(String name){
        Radio radio = new Radio();
        radio.name = name;
        return radio;
    }
}
