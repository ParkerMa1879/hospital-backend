package com.example.demo.assessment.recognition.Memory;

import javax.persistence.*;

@Table(name = "tb_memory")
public class Momery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "basicInfo_Id")
    private String basicInfoId;

    @Column(name = "听觉词语学习即刻")
    private String sum_score_1;

    @Column(name = "AVLTIR1")
    private String answer1;

    @Column(name = "AVLTIR2")
    private String answer2;

    @Column(name = "AVLTIR3")
    private String answer3;

    @Column(name = "AVLT插入个")
    private String question1;

    @Column(name = "AVLT插入次")
    private String question2;

    @Column(name = "AVLT重复")
    private String question3;

    @Column(name = "AVLT策略1有0无")
    private String question4;

    @Column(name = "听觉词语学习短延时")
    private String question5;

    @Column(name = "AVLT插入个1")
    private String question6;

    @Column(name = "AVLT插入次1")
    private String question7;

    @Column(name = "AVLT重复1")
    private String question8;

    @Column(name = "AVLT策略1有0无1")
    private String question9;

    @Column(name = "听觉词语学习长延时")
    private String question10;

    @Column(name = "AVLTDDR服饰")
    private String question11;

    @Column(name = "AVLTDDR职业")
    private String question12;

    @Column(name = "AVLTDDR花卉")
    private String question13;

    @Column(name = "AVLT插入个2")
    private String question14;

    @Column(name = "AVLT插入次2")
    private String question15;

    @Column(name = "AVLT重复2")
    private String question16;

    @Column(name = "AVLT策略1有0无2")
    private String question17;

    @Column(name = "听觉词语学习再认")
    private String sum_score_2;

    @Column(name = "AVLT再认")
    private String answer4;

    @Column(name = "AVLT排除画钟4分法")
    private String answer5;

    @Column(name = "数字正背")
    private String question18;

    @Column(name = "数字倒背")
    private String question19;

    @Column(name = "DOTA")
    private String question20;
}
