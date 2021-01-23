//package com.example.demo.assessment.image.origin;
//
//import javax.persistence.*;
//
//import org.hibernate.annotations.GenericGenerator;
//
//import java.util.Date;
//
//@Entity
//@Table(name = "images")
//public class Image {
//  @Id
//  @GeneratedValue(generator = "uuid")
//  @GenericGenerator(name = "uuid", strategy = "uuid2")
//  private String id;
//
//  @Column(name = "basicInfoId")
//  private long basicInfoId;
//
//  @Temporal(TemporalType.DATE)
//  @Column(name = "录入时间")
//  private Date entryTime;
//
//  @Column(name = "MR号")
//  private String mrNum;
//
//  @Column(name = "图像种类")
//  private int imageType;
//
//  @Lob
//  private byte[] data;
//
//  public Image() {
//  }
//
//  public Image(long basicInfoId, Date entryTime, String mrNum, int imageType, byte[] data) {
//    this.basicInfoId = basicInfoId;
//    this.entryTime = entryTime;
//    this.mrNum =mrNum;
//    this.imageType = imageType;
//    this.data = data;
//  }
//
//  public String getId() {
//    return id;
//  }
//
//  public long getBasicInfoId(){
//    return basicInfoId;
//  }
//
//  public void setBasicInfoId(long basicInfoId){
//    this.basicInfoId = basicInfoId;
//  }
//
//  public Date getEntryTime() {
//    return entryTime;
//  }
//
//  public void setEntryTime(Date entryTime) {
//    this.entryTime = entryTime;
//  }
//
//  public String getMrNum() {
//    return mrNum;
//  }
//
//  public void setMrNum(String mrNum) {
//    this.mrNum = mrNum;
//  }
//
//  public int getImageType() {
//    return imageType;
//  }
//
//  public void setImageType(int imageType) {
//    this.imageType = imageType;
//  }
//
//  public byte[] getData() {
//    return data;
//  }
//
//  public void setData(byte[] data) {
//    this.data = data;
//  }
//
//}