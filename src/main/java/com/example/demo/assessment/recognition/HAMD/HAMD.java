package com.example.demo.assessment.recognition.HAMD;

import javax.persistence.*;

@Table(name = "tb_hamilton_depressed")
public class HAMD {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "basicInfo_Id")
    private String basicInfoId;

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


}
