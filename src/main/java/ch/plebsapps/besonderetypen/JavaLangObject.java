package ch.plebsapps.besonderetypen;

import java.util.Objects;

public class JavaLangObject {

    public static void main(String[] args) {

    }

}

class Thing{
    String name;

    // Das Implementieren von equals() und hashCode() kann man komplett von der Intellj IDE erledigen lassen?
    // Dafür drückt man, wenn man in der Klasse steht, [ALT + einfg.] und wählt equals() und hashCode() aus.
    // Wählt z.B.: das "IntellJ" Template aus und am besten übernimmt man alle Einstellungen so wie diese sind,
    // falls man nicht etwas Besonderes vorhat.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Thing thing = (Thing) o;

        return Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
