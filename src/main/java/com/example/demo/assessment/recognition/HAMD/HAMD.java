package com.example.demo.assessment.recognition.HAMD;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hamds")
public class HAMD {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "basicInfoId")
    private long basicInfoId;

    @Temporal(TemporalType.DATE)
    @Column (name = "测试日期")
    private Date date;

    @Column(name = "HAMD总")
    private String sum_score;

    @Column(name = "HAMD1")
    private String answer1;

    @Column(name = "HAMD2")
    private String answer2;

    @Column(name = "HAMD3")
    private String answer3;

    @Column(name = "HAMD4")
    private String answer4;

    @Column(name = "HAMD5")
    private String answer5;

    @Column(name = "HAMD6")
    private String answer6;

    @Column(name = "HAMD7")
    private String answer7;

    @Column(name = "HAMD8")
    private String answer8;

    @Column(name = "HAMD9")
    private String answer9;

    @Column(name = "HAMD10")
    private String answer10;

    @Column(name = "HAMD11")
    private String answer11;

    @Column(name = "HAMD12")
    private String answer12;

    @Column(name = "HAMD13")
    private String answer13;

    @Column(name = "HAMD14")
    private String answer14;

    @Column(name = "HAMD15")
    private String answer15;

    @Column(name = "HAMD16")
    private String answer16;

    @Column(name = "HAMD17")
    private String answer17;


    public HAMD(long basicInfoId, Date date, String sum_score, String answer1, String answer2, String answer3,
                String answer4, String answer5, String answer6, String answer7, String answer8, String
                        answer9, String answer10, String answer11, String answer12, String answer13,
                String answer14, String answer15, String answer16, String answer17) {
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
        this.answer8 = answer8;
        this.answer9 = answer9;
        this.answer10 = answer10;
        this.answer11 = answer11;
        this.answer12 = answer12;
        this.answer13 = answer13;
        this.answer14 = answer14;
        this.answer15 = answer15;
        this.answer16 = answer16;
        this.answer17 = answer17;
    }

    public HAMD(){}

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

    @Override
    public String toString() {
        return "HAMD{" +
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
                ", answer15='" + answer15 + '\'' +
                ", answer16='" + answer16 + '\'' +
                ", answer17='" + answer17 + '\'' +
                '}';
    }
}
