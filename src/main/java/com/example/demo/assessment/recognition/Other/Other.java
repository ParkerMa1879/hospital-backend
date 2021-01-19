package com.example.demo.assessment.recognition.Other;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "others")
public class Other {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "basicInfoId")
    private long basicInfoId;

    @Temporal(TemporalType.DATE)
    @Column (name = "测试日期")
    private Date date;

    @Column(name = "tug")
    private String question1;

    @Column(name = "助行器")
    private String question2;

    @Column(name = "mRs")
    private String question3;

    @Column(name = "toast")
    private String question4;

    @Column(name = "NPI")
    private String question5;

    @Column(name = "HAMAC")
    private String question6;

    @Column(name = "HAMDC")
    private String question7;

    public Other(){

    }

    public Other(long basicInfoId, Date date, String question1, String question2, String question3, String question4,
                 String question5, String question6, String question7) {
        this.basicInfoId = basicInfoId;
        this.date = date;
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
        this.question4 = question4;
        this.question5 = question5;
        this.question6 = question6;
        this.question7 = question7;
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
}

