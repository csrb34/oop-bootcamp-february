package oop.greeter;

public class Greet {

    public String sayHello(String name) {
        String nameUpdated = capitaliseFirstLetter(name) + getRestOfTheName(name);
        return String.format("Hello %s", nameUpdated);
    }

    public String trimName(String name, int trimTheNameStartingIndex, int trimTheNameEndingIndex) {
        return name.substring(trimTheNameStartingIndex, trimTheNameEndingIndex);
    }

    private String capitaliseFirstLetter(String name) {
        return trimName(name, 0, 1).toUpperCase();
    }

    private String getRestOfTheName(String name) {
        return trimName(name, 1, name.length());
    }
}
