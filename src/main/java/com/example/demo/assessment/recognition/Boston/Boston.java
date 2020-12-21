package com.example.demo.assessment.recognition.Boston;

import javax.persistence.*;

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
}
