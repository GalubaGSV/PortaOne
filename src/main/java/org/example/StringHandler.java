package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringHandler {
    public char findMagicSymbol(String string) {
        String[] words = string.trim().trim().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : words) {
            stringBuilder.append(findUniqueSymbolInWord(str));
        }
        return findUniqueSymbolInWord(stringBuilder.toString());
    }

    private char findUniqueSymbolInWord(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}
