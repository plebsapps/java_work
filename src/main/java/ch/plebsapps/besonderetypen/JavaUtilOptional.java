package ch.plebsapps.besonderetypen;


import java.util.Optional;

public class JavaUtilOptional {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        Optional<String> result = Optional.of("Rückgabe");
        Optional<Object> optional = Optional.ofNullable(null);
        Optional<Object> result2 = Optional.ofNullable("Rückgabe2");

        System.out.println(empty.isPresent());
        System.out.println(result.isPresent());
        System.out.println(optional.isPresent());
        System.out.println(result2.isPresent());

        System.out.println(empty.isEmpty());
        System.out.println(result.isEmpty());
        System.out.println(optional.isEmpty());
        System.out.println(result2.isEmpty());

        System.out.println(empty.orElse("Wat anderes"));
        System.out.println(result.get());

        Person person = new Person();
        System.out.println(person.getEhePartner());
    }
}

class Person {
    private Person ehepartner;

    public Optional<Person> getEhePartner(){
        return Optional.ofNullable(ehepartner);
    }
}
