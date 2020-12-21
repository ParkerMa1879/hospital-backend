package com.example.demo.assessment.recognition.Execution;
import javax.persistence.*;

@Table (name = "tb_execution")
public class Execution {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "basicInfo_Id")
    private String basicInfoId;

    @Column(name = "类别流畅性")
    private String sum_score;

    @Column(name = "语流动物15s")
    private String answer1;

    @Column(name = "语流动物30s")
    private String answer2;

    @Column(name = "语流动物45s")
    private String answer3;

    @Column(name = "语流动物60s")
    private String answer4;

    @Column(name = "S1正确")
    private String question1;

    @Column(name = "S1测试者更正")
    private String question2;

    @Column(name = "S1自我更正")
    private String question3;

    @Column(name = "S1时间")
    private String question4;

    @Column(name = "S2正确")
    private String question5;

    @Column(name = "S2测试者更正")
    private String question6;

    @Column(name = "S2自我更正")
    private String question7;

    @Column(name = "S2时间")
    private String question8;

    @Column(name = "S3正确")
    private String question9;

    @Column(name = "S3测试者更正")
    private String question10;

    @Column(name = "S3自我更正")
    private String question11;

    @Column(name = "S3时间")
    private String question12;

    @Column(name = "色盲色弱可疑")
    private String question13;

    @Column(name = "Stroop备注")
    private String question14;

    @Column(name = "TMT1自我更正")
    private String question15;

    @Column(name = "TMT1测试者更正")
    private String question16;

    @Column(name = "TMT1时间")
    private String question17;

    @Column(name = "TMT1提示")
    private String question18;

    @Column(name = "TMT2自我更正")
    private String question19;

    @Column(name = "TMT2测试者更正")
    private String question20;

    @Column(name = "TMT2时间")
    private String question21;

    @Column(name = "TMT2提示")
    private String question22;

    @Column(name = "连线测验备注")
    private String question23;

}
