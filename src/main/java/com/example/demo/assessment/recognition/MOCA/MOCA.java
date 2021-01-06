package com.example.demo.assessment.recognition.MOCA;
import javax.persistence.*;

@Entity
@Table (name = "tb_moca")
public class MOCA {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "basicInfo_Id")
    private String basicInfoId;

    @Column(name = "MoCA")
    private String sum_score;

    @Column(name = "执行")
    private String sum_score_1;

    @Column(name = "连线")
    private String answer1;

    @Column(name = "立方体")
    private String answer2;

    @Column(name = "画钟轮廓")
    private String answer3;

    @Column(name = "数字")
    private String answer4;

    @Column(name = "指针")
    private String answer5;

    @Column(name = "命名1")
    private String answer6;

    @Column(name = "即刻记忆1")
    private String question1;

    @Column(name = "即刻记忆2")
    private String question2;

    @Column(name = "注意")
    private String sum_score_2;

    @Column(name = "顺背")
    private String answer7;

    @Column(name = "倒背")
    private String answer8;

    @Column(name = "敲")
    private String answer9;

    @Column(name = "计算")
    private String answer10;

    @Column(name = "语言")
    private String sum_score_3;

    @Column(name = "重复")
    private String answer11;

    @Column(name = "流畅性")
    private String answer12;

    @Column(name = "抽象")
    private String answer13;

    @Column(name = "延迟回忆")
    private String answer14;

    @Column(name = "分类提示")
    private String question3;

    @Column(name = "多选提示")
    private String question4;

    @Column(name = "定向1")
    private String answer15;

    public MOCA(){
    }

    public MOCA(String basicInfoId, String sum_score, String sum_score_1, String answer1, String answer2, String answer3,
                String answer4, String answer5, String answer6, String question1, String question2, String sum_score_2,
                String answer7, String answer8, String answer9, String answer10, String sum_score_3, String answer11,
                String answer12, String answer13, String answer14, String question3, String question4, String answer15) {
        this.basicInfoId = basicInfoId;
        this.sum_score = sum_score;
        this.sum_score_1 = sum_score_1;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.question1 = question1;
        this.question2 = question2;
        this.sum_score_2 = sum_score_2;
        this.answer7 = answer7;
        this.answer8 = answer8;
        this.answer9 = answer9;
        this.answer10 = answer10;
        this.sum_score_3 = sum_score_3;
        this.answer11 = answer11;
        this.answer12 = answer12;
        this.answer13 = answer13;
        this.answer14 = answer14;
        this.question3 = question3;
        this.question4 = question4;
        this.answer15 = answer15;
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

    public String getAnswer6() {
        return answer6;
    }

    public void setAnswer6(String answer6) {
        this.answer6 = answer6;
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

    public String getSum_score_2() {
        return sum_score_2;
    }

    public void setSum_score_2(String sum_score_2) {
        this.sum_score_2 = sum_score_2;
    }

    public String getAnswer7() {
        return answer7;
    }

    public void setAnswer7(String answer7) {
        this.answer7 = answer7;
    }

    public String getAnswer8() {
        return answer8;
    }

    public void setAnswer8(String answer8) {
        this.answer8 = answer8;
    }

    public String getAnswer9() {
        return answer9;
    }

    public void setAnswer9(String answer9) {
        this.answer9 = answer9;
    }

    public String getAnswer10() {
        return answer10;
    }

    public void setAnswer10(String answer10) {
        this.answer10 = answer10;
    }

    public String getSum_score_3() {
        return sum_score_3;
    }

    public void setSum_score_3(String sum_score_3) {
        this.sum_score_3 = sum_score_3;
    }

    public String getAnswer11() {
        return answer11;
    }

    public void setAnswer11(String answer11) {
        this.answer11 = answer11;
    }

    public String getAnswer12() {
        return answer12;
    }

    public void setAnswer12(String answer12) {
        this.answer12 = answer12;
    }

    public String getAnswer13() {
        return answer13;
    }

    public void setAnswer13(String answer13) {
        this.answer13 = answer13;
    }

    public String getAnswer14() {
        return answer14;
    }

    public void setAnswer14(String answer14) {
        this.answer14 = answer14;
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

    public String getAnswer15() {
        return answer15;
    }

    public void setAnswer15(String answer15) {
        this.answer15 = answer15;
    }

    @Override
    public String toString() {
        return "MOCA{" +
                "id='" + id + '\'' +
                ", basicInfoId='" + basicInfoId + '\'' +
                ", sum_score='" + sum_score + '\'' +
                ", sum_score_1='" + sum_score_1 + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", answer4='" + answer4 + '\'' +
                ", answer5='" + answer5 + '\'' +
                ", answer6='" + answer6 + '\'' +
                ", question1='" + question1 + '\'' +
                ", question2='" + question2 + '\'' +
                ", sum_score_2='" + sum_score_2 + '\'' +
                ", answer7='" + answer7 + '\'' +
                ", answer8='" + answer8 + '\'' +
                ", answer9='" + answer9 + '\'' +
                ", answer10='" + answer10 + '\'' +
                ", sum_score_3='" + sum_score_3 + '\'' +
                ", answer11='" + answer11 + '\'' +
                ", answer12='" + answer12 + '\'' +
                ", answer13='" + answer13 + '\'' +
                ", answer14='" + answer14 + '\'' +
                ", question3='" + question3 + '\'' +
                ", question4='" + question4 + '\'' +
                ", answer15='" + answer15 + '\'' +
                '}';
    }
}
