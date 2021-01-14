package com.example.demo.assessment.recognition.MMSE;
import javax.persistence.*;

@Entity
@Table(name = "mmses")
public class MMSE {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "basicInfoId")
    private long basicInfoId;

    @Column(name = "总分")
    private String sum_socre;

    @Column(name = "定向")
    private String sum_socre_1;

    @Column(name = "时间")
    private String answer1;

    @Column(name = "地点")
    private String answer2;

    @Column(name = "即刻记忆")
    private String answer3;

    @Column(name = "计算力")
    private String answer4;

    @Column(name = "回忆")
    private String answer5;

    @Column(name = "命名")
    private String answer6;

    @Column(name = "重复")
    private String answer7;

    @Column(name = "阅读")
    private String answer8;

    @Column(name = "指令")
    private String answer9;

    @Column(name = "表达")
    private String answer10;

    @Column(name = "绘图")
    private String answer11;

    public MMSE(){

    }

    public MMSE(long basicInfoId, String sum_socre, String sum_socre_1, String answer1, String answer2, String answer3,
                String answer4, String answer5, String answer6, String answer7, String answer8, String answer9,
                String answer10, String answer11) {
        this.basicInfoId = basicInfoId;
        this.sum_socre = sum_socre;
        this.sum_socre_1 = sum_socre_1;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answer8 = answer8;
        this.answer9 = answer9;
        this.answer10 = answer10;
        this.answer11 = answer11;
    }

    public long getId() {
        return id;
    }

    public long getBasicInfoId() {
        return basicInfoId;
    }

    public void setBasicInfoId(long basicInfoId) {
        this.basicInfoId = basicInfoId;
    }

    public String getSum_socre() {
        return sum_socre;
    }

    public void setSum_socre(String sum_socre) {
        this.sum_socre = sum_socre;
    }

    public String getSum_socre_1() {
        return sum_socre_1;
    }

    public void setSum_socre_1(String sum_socre_1) {
        this.sum_socre_1 = sum_socre_1;
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
}
