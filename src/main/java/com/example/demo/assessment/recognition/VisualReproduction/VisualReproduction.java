package com.example.demo.assessment.recognition.VisualReproduction;

import com.example.demo.index.basicInfo.BasicInfo;

import javax.persistence.*;

@Table(name = "tb_visual_reproductio")
public class VisualReproduction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "basicInfo_Id")
    private String basicInfoId;

    @Column(name = "视觉复制即刻回忆")
    private String sum_score_1;

    @Column(name = "VRIR1")
    private String answer1;

    @Column(name = "VRIR2")
    private String answer2;

    @Column(name = "VRIR3")
    private String answer3;

    @Column(name = "VRIR4")
    private String answer4;

    @Column(name = "视觉复制延迟回忆")
    private String sum_score_2;

    @Column(name = "VRDR1")
    private String answer5;

    @Column(name = "VRDR2")
    private String answer6;

    @Column(name = "VRDR3")
    private String answer7;

    @Column(name = "VRDR4")
    private String answer8;

    @Column(name = "视觉复制延迟再认")
    private String sum_score_3;

    @Column(name = "VRR1")
    private String answer9;

    @Column(name = "VRR2")
    private String answer10;

    @Column(name = "VRR3")
    private String answer11;

    @Column(name = "VRR4")
    private String answer12;

    @Column(name = "视觉复制临摹")
    private String sum_score_4;

    @Column(name = "VRC1")
    private String answer13;

    @Column(name = "VRC2")
    private String answer14;

    @Column(name = "VRC3")
    private String answer15;

    @Column(name = "VRC4")
    private String answer16;

}
