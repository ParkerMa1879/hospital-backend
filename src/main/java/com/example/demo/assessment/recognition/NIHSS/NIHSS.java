package com.example.demo.assessment.recognition.NIHSS;

import javax.persistence.*;

public class NIHSS {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "basicInfo_Id")
    private String basicInfoId;

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



}
