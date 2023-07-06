package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringHandler {
    private final static String WORD_SEPARATE = "\\s+";
    private final static char DEFAULT_RETURN_SYMBOL = '\0';

    public char findMagicSymbol(String string) {
        String[] words = string.trim().trim().split(WORD_SEPARATE);
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
        return DEFAULT_RETURN_SYMBOL;
    }
}
