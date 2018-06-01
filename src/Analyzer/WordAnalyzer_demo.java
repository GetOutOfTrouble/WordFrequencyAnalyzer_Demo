package Analyzer;

import java.util.HashMap;
import java.util.Map;

public class WordAnalyzer_demo {
    // holds words and frequencies
    private Map<String, Integer> wordsAndFreq = new HashMap<>();

    public WordAnalyzer_demo() {
        wordsAndFreq.clear(); // clearing initially
    }

    /**
     * put the word into hashMap
     * @param Word : every separated word to count
     */
    public void put(String Word) {
        if (wordsAndFreq.containsKey(Word)) {

            int val = wordsAndFreq.get(Word) + 1;
            wordsAndFreq.put(Word, val);
        } else {
            wordsAndFreq.put(Word, 1);
        }
    }

    /**
     * @return returns the map containing the words and frequencies.
     */
    public HashMap<String, Integer> getWordMap() {
        // returning the copy of hashMap
        return new HashMap<>(wordsAndFreq);// returning copy
    }
}
