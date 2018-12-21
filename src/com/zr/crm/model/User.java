package com.zr.crm.model;

import java.util.Date;

/**
* @ClassName: User 
* @Description: 娴滃搫鎲崇�电钖� 
*
 */
public class 	User {

	//婵挸鎮�
	private String name;
	//闁劑妫�
	private String deptNo;
	//閼卞苯濮�
	private String post;
	//閹冨焼
	private Integer sex;
	//閻㈢喐妫�
	private Date birthday;
	//閼辨梻閮撮弬鐟扮础
	private String phone;
	//娴ｅ繐娼�
	private String addr;
	//閸忋儴浜撮弮鍫曟？
	private Date entryDay;
	//閻樿埖锟斤拷
	private Integer status;
	
	//婢舵潙鍎氶崷鏉挎絻
	private String picUrl;
	//瀹搞儱褰�
	private String jobNumber;
	
	//缁狙冨焼
	private Integer levels;
	//id
	private Long id;
	//鐠愶箑褰�
	private String account;
	//鐎靛棛鐖�
	private String pwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Date getEntryDay() {
		return entryDay;
	}
	public void setEntryDay(Date entryDay) {
		this.entryDay = entryDay;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getJobNumber() {
		return jobNumber;
	}
	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}
	public Integer getLevels() {
		return levels;
	}
	public void setLevels(Integer levels) {
		this.levels = levels;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", deptNo=" + deptNo + ", post=" + post
				+ ", sex=" + sex + ", birthday=" + birthday + ", phone="
				+ phone + ", addr=" + addr + ", entryDay=" + entryDay
				+ ", status=" + status + ", picUrl=" + picUrl + ", jobNumber="
				+ jobNumber + ", levels=" + levels + ", id=" + id + ", account="
				+ account + ", pwd=" + pwd + "]";
	}
}