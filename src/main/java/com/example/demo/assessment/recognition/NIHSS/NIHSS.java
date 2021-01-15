package com.example.demo.assessment.recognition.NIHSS;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "nihsses")
public class NIHSS {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "basicInfoId")
    private long basicInfoId;

    @Temporal(TemporalType.DATE)
    @Column (name = "测试日期")
    private Date date;

    @Column(name = "NIHSS评分")
    private String sum_score;

    @Column(name = "NIHSS1a")
    private String answer1;

    @Column(name = "NIHSS1b")
    private String answer2;

    @Column(name = "NIHSS1c")
    private String answer3;

    @Column(name = "NIHSS2")
    private String answer4;

    @Column(name = "NIHSS3")
    private String answer5;

    @Column(name = "NIHSS4")
    private String answer6;

    @Column(name = "NIHSS5a")
    private String answer7;

    @Column(name = "NIHSS5atext")
    private String question1;

    @Column(name = "NIHSS5b")
    private String answer8;

    @Column(name = "NIHSS5btext")
    private String question2;

    @Column(name = "NIHSS6a")
    private String answer9;

    @Column(name = "NIHSS6atext")
    private String question3;

    @Column(name = "NIHSS6b")
    private String answer10;

    @Column(name = "NIHSS6btext")
    private String question4;

    @Column(name = "NIHSS7")
    private String answer11;

    @Column(name = "NIHSS8")
    private String answer12;

    @Column(name = "NIHSS9")
    private String answer13;

    @Column(name = "NIHSS10")
    private String answer14;

    @Column(name = "NIHSS10text")
    private String question5;

    @Column(name = "NIHSS11")
    private String answer15;

    public NIHSS(){}

    public NIHSS(long basicInfoId, Date date, String sum_score, String answer1, String answer2, String answer3, String answer4,
                 String answer5, String answer6, String answer7, String question1, String answer8, String question2,
                 String answer9, String question3, String answer10, String question4, String answer11, String answer12,
                 String answer13, String answer14, String question5, String answer15) {
        this.basicInfoId = basicInfoId;
        this.date = date;
        this.sum_score = sum_score;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.question1 = question1;
        this.answer8 = answer8;
        this.question2 = question2;
        this.answer9 = answer9;
        this.question3 = question3;
        this.answer10 = answer10;
        this.question4 = question4;
        this.answer11 = answer11;
        this.answer12 = answer12;
        this.answer13 = answer13;
        this.answer14 = answer14;
        this.question5 = question5;
        this.answer15 = answer15;
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

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getAnswer8() {
        return answer8;
    }

    public void setAnswer8(String answer8) {
        this.answer8 = answer8;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getAnswer9() {
        return answer9;
    }

    public void setAnswer9(String answer9) {
        this.answer9 = answer9;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getAnswer10() {
        return answer10;
    }

    public void setAnswer10(String answer10) {
        this.answer10 = answer10;
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4;
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

    public String getQuestion5() {
        return question5;
    }

    public void setQuestion5(String question5) {
        this.question5 = question5;
    }

    public String getAnswer15() {
        return answer15;
    }

    public void setAnswer15(String answer15) {
        this.answer15 = answer15;
    }

    @Override
    public String toString() {
        return "NIHSS{" +
                "id='" + id + '\'' +
                ", basicInfoId='" + basicInfoId + '\'' +
                ", sum_score='" + sum_score + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", answer4='" + answer4 + '\'' +
                ", answer5='" + answer5 + '\'' +
                ", answer6='" + answer6 + '\'' +
                ", answer7='" + answer7 + '\'' +
                ", question1='" + question1 + '\'' +
                ", answer8='" + answer8 + '\'' +
                ", question2='" + question2 + '\'' +
                ", answer9='" + answer9 + '\'' +
                ", question3='" + question3 + '\'' +
                ", answer10='" + answer10 + '\'' +
                ", question4='" + question4 + '\'' +
                ", answer11='" + answer11 + '\'' +
                ", answer12='" + answer12 + '\'' +
                ", answer13='" + answer13 + '\'' +
                ", answer14='" + answer14 + '\'' +
                ", question5='" + question5 + '\'' +
                ", answer15='" + answer15 + '\'' +
                '}';
    }
}
