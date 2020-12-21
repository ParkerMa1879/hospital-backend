package com.example.demo.assessment.recognition.DailyLife;

import javax.persistence.*;

@Table(name = "tb_daily_life")
public class DailyLife {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "basicInfo_Id")
    private String basicInfoId;

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
}
