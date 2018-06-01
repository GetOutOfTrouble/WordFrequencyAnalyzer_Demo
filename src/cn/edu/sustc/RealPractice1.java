package cn.edu.sustc;

import Analyzer.WordAnalyzer_demo2;
import Tokenizer.ChineseWordTokenizer;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.StandardTokenizer;

import java.util.List;

public class RealPractice1 {
    public static void main(String[] args) {
        String text = "几乎不被所有人看好的情况下，骑士就这样踏上了连续第四年总决赛之旅，泰伦·卢和詹姆斯都明确表示，面对卫冕冠军金州勇士，骑士今年就是以挑战者的姿态去拼每一场比赛。\n" +
                "但当总决赛真正开始以后，骑士的表现让所有人刮目相看，他们在半场结束的时候与勇士战平。可所有人都知道，下半场的勇士才是那支更加令人胆寒的球队。今年季后赛期间，勇士第三节总共净胜对手130分。但因为过去三年的总决赛相遇，骑士是联盟里最了解勇士的那支球队，而西部决赛火箭的遭遇，是骑士借鉴学习的最好案例。到了第三节，克利夫兰顶住了勇士的进攻浪潮，他们单节只输掉6分，并且在最后一节重新掌控了场上的主动权。\n" +
                "\n" +
                "距离总决赛第一场比赛的胜利，克利夫兰骑士原本近在迟尺。当詹姆斯命中超远距离三分，扛着两名勇士球员杀入内线，骑士已经将分差抹平。但常规时间结束前最后一分钟的一个关键回合，成为了今晚比赛的转折点。\n" +
                "第四节还剩36秒左右，杜兰特突破杀伤骑士内线，詹姆斯放弃防守身边的德雷蒙德·格林，上前补防杜兰特并摔倒在地。当时裁判吹罚了杜兰特进攻犯规，但经过裁判和回放中心沟通后，最终判定詹姆斯阻挡犯规，杜兰特随后两罚全中。\n" +
                "\n" +
                "裁判的改判令骑士球员十分不满，比赛结束之后，主帅泰伦·卢在新闻发布会上表示：“当时詹姆斯站在合理冲撞区以外，但你最后改判为阻挡犯规。不，这是历史上从没出现过的局面，尤其是今晚，在总决赛这样一个最大的舞台。”\n" +
                "“球员竭尽全力在场上打球，这样的吹罚是不对的，真的不应该这样”，泰伦·卢赛后依旧十分不满。\n" +
                "虽然卢指导和骑士的内心十分沮丧，但根据联盟2012-13赛季出台的新规定，裁判可以在第四节最后两分钟和加时赛中，通过录像回放对不确定的判罚，维持原判或者修改判罚。根据回放画面，当时詹姆斯没有提前占住位置，因此裁判改判阻挡犯规，并没有太大争议。\n";
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
