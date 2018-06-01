package Analyzer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class WordAnalyzer_demo2 {
    // holds words and frequencies
    private HashMap<String, Integer> wordsAndFreq ;

    public WordAnalyzer_demo2() {
        wordsAndFreq = new HashMap<>();
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
     * @return returns the map containing the words and frequencies.(unsorted)
     */
    public HashMap<String, Integer> getWordMap() {
        // returning the copy of hashMap
        return wordsAndFreq;
    }
    @Override
    public String toString() {
        Set<Map.Entry<String, Integer>> entries  =wordsAndFreq.entrySet();
        TreeSet<Map.Entry<String, Integer>> sort = new TreeSet<>(((o1, o2) -> {if (o1.getValue()!=o2.getValue())return o1.getValue()-o2.getValue();
        else return o1.getKey().hashCode()-o2.getKey().hashCode();}));
        sort.addAll(entries);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> en: sort
             ) {
            sb.append(en.getKey());
            sb.append(": ");
            sb.append(en.getValue());
            sb.append("\n");
        }
        return  sb.toString();
    }
}
