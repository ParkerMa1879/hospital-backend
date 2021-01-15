package com.example.demo.assessment.recognition.Memory;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "memorys")
public class Memory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "basicInfoId")
    private long basicInfoId;

    @Temporal(TemporalType.DATE)
    @Column (name = "测试日期")
    private Date date;

    @Column(name = "听觉词语学习即刻")
    private String sum_score_1;

    @Column(name = "AVLTIR1")
    private String answer1;

    @Column(name = "AVLTIR2")
    private String answer2;

    @Column(name = "AVLTIR3")
    private String answer3;

    @Column(name = "AVLT插入个")
    private String question1;

    @Column(name = "AVLT插入次")
    private String question2;

    @Column(name = "AVLT重复")
    private String question3;

    @Column(name = "AVLT策略1有0无")
    private String question4;

    @Column(name = "听觉词语学习短延时")
    private String question5;

    @Column(name = "AVLT插入个1")
    private String question6;

    @Column(name = "AVLT插入次1")
    private String question7;

    @Column(name = "AVLT重复1")
    private String question8;

    @Column(name = "AVLT策略1有0无1")
    private String question9;

    @Column(name = "听觉词语学习长延时")
    private String question10;

    @Column(name = "AVLTDDR服饰")
    private String question11;

    @Column(name = "AVLTDDR职业")
    private String question12;

    @Column(name = "AVLTDDR花卉")
    private String question13;

    @Column(name = "AVLT插入个2")
    private String question14;

    @Column(name = "AVLT插入次2")
    private String question15;

    @Column(name = "AVLT重复2")
    private String question16;

    @Column(name = "AVLT策略1有0无2")
    private String question17;

    @Column(name = "听觉词语学习再认")
    private String sum_score_2;

    @Column(name = "AVLT再认")
    private String answer4;

    @Column(name = "AVLT排除画钟4分法")
    private String answer5;

    @Column(name = "数字正背")
    private String question18;

    @Column(name = "数字倒背")
    private String question19;

    @Column(name = "DOTA")
    private String question20;

    public Memory(){}

    public Memory(long basicInfoId, Date date, String sum_score_1, String answer1, String answer2, String answer3,
                  String question1, String question2, String question3, String question4, String question5,
                  String question6, String question7, String question8, String question9, String question10,
                  String question11, String question12, String question13, String question14, String question15,
                  String question16, String question17, String sum_score_2, String answer4, String answer5,
                  String question18, String question19, String question20) {
        this.basicInfoId = basicInfoId;
        this.date = date;
        this.sum_score_1 = sum_score_1;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
        this.question4 = question4;
        this.question5 = question5;
        this.question6 = question6;
        this.question7 = question7;
        this.question8 = question8;
        this.question9 = question9;
        this.question10 = question10;
        this.question11 = question11;
        this.question12 = question12;
        this.question13 = question13;
        this.question14 = question14;
        this.question15 = question15;
        this.question16 = question16;
        this.question17 = question17;
        this.sum_score_2 = sum_score_2;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.question18 = question18;
        this.question19 = question19;
        this.question20 = question20;
    }

    public long getId() {
        return id;
    }

    public long getBasicInfoId() {
        return basicInfoId;
    }

    public void setBasicInfoId(long basicInfoId) {
        this.basicInfoId = basicInfoId;
    }

    public Date getDate() {return date; }

    public void setDate(Date date){this.date = date;}

    public String getSum_score_1() {
        return sum_score_1;
    }

    public void setSum_score_1(String sum_score_1) {
        this.sum_score_1 = sum_score_1;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    public String getQuestion5() {
        return question5;
    }

    public void setQuestion5(String question5) {
        this.question5 = question5;
    }

    public String getQuestion6() {
        return question6;
    }

    public void setQuestion6(String question6) {
        this.question6 = question6;
    }

    public String getQuestion7() {
        return question7;
    }

    public void setQuestion7(String question7) {
        this.question7 = question7;
    }

    public String getQuestion8() {
        return question8;
    }

    public void setQuestion8(String question8) {
        this.question8 = question8;
    }

    public String getQuestion9() {
        return question9;
    }

    public void setQuestion9(String question9) {
        this.question9 = question9;
    }

    public String getQuestion10() {
        return question10;
    }

    public void setQuestion10(String question10) {
        this.question10 = question10;
    }

    public String getQuestion11() {
        return question11;
    }

    public void setQuestion11(String question11) {
        this.question11 = question11;
    }

    public String getQuestion12() {
        return question12;
    }

    public void setQuestion12(String question12) {
        this.question12 = question12;
    }

    public String getQuestion13() {
        return question13;
    }

    public void setQuestion13(String question13) {
        this.question13 = question13;
    }

    public String getQuestion14() {
        return question14;
    }

    public void setQuestion14(String question14) {
        this.question14 = question14;
    }

    public String getQuestion15() {
        return question15;
    }

    public void setQuestion15(String question15) {
        this.question15 = question15;
    }

    public String getQuestion16() {
        return question16;
    }

    public void setQuestion16(String question16) {
        this.question16 = question16;
    }

    public String getQuestion17() {
        return question17;
    }

    public void setQuestion17(String question17) {
        this.question17 = question17;
    }

    public String getSum_score_2() {
        return sum_score_2;
    }

    public void setSum_score_2(String sum_score_2) {
        this.sum_score_2 = sum_score_2;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getAnswer5() {
        return answer5;
    }

    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
    }

    public String getQuestion18() {
        return question18;
    }

    public void setQuestion18(String question18) {
        this.question18 = question18;
    }

    public String getQuestion19() {
        return question19;
    }

    public void setQuestion19(String question19) {
        this.question19 = question19;
    }

    public String getQuestion20() {
        return question20;
    }

    public void setQuestion20(String question20) {
        this.question20 = question20;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "id='" + id + '\'' +
                ", basicInfoId='" + basicInfoId + '\'' +
                ", sum_score_1='" + sum_score_1 + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", question1='" + question1 + '\'' +
                ", question2='" + question2 + '\'' +
                ", question3='" + question3 + '\'' +
                ", question4='" + question4 + '\'' +
                ", question5='" + question5 + '\'' +
                ", question6='" + question6 + '\'' +
                ", question7='" + question7 + '\'' +
                ", question8='" + question8 + '\'' +
                ", question9='" + question9 + '\'' +
                ", question10='" + question10 + '\'' +
                ", question11='" + question11 + '\'' +
                ", question12='" + question12 + '\'' +
                ", question13='" + question13 + '\'' +
                ", question14='" + question14 + '\'' +
                ", question15='" + question15 + '\'' +
                ", question16='" + question16 + '\'' +
                ", question17='" + question17 + '\'' +
                ", sum_score_2='" + sum_score_2 + '\'' +
                ", answer4='" + answer4 + '\'' +
                ", answer5='" + answer5 + '\'' +
                ", question18='" + question18 + '\'' +
                ", question19='" + question19 + '\'' +
                ", question20='" + question20 + '\'' +
                '}';
    }
}
