package cn.edu.sustc;

import Analyzer.WordAnalyzer_demo2;
import FileReaders.FileInput;
import Tokenizer.ChineseWordTokenizer;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.StandardTokenizer;

import java.util.List;

public class FinalPractice {
    public static void main(String[] args) {
        String text = FileInput.readFile("dpcq.txt");
        WordAnalyzer_demo2 realPractice = new WordAnalyzer_demo2();
        List<List<Term>> sentences = StandardTokenizer.seg2sentence(text);
        for (List<Term> en: sentences
                ) {
            String[] word =ChineseWordTokenizer.sentenceDivider(en);
            for (String e :word
                    ) {
                realPractice.put(e);
            }
        }
        System.out.println(realPractice);
    }
}
