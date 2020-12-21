package com.example.demo.assessment.recognition.HAMA;

import javax.persistence.*;

@Table(name = "tb_hamilton_anxious")
public class HAMA {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "basicInfo_Id")
    private String basicInfoId;

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

}
