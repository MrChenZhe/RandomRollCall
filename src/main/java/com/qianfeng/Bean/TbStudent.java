package com.qianfeng.Bean;


public class TbStudent {

  private long stuId;
  private String stuName;
  private long stuAge;

  public TbStudent(long stuId, String stuName, long stuAge) {
    this.stuId = stuId;
    this.stuName = stuName;
    this.stuAge = stuAge;
  }

  public TbStudent() {
  }

  public long getStuId() {
    return stuId;
  }

  public void setStuId(long stuId) {
    this.stuId = stuId;
  }


  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }


  public long getStuAge() {
    return stuAge;
  }

  public void setStuAge(long stuAge) {
    this.stuAge = stuAge;
  }

}
