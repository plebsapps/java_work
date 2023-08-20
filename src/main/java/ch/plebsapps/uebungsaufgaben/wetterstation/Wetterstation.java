package ch.plebsapps.uebungsaufgaben.wetterstation;

import java.util.Properties;
import java.util.Set;

public class Wetterstation {
    public static void main(String[] args){

        Properties stationen = new Properties();

        //1. Speichere die folgende Tabelle mit einem geeigneten Datentyp.
        stationen.put(1,12);
        stationen.put(2,14);
        stationen.put(3,9);
        stationen.put(4,12);
        stationen.put(5,15);
        stationen.put(6,16);
        stationen.put(7,15);
        stationen.put(8,15);
        stationen.put(9,11);
        stationen.put(10,8);
        stationen.put(11,13);
        stationen.put(12,13);
        stationen.put(13,15);
        stationen.put(14,12);

        //2. Schreibe ein Programm, welches die Durchschnittstemperatur für die zwei Wochen bestimmt.
        System.out.printf("Die Durchschnittstemperatur war: %.2f \n", duerchschnittTemp(stationen));

        //3. Schreibe ein Programm, welches die maximale und minimale Temperatur ausgibt.
        System.out.println("Die Temperatur sind von MIN: " + min(stationen) + " bis Max: " + max(stationen));

        //4. Schreibe ein Programm, welches die beiden aufeinanderfolgenden Tage angeben kann, an denen es den größten Temperaturumschwung gab.
        System.out.println("Dem größten Temperaturumschwung gab es auf dem: " + maxDiff(stationen) + " tag");

        //5. Schreibe ein Programm, welches die Tabelle schön tabellarisch auf der Konsole ausgibt.
        showTabel(stationen);
    }

    public static double duerchschnittTemp(Properties p){
        Double duerchschnitt = 0.0;
        int tage = 0;

        // Erhalten Sie die Menge der Schlüssel aus den Properties
        Set keys = p.keySet();

        for (Object key : keys) {
            int value = (int) p.get(key);
            tage++;
            duerchschnitt += value;
        }

        return duerchschnitt / tage;
    }

    public static void showTabel(Properties p){
        // Erhalten Sie die Menge der Schlüssel aus den Properties
        Set keys = p.keySet();

        System.out.println("Tag | Temp");

        for (Object key : keys) {
            int value = (int) p.get(key);
            System.out.printf(" %2d |   %2d \n", key , value);
        }
    }

    public static int min(Properties p){
        int min = 100;

        Set keys = p.keySet();
        for (Object key : keys){
            min = Math.min(min, (int) p.get(key));
        }

        return min;
    }

    public static int max(Properties p){
        int max = 0;

        Set keys = p.keySet();
        for (Object key : keys){
            max = Math.max(max, (int) p.get(key));
        }

        return max;
    }

    public static int maxDiff(Properties p){
        int maxDiff = 0;
        int retKey = 0;

        for (int key = 2; key < p.size(); key++) {
            int dif = Math.abs((int) p.get(key) - (int) p.get(key-1));

            if (dif > maxDiff){
                retKey = key;
            }
            maxDiff = Math.max(maxDiff, dif);

        }

        return retKey;
    }

}
