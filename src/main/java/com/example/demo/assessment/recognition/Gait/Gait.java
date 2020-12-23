package com.example.demo.assessment.recognition.Gait;

import javax.persistence.*;

@Entity
@Table(name = "tb_gait")
public class Gait {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "basicInfo_Id")
    private String basicInfoId;

    @Column(name = "步态异常量表")
    private String sum_score_1;

    @Column(name = "皮质脊髓束")
    private String answer1;

    @Column(name = "皮质延髓束")
    private String answer2;

    @Column(name = "椎体外系")
    private String answer3;

    @Column(name = "步态异常")
    private String answer4;

    @Column(name = "步态严重度")
    private String answer5;

    @Column(name = "Tinetti平衡量表")
    private String sum_score_2;

    @Column(name = "TinBal1")
    private String answer6;

    @Column(name = "TinBal2")
    private String answer7;

    @Column(name = "TinBal3")
    private String answer8;

    @Column(name = "TinBal4")
    private String answer9;

    @Column(name = "TinBal5")
    private String answer10;

    @Column(name = "TinBal6")
    private String answer11;

    @Column(name = "TinBal7")
    private String answer12;

    @Column(name = "TinBal8a")
    private String answer13;

    @Column(name = "TinBal8b")
    private String answer14;

    @Column(name = "TinBal9")
    private String answer15;

    @Column(name = "Tinetti步态量表")
    private String sum_score_3;

    @Column(name = "TinGait1")
    private String answer16;

    @Column(name = "TinGait2a")
    private String answer17;

    @Column(name = "TinGait2b")
    private String answer18;

    @Column(name = "TinGait2c")
    private String answer19;

    @Column(name = "TinGait2d")
    private String answer20;

    @Column(name = "TinGait3")
    private String answer21;

    @Column(name = "TinGait4")
    private String answer22;

    @Column(name = "TinGait5")
    private String answer23;

    @Column(name = "TinGait6")
    private String answer24;

    @Column(name = "TinGait7")
    private String answer25;

    @Column(name = "TUG测验")
    private String question1;

    @Column(name = "助行器")
    private String question2;
}
