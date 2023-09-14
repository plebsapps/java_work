package ch.plebsapps.uebungsaufgaben.kopieren;

import java.util.LinkedList;

public class FlacheOderTiefeKopie {

    public static void main(String[] args) {
        LinkedList<Player> players1 = new LinkedList<>();
        Player p1 = new Player();
        p1.setBattingAverage(46.7f);
        p1.setWorldRank(4);

        Player p2 = new Player();
        p2.setBattingAverage(56.9f);
        p2.setWorldRank(1);

        players1.add(p1);
        players1.add(p2);

        //flache Kopie
        LinkedList<Player> players2 = flatCopy(players1);

        System.out.println(players2.get(0).getWorldRank());
        System.out.println(players1.get(0).getWorldRank());

        players2.get(0).setWorldRank(5);

        System.out.println(players2.get(0).getWorldRank());
        System.out.println(players1.get(0).getWorldRank());


        //tiefe Kopie
        LinkedList<Player> players3 = deapCopy(players1);

        System.out.println(players3.get(0).getWorldRank());
        System.out.println(players1.get(0).getWorldRank());

        players2.get(0).setWorldRank(6);

        System.out.println(players3.get(0).getWorldRank());
        System.out.println(players1.get(0).getWorldRank());
    }


    /*
    Der folgende Code erstellt eine "tiefe Kopie" der Liste players1.
    Eine tiefe Kopie bedeutet, dass nicht nur die Liste selbst kopiert wird,
    sondern auch die darin enthaltenen Elemente (in diesem Fall die Player-Objekte) tatsächlich dupliziert werden.

    In diesem Code wird eine neue Liste players erstellt,
    und für jedes Player-Objekt in players1 wird ein neues Player-Objekt erstellt.
    Die Werte der Eigenschaften (Batting Average und World Rank) des ursprünglichen Player-Objekts werden
    auf das entsprechende Feld im neuen Player-Objekt kopiert. Dies gewährleistet,
    dass Änderungen an den Player-Objekten in players keine Auswirkungen auf die entsprechenden Objekte in players1 haben,
     da es sich um separate Instanzen handelt.

    Insgesamt erstellt dieser Code also eine tiefe Kopie der Liste players1,
    die vollständig unabhängig von der ursprünglichen Liste ist.
     */
    private static LinkedList<Player> deapCopy(LinkedList<Player> players1) {
        LinkedList<Player> players = new LinkedList<>();

        for (Player player : players1) {
            Player playerNew = new Player();
            playerNew.setBattingAverage(player.getBattingAverage());
            playerNew.setWorldRank(player.getWorldRank());

            players.add(playerNew);
        }

        return players;
    }


    /*
    "flache Kopie"

    In Ihrem Code wurde eine sogenannte "flache Kopie" der Liste players1 erstellt.
    Das bedeutet, dass players2 eine neue Liste ist, die dieselben Elemente
    (in diesem Fall Spielerobjekte) wie players1 enthält, aber nicht die eigentlichen Objekte kopiert.

    Wenn Sie eine Operation auf einem Element in players2 ausführen,
    das auf dasselbe Objekt in players1 verweist (z. B. players2.get(0).setWorldRank(5)),
    wird das ursprüngliche Objekt in players1 ebenfalls geändert.
    Das liegt daran, dass beide Listen auf die gleichen Objekte in Ihrem Speicher verweisen.
     */
    private static LinkedList flatCopy(LinkedList<Player> players) {
        LinkedList<Player> players2 = new LinkedList<>();

        for (Player p : players) {
            players2.add(p);
        }
        return players2;
    }
}

class Player {
    public Player() {
    }

    double battingAverage;
    int worldRank;

    public double getBattingAverage() {
        return battingAverage;
    }

    public Player setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
        return this;
    }

    public int getWorldRank() {
        return worldRank;
    }

    public Player setWorldRank(int worldRank) {
        this.worldRank = worldRank;
        return this;
    }
}

