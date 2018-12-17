package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String testString;
        System.out.println("Enter a string for me to count characters:");
        testString = in.nextLine();
        char[] charactersInString = testString.toCharArray();

        for (char character : charactersInString) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            } else {
                characterCounts.put(character, 1);
            }
        }


        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }
}
