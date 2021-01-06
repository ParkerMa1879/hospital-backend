package com.example.demo.assessment.recognition.Execution;
import javax.persistence.*;

@Entity
@Table (name = "tb_execution")
public class Execution {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "basicInfo_Id")
    private String basicInfoId;

    @Column(name = "类别流畅性")
    private String sum_score;

    @Column(name = "语流动物15s")
    private String answer1;

    @Column(name = "语流动物30s")
    private String answer2;

    @Column(name = "语流动物45s")
    private String answer3;

    @Column(name = "语流动物60s")
    private String answer4;

    @Column(name = "S1正确")
    private String question1;

    @Column(name = "S1测试者更正")
    private String question2;

    @Column(name = "S1自我更正")
    private String question3;

    @Column(name = "S1时间")
    private String question4;

    @Column(name = "S2正确")
    private String question5;

    @Column(name = "S2测试者更正")
    private String question6;

    @Column(name = "S2自我更正")
    private String question7;

    @Column(name = "S2时间")
    private String question8;

    @Column(name = "S3正确")
    private String question9;

    @Column(name = "S3测试者更正")
    private String question10;

    @Column(name = "S3自我更正")
    private String question11;

    @Column(name = "S3时间")
    private String question12;

    @Column(name = "色盲色弱可疑")
    private String question13;

    @Column(name = "Stroop备注")
    private String question14;

    @Column(name = "TMT1自我更正")
    private String question15;

    @Column(name = "TMT1测试者更正")
    private String question16;

    @Column(name = "TMT1时间")
    private String question17;

    @Column(name = "TMT1提示")
    private String question18;

    @Column(name = "TMT2自我更正")
    private String question19;

    @Column(name = "TMT2测试者更正")
    private String question20;

    @Column(name = "TMT2时间")
    private String question21;

    @Column(name = "TMT2提示")
    private String question22;

    @Column(name = "连线测验备注")
    private String question23;

    public Execution(){
    }

    public Execution(String basicInfoId, String sum_score, String answer1, String answer2, String answer3,
                     String answer4, String question1, String question2, String question3, String question4,
                     String question5, String question6, String question7, String question8, String question9,
                     String question10, String question11, String question12, String question13, String question14,
                     String question15, String question16, String question17, String question18, String question19,
                     String question20, String question21, String question22, String question23) {
        this.basicInfoId = basicInfoId;
        this.sum_score = sum_score;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
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
        this.question18 = question18;
        this.question19 = question19;
        this.question20 = question20;
        this.question21 = question21;
        this.question22 = question22;
        this.question23 = question23;
    }

    public String getId() {
        return id;
    }

    public String getBasicInfoId() {
        return basicInfoId;
    }

    public void setBasicInfoId(String basicInfoId) {
        this.basicInfoId = basicInfoId;
    }

    public String getSum_score() {
        return sum_score;
    }

    public void setSum_score(String sum_score) {
        this.sum_score = sum_score;
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

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
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

    public String getQuestion21() {
        return question21;
    }

    public void setQuestion21(String question21) {
        this.question21 = question21;
    }

    public String getQuestion22() {
        return question22;
    }

    public void setQuestion22(String question22) {
        this.question22 = question22;
    }

    public String getQuestion23() {
        return question23;
    }

    public void setQuestion23(String question23) {
        this.question23 = question23;
    }

    @Override
    public String toString() {
        return "Execution{" +
                "id='" + id + '\'' +
                ", basicInfoId='" + basicInfoId + '\'' +
                ", sum_score='" + sum_score + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", answer4='" + answer4 + '\'' +
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
                ", question18='" + question18 + '\'' +
                ", question19='" + question19 + '\'' +
                ", question20='" + question20 + '\'' +
                ", question21='" + question21 + '\'' +
                ", question22='" + question22 + '\'' +
                ", question23='" + question23 + '\'' +
                '}';
    }
}
