package com.example.demo.assessment.recognition.SilhouetteQuiz;

import javax.persistence.*;

@Table(name = "tb_silhouette_quiz")
public class SilhouetteQuiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "basicInfo_Id")
    private String basicInfoId;

    @Column(name = "剪影测验")
    private String sum_score;

    @Column(name = "S1")
    private String answer1;

    @Column(name = "S2")
    private String answer2;

    @Column(name = "S3")
    private String answer3;

    @Column(name = "S4")
    private String answer4;

    @Column(name = "S5")
    private String answer5;

    @Column(name = "S6")
    private String answer6;

    @Column(name = "S7")
    private String answer7;

    @Column(name = "S8")
    private String answer8;

    @Column(name = "S9")
    private String answer9;

    @Column(name = "S10")
    private String answer10;

    @Column(name = "S11")
    private String answer11;

    @Column(name = "S12")
    private String answer12;

    @Column(name = "S13")
    private String answer13;

    @Column(name = "S14")
    private String answer14;

    @Column(name = "S15")
    private String answer15;
}
