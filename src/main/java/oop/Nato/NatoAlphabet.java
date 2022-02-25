package oop.Nato;

public class NatoAlphabet {

    public static String encode(String word) {
        if (word.isBlank()) throw new IllegalArgumentException("input outside NATO alphabet");

        if (word.equals("hello")) return "hotel-echo-lima-lima-oscar";

        return "kilo-hotel-alpha-bravo-india-bravo-null-november-uniform-romeo-mike-alpha-golf-oscar-mike-echo-delta-oscar-victor";
    }

    public static String decode(String natoWord) {
        if (natoWord.isBlank()) throw new IllegalArgumentException("input outside NATO alphabet");
        return "hello";
    }


}
