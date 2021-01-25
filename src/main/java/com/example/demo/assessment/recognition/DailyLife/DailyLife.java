package com.example.demo.assessment.recognition.DailyLife;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dailyLifes")
public class DailyLife {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "basicInfoId")
    private long basicInfoId;

    @Temporal(TemporalType.DATE)
    @Column(name = "测试日期")
    private Date date;

    @Column(name = "ADL1")
    private String answer1;

    @Column(name = "ADL2")
    private String answer2;

    @Column(name = "ADL3")
    private String answer3;

    @Column(name = "ADL4")
    private String answer4;

    @Column(name = "ADL5")
    private String answer5;

    @Column(name = "ADL6")
    private String answer6;

    @Column(name = "ADL7")
    private String answer7;

    @Column(name = "ADL8")
    private String answer8;

    @Column(name = "ADL9")
    private String answer9;

    @Column(name = "ADL10")
    private String answer10;

    @Column(name = "ADL总")
    private String sum_score_1;

    @Column(name = "IADLA1")
    private String answer11;

    @Column(name = "IADLA2")
    private String answer12;

    @Column(name = "IADLA3")
    private String answer13;

    @Column(name = "IADLA4")
    private String answer14;

    @Column(name = "IADLA5")
    private String answer15;

    @Column(name = "IADLA6")
    private String answer16;

    @Column(name = "IADLA7")
    private String answer17;

    @Column(name = "IADLA8")
    private String answer18;

    @Column(name = "IADLA总")
    private String sum_score_2;

    public DailyLife(){
    }

    public DailyLife(long basicInfoId, Date date, String answer1, String answer2, String answer3,
                     String answer4, String answer5, String answer6, String answer7, String answer8,
                     String answer9, String answer10, String sum_score_1, String answer11,
                     String answer12, String answer13, String answer14, String answer15, String answer16,
                     String answer17, String answer18, String sum_score_2) {
        this.basicInfoId = basicInfoId;
        this.date = date;
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
        this.sum_score_1 = sum_score_1;
        this.answer11 = answer11;
        this.answer12 = answer12;
        this.answer13 = answer13;
        this.answer14 = answer14;
        this.answer15 = answer15;
        this.answer16 = answer16;
        this.answer17 = answer17;
        this.answer18 = answer18;
        this.sum_score_2 = sum_score_2;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public String getSum_score_1() {
        return sum_score_1;
    }

    public void setSum_score_1(String sum_score_1) {
        this.sum_score_1 = sum_score_1;
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

    public String getSum_score_2() {
        return sum_score_2;
    }

    public void setSum_score_2(String sum_score_2) {
        this.sum_score_2 = sum_score_2;
    }
}
