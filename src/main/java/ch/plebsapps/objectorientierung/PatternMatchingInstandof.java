package ch.plebsapps.objectorientierung;

public class PatternMatchingInstandof {

    public static void main(String[] args) {
        Tier einTier = new Katze();

        if (einTier instanceof Hund hund) {
            System.out.println("Das Tier ist ein Hund.");
        } else if (einTier instanceof Katze katze ) {
            System.out.println("Das Tier ist eine Katze.");
        } else if (einTier instanceof Tier) {
            System.out.println("Das Tier ist eine allgemeine Tierklasse.");
        } else {
            System.out.println("Das Tier gehört zu keiner der oben genannten Klassen.");
        }
    }

}
class Tier {}
class Hund extends Tier {}
class Katze extends Tier {}


