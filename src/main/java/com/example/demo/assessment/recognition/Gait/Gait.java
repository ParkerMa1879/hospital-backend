package com.example.demo.assessment.recognition.Gait;

import javax.persistence.*;

@Entity
@Table(name = "gaits")
public class Gait {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "basicInfoId")
    private long basicInfoId;

    @Column(name = "步态异常量表")
    private String sum_score_1;

    @Column(name = "皮质脊髓束")
    private String answer1;

    @Column(name = "皮质延髓束")
    private String answer2;

    @Column(name = "椎体外系")
    private String answer3;

    @Column(name = "步态异常")
    private String answer4;

    @Column(name = "步态严重度")
    private String answer5;

    @Column(name = "Tinetti平衡量表")
    private String sum_score_2;

    @Column(name = "TinBal1")
    private String answer6;

    @Column(name = "TinBal2")
    private String answer7;

    @Column(name = "TinBal3")
    private String answer8;

    @Column(name = "TinBal4")
    private String answer9;

    @Column(name = "TinBal5")
    private String answer10;

    @Column(name = "TinBal6")
    private String answer11;

    @Column(name = "TinBal7")
    private String answer12;

    @Column(name = "TinBal8a")
    private String answer13;

    @Column(name = "TinBal8b")
    private String answer14;

    @Column(name = "TinBal9")
    private String answer15;

    @Column(name = "Tinetti步态量表")
    private String sum_score_3;

    @Column(name = "TinGait1")
    private String answer16;

    @Column(name = "TinGait2a")
    private String answer17;

    @Column(name = "TinGait2b")
    private String answer18;

    @Column(name = "TinGait2c")
    private String answer19;

    @Column(name = "TinGait2d")
    private String answer20;

    @Column(name = "TinGait3")
    private String answer21;

    @Column(name = "TinGait4")
    private String answer22;

    @Column(name = "TinGait5")
    private String answer23;

    @Column(name = "TinGait6")
    private String answer24;

    @Column(name = "TinGait7")
    private String answer25;

    @Column(name = "TUG测验")
    private String question1;

    @Column(name = "助行器")
    private String question2;

    public Gait(){}

    public Gait(long basicInfoId, String sum_score_1, String answer1, String answer2, String answer3, String answer4,
                String answer5, String sum_score_2, String answer6, String answer7, String answer8, String answer9,
                String answer10, String answer11, String answer12, String answer13, String answer14, String answer15,
                String sum_score_3, String answer16, String answer17, String answer18, String answer19, String answer20,
                String answer21, String answer22, String answer23, String answer24, String answer25, String question1,
                String question2) {
        this.basicInfoId = basicInfoId;
        this.sum_score_1 = sum_score_1;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.sum_score_2 = sum_score_2;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answer8 = answer8;
        this.answer9 = answer9;
        this.answer10 = answer10;
        this.answer11 = answer11;
        this.answer12 = answer12;
        this.answer13 = answer13;
        this.answer14 = answer14;
        this.answer15 = answer15;
        this.sum_score_3 = sum_score_3;
        this.answer16 = answer16;
        this.answer17 = answer17;
        this.answer18 = answer18;
        this.answer19 = answer19;
        this.answer20 = answer20;
        this.answer21 = answer21;
        this.answer22 = answer22;
        this.answer23 = answer23;
        this.answer24 = answer24;
        this.answer25 = answer25;
        this.question1 = question1;
        this.question2 = question2;
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

    public String getSum_score_2() {
        return sum_score_2;
    }

    public void setSum_score_2(String sum_score_2) {
        this.sum_score_2 = sum_score_2;
    }

    public String getAnswer6() {
        return answer6;
    }

    public void setAnswer6(String answer6) {
        this.answer6 = answer6;
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

    public String getAnswer15() {
        return answer15;
    }

    public void setAnswer15(String answer15) {
        this.answer15 = answer15;
    }

    public String getSum_score_3() {
        return sum_score_3;
    }

    public void setSum_score_3(String sum_score_3) {
        this.sum_score_3 = sum_score_3;
    }

    public String getAnswer16() {
        return answer16;
    }

    public void setAnswer16(String answer16) {
        this.answer16 = answer16;
    }

    public String getAnswer17() {
        return answer17;
    }

    public void setAnswer17(String answer17) {
        this.answer17 = answer17;
    }

    public String getAnswer18() {
        return answer18;
    }

    public void setAnswer18(String answer18) {
        this.answer18 = answer18;
    }

    public String getAnswer19() {
        return answer19;
    }

    public void setAnswer19(String answer19) {
        this.answer19 = answer19;
    }

    public String getAnswer20() {
        return answer20;
    }

    public void setAnswer20(String answer20) {
        this.answer20 = answer20;
    }

    public String getAnswer21() {
        return answer21;
    }

    public void setAnswer21(String answer21) {
        this.answer21 = answer21;
    }

    public String getAnswer22() {
        return answer22;
    }

    public void setAnswer22(String answer22) {
        this.answer22 = answer22;
    }

    public String getAnswer23() {
        return answer23;
    }

    public void setAnswer23(String answer23) {
        this.answer23 = answer23;
    }

    public String getAnswer24() {
        return answer24;
    }

    public void setAnswer24(String answer24) {
        this.answer24 = answer24;
    }

    public String getAnswer25() {
        return answer25;
    }

    public void setAnswer25(String answer25) {
        this.answer25 = answer25;
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

    @Override
    public String toString() {
        return "Gait{" +
                "id='" + id + '\'' +
                ", basicInfoId='" + basicInfoId + '\'' +
                ", sum_score_1='" + sum_score_1 + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", answer4='" + answer4 + '\'' +
                ", answer5='" + answer5 + '\'' +
                ", sum_score_2='" + sum_score_2 + '\'' +
                ", answer6='" + answer6 + '\'' +
                ", answer7='" + answer7 + '\'' +
                ", answer8='" + answer8 + '\'' +
                ", answer9='" + answer9 + '\'' +
                ", answer10='" + answer10 + '\'' +
                ", answer11='" + answer11 + '\'' +
                ", answer12='" + answer12 + '\'' +
                ", answer13='" + answer13 + '\'' +
                ", answer14='" + answer14 + '\'' +
                ", answer15='" + answer15 + '\'' +
                ", sum_score_3='" + sum_score_3 + '\'' +
                ", answer16='" + answer16 + '\'' +
                ", answer17='" + answer17 + '\'' +
                ", answer18='" + answer18 + '\'' +
                ", answer19='" + answer19 + '\'' +
                ", answer20='" + answer20 + '\'' +
                ", answer21='" + answer21 + '\'' +
                ", answer22='" + answer22 + '\'' +
                ", answer23='" + answer23 + '\'' +
                ", answer24='" + answer24 + '\'' +
                ", answer25='" + answer25 + '\'' +
                ", question1='" + question1 + '\'' +
                ", question2='" + question2 + '\'' +
                '}';
    }
}
