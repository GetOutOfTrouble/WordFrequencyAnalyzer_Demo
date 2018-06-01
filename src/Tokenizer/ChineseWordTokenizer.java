package Tokenizer;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.corpus.tag.Nature;
import com.hankcs.hanlp.seg.common.Term;
import java.util.List;

public class ChineseWordTokenizer {
    /**
     *
     * @param sentence: sentence contain nothing else but chinese word
     * @return divided chinese word
     */
    public static String[] sentenceDivider(String sentence) {

        List<Term> termList = HanLP.segment(sentence);
        String[] word = new String[termList.size()];
        int i =0;
        for (Term en : termList) {
            word[i++]=en.word;
        }
        return word;
    }

    /**
     * 去除标点符号（数字要不要去除？）
     * @param termList
     * @return divided chinese word
     */
    public static String[] sentenceDivider(List<Term>termList) {

        String[] word = new String[termList.size()];
        int i =0;
        for (Term en : termList) {
            if(en.nature.firstChar()!='w'&&!en.nature.equals(Nature.nx))// 不是标点符号,包括英文标点(以及英文字母）
                word[i++]=en.word;
        }
        String[] newWord = new String[i];
        System.arraycopy(word,0,newWord,0,i);
        return newWord;
    }

}
