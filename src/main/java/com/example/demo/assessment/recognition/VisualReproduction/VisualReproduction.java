package com.example.demo.assessment.recognition.VisualReproduction;

import javax.persistence.*;

@Entity
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

    public VisualReproduction(){

    }

    public VisualReproduction(String basicInfoId, String sum_score_1, String answer1, String answer2, String answer3,
                              String answer4, String sum_score_2, String answer5, String answer6, String answer7,
                              String answer8, String sum_score_3, String answer9, String answer10, String answer11,
                              String answer12, String sum_score_4, String answer13, String answer14, String answer15,
                              String answer16) {
        this.basicInfoId = basicInfoId;
        this.sum_score_1 = sum_score_1;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.sum_score_2 = sum_score_2;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answer8 = answer8;
        this.sum_score_3 = sum_score_3;
        this.answer9 = answer9;
        this.answer10 = answer10;
        this.answer11 = answer11;
        this.answer12 = answer12;
        this.sum_score_4 = sum_score_4;
        this.answer13 = answer13;
        this.answer14 = answer14;
        this.answer15 = answer15;
        this.answer16 = answer16;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBasicInfoId() {
        return basicInfoId;
    }

    public void setBasicInfoId(String basicInfoId) {
        this.basicInfoId = basicInfoId;
    }

    public String getSum_score_1() {
        return sum_score_1;
    }

    public void setSum_score_1(String sum_score_1) {
        this.sum_score_1 = sum_score_1;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getSum_score_2() {
        return sum_score_2;
    }

    public void setSum_score_2(String sum_score_2) {
        this.sum_score_2 = sum_score_2;
    }

    public String getAnswer5() {
        return answer5;
    }

    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
    }

    public String getAnswer6() {
        return answer6;
    }

    public void setAnswer6(String answer6) {
        this.answer6 = answer6;
    }

    public String getAnswer7() {
        return answer7;
    }

    public void setAnswer7(String answer7) {
        this.answer7 = answer7;
    }

    public String getAnswer8() {
        return answer8;
    }

    public void setAnswer8(String answer8) {
        this.answer8 = answer8;
    }

    public String getSum_score_3() {
        return sum_score_3;
    }

    public void setSum_score_3(String sum_score_3) {
        this.sum_score_3 = sum_score_3;
    }

    public String getAnswer9() {
        return answer9;
    }

    public void setAnswer9(String answer9) {
        this.answer9 = answer9;
    }

    public String getAnswer10() {
        return answer10;
    }

    public void setAnswer10(String answer10) {
        this.answer10 = answer10;
    }

    public String getAnswer11() {
        return answer11;
    }

    public void setAnswer11(String answer11) {
        this.answer11 = answer11;
    }

    public String getAnswer12() {
        return answer12;
    }

    public void setAnswer12(String answer12) {
        this.answer12 = answer12;
    }

    public String getSum_score_4() {
        return sum_score_4;
    }

    public void setSum_score_4(String sum_score_4) {
        this.sum_score_4 = sum_score_4;
    }

    public String getAnswer13() {
        return answer13;
    }

    public void setAnswer13(String answer13) {
        this.answer13 = answer13;
    }

    public String getAnswer14() {
        return answer14;
    }

    public void setAnswer14(String answer14) {
        this.answer14 = answer14;
    }

    public String getAnswer15() {
        return answer15;
    }

    public void setAnswer15(String answer15) {
        this.answer15 = answer15;
    }

    public String getAnswer16() {
        return answer16;
    }

    public void setAnswer16(String answer16) {
        this.answer16 = answer16;
    }

    @Override
    public String toString() {
        return "VisualReproduction{" +
                "id='" + id + '\'' +
                ", basicInfoId='" + basicInfoId + '\'' +
                ", sum_score_1='" + sum_score_1 + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", answer4='" + answer4 + '\'' +
                ", sum_score_2='" + sum_score_2 + '\'' +
                ", answer5='" + answer5 + '\'' +
                ", answer6='" + answer6 + '\'' +
                ", answer7='" + answer7 + '\'' +
                ", answer8='" + answer8 + '\'' +
                ", sum_score_3='" + sum_score_3 + '\'' +
                ", answer9='" + answer9 + '\'' +
                ", answer10='" + answer10 + '\'' +
                ", answer11='" + answer11 + '\'' +
                ", answer12='" + answer12 + '\'' +
                ", sum_score_4='" + sum_score_4 + '\'' +
                ", answer13='" + answer13 + '\'' +
                ", answer14='" + answer14 + '\'' +
                ", answer15='" + answer15 + '\'' +
                ", answer16='" + answer16 + '\'' +
                '}';
    }
}
