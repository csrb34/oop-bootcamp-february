package oop.greeter;

import java.time.Clock;
import java.time.LocalDateTime;

public class Greet {

    private Clock clock;

    public Greet(Clock clock) {
        this.clock = clock;
    }

    public String greet(String name) {
        int hour = LocalDateTime.now(clock).getHour();
        String nameUpdated = capitaliseFirstLetter(name) + getRestOfTheName(name);
        if (6 <= hour && hour < 12) {
            return String.format("Good morning %s", nameUpdated);
        }
        if (18 <= hour && hour < 22) {
            return String.format("Good evening %s", nameUpdated);
        }

        if (22<= hour && hour<24 || 0<=hour&& hour < 6) {
            return String.format("Good night %s", nameUpdated);
        }

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
