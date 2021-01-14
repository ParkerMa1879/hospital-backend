package com.example.demo.assessment.recognition.HAMA;

import javax.persistence.*;

@Entity
@Table(name = "hamas")
public class HAMA {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "basicInfoId")
    private long basicInfoId;

    @Column(name = "HAMA总")
    private String sum_score;

    @Column(name = "HAMA1")
    private String answer1;

    @Column(name = "HAMA2")
    private String answer2;

    @Column(name = "HAMA3")
    private String answer3;

    @Column(name = "HAMA4")
    private String answer4;

    @Column(name = "HAMA5")
    private String answer5;

    @Column(name = "HAMA6")
    private String answer6;

    @Column(name = "HAMA7")
    private String answer7;

    @Column(name = "HAMA8")
    private String answer8;

    @Column(name = "HAMA9")
    private String answer9;

    @Column(name = "HAMA10")
    private String answer10;

    @Column(name = "HAMA11")
    private String answer11;

    @Column(name = "HAMA12")
    private String answer12;

    @Column(name = "HAMA13")
    private String answer13;

    @Column(name = "HAMA14")
    private String answer14;

    public HAMA(){}


    public HAMA(long basicInfoId, String sum_score, String answer1, String answer2, String answer3, String answer4,
                String answer5, String answer6, String answer7, String answer8, String answer9, String answer10,
                String answer11, String answer12, String answer13, String answer14) {
        this.basicInfoId = basicInfoId;
        this.sum_score = sum_score;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answer8 = answer8;
        this.answer9 = answer9;
        this.answer10 = answer10;
        this.answer11 = answer11;
        this.answer12 = answer12;
        this.answer13 = answer13;
        this.answer14 = answer14;
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

    @Override
    public String toString() {
        return "HAMA{" +
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
                ", answer8='" + answer8 + '\'' +
                ", answer9='" + answer9 + '\'' +
                ", answer10='" + answer10 + '\'' +
                ", answer11='" + answer11 + '\'' +
                ", answer12='" + answer12 + '\'' +
                ", answer13='" + answer13 + '\'' +
                ", answer14='" + answer14 + '\'' +
                '}';
    }
}
