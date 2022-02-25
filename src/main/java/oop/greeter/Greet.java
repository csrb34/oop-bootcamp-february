package oop.greeter;

import java.time.Clock;
import java.time.LocalDateTime;

public class Greet {

    private Clock clock;

    public Greet(Clock clock) {
        this.clock = clock;
    }

    public String greet(String name) {
        int currentHour = LocalDateTime.now(clock).getHour();
        String nameFormatted = formatName(name);

        if (6 <= currentHour && currentHour < 12) {
            return String.format("Good morning %s", nameFormatted);
        }
        if (18 <= currentHour && currentHour < 22) {
            return String.format("Good evening %s", nameFormatted);
        }

        if (22 <= currentHour && currentHour < 24 || 0 <= currentHour && currentHour < 6) {
            return String.format("Good night %s", nameFormatted);
        }

        return String.format("Hello %s", nameFormatted);
    }


    private String formatName(String name) {
        return capitaliseFirstLetter(name.trim());
    }

    private String capitaliseFirstLetter(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

//    private static final Pair<LocalTime, LocalTime> MORNING_LIMITS = new ImmutablePair(LocalTime.of(6, 0), LocalTime.of(12, 0));
//    private static final Pair<LocalTime, LocalTime> EVENING_LIMITS = new ImmutablePair(LocalTime.of(12, 0), LocalTime.of(22, 0));
}
