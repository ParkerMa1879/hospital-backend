package com.example.demo.assessment.recognition.Boston;

import javax.persistence.*;

@Entity
@Table(name = "tb_boston")
public class Boston {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "basicInfo_Id")
    private String basicInfoId;

    @Column(name = "波士顿命名")
    private String sum_score;

    @Column(name = "BNT0")
    private String answer1;

    @Column(name = "BNT1")
    private String answer2;

    @Column(name = "BNT2")
    private String answer3;

    @Column(name = "BNTclue")
    private String answer4;

    @Column(name = "BNTchoice")
    private String answer5;

    public Boston(){

    }

    public Boston(String basicInfoId, String sum_score, String answer1, String answer2, String answer3,
                  String answer4, String answer5) {
        this.basicInfoId = basicInfoId;
        this.sum_score = sum_score;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAnswer5() {
        return answer5;
    }

    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
    }

    @Override
    public String toString() {
        return "Boston{" +
                "id='" + id + '\'' +
                ", basicInfoId='" + basicInfoId + '\'' +
                ", sum_score='" + sum_score + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", answer4='" + answer4 + '\'' +
                ", answer5='" + answer5 + '\'' +
                '}';
    }
}
