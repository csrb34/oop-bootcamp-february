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
        String nameUpdated = formatName(name);

        if (6 <= hour && hour < 12) {
            return String.format("Good morning %s", nameUpdated);
        }
        if (18 <= hour && hour < 22) {
            return String.format("Good evening %s", nameUpdated);
        }

        if (22 <= hour && hour < 24 || 0 <= hour && hour < 6) {
            return String.format("Good night %s", nameUpdated);
        }

        return String.format("Hello %s", nameUpdated);
    }


    private String formatName(String name) {
        return capitaliseFirstLetter(name.trim());
    }

    private String capitaliseFirstLetter(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
