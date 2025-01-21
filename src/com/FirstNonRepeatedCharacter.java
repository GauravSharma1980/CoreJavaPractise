package com;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatedChar(input);
        System.out.println("First non-repeated character is: " + result);
    }

    public static char findFirstNonRepeatedChar(String input) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("charCountMap::"+charCountMap);

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("No non-repeated character found");
    }
}
