package oop.Nato;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

import static java.util.Map.entry;

public class NatoAlphabet {
    private static final Map<String, String> NATO_ALPHABET = ImmutableMap.ofEntries(
            entry("a", "alpha"),
            entry("b", "bravo"),
            entry("c", "charlie"),
            entry("d", "delta"),
            entry("e", "echo"),
            entry("f", "foxtrot"),
            entry("g", "golf"),
            entry("h", "hotel"),
            entry("i", "india"),
            entry("j", "juliett"),
            entry("k", "kilo"),
            entry("l", "lima"),
            entry("m", "mike"),
            entry("n", "november"),
            entry("o", "oscar"),
            entry("p", "papa"),
            entry("q", "quebec"),
            entry("r", "romeo"),
            entry("s", "sierra"),
            entry("t", "tango"),
            entry("u", "uniform"),
            entry("v", "victor"),
            entry("w", "whiskey"),
            entry("x", "xray"),
            entry("y", "yankee"),
            entry("z", "zulu"),
            entry("1", "one"),
            entry("2", "two"),
            entry("3", "three"),
            entry("4", "four"),
            entry("5", "five"),
            entry("6", "six"),
            entry("7", "seven"),
            entry("8", "eight"),
            entry("9", "nine"),
            entry("0", "zero"),
            entry(" ", "null")
    );

    public static String encode(String word) {
        if (word.isBlank()) throw new IllegalArgumentException("input outside NATO alphabet");

        String natoWord = "";
        for (int i =0; i < word.length(); i++){
            natoWord += NATO_ALPHABET.get(String.format("%c", word.charAt(i))) + "-";
        }
        return natoWord.substring(0,natoWord.length()-1);
    }

    public static String decode(String natoWord) {
        if (natoWord.isBlank()) throw new IllegalArgumentException("input outside NATO alphabet");
        return "hello";
    }


}
