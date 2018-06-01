package cn.edu.sustc;
import Analyzer.WordAnalyzer_demo2;

public class Main {

    public static void main(String[] args) {
        WordAnalyzer_demo2 w = new WordAnalyzer_demo2();
        w.put("年后");w.put("年后");w.put("年后");w.put("年后");w.put("年后");
        w.put("你好");w.put("你好");w.put("你好");
        w.put("詹姆斯");  w.put("詹姆斯");
        w.put("史密斯");   w.put("史密斯");
        w.put("逼");
        System.out.print(w);
    }
}
