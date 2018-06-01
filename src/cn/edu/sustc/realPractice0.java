package cn.edu.sustc;

import Analyzer.WordAnalyzer_demo2;
import Tokenizer.ChineseWordTokenizer;

public class realPractice0 {
    public static void main(String[] args) {
        WordAnalyzer_demo2 realPractice = new WordAnalyzer_demo2();
        String[] testCase = new String[]{
                "商品和服务",
                "当下雨天地面积水分外严重",
                "结婚的和尚未结婚的确实在干扰分词啊",
                "买水果然后来世博园最后去世博会",
                "中国的首都是北京",
                "欢迎新老师生前来就餐",
                "工信处女干事每月经过下属科室都要亲口交代24口交换机等技术性器件的安装工作"
        };
        for (String en: testCase
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
