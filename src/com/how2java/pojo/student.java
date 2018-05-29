package com.how2java.pojo;

public class student {
	private int id;

    private String qqnumber;
    private String sNAME;
    private String time;
    private String school;
    private String link;
    private String hope;
    private String leader;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQqnumber() {
		return qqnumber;
	}
	public void setQqnumber(String qqnumber) {
		this.qqnumber = qqnumber;
	}
	public String getsNAME() {
		return sNAME;
	}
	public void setsNAME(String sNAME) {
		this.sNAME = sNAME;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getHope() {
		return hope;
	}
	public void setHope(String hope) {
		this.hope = hope;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public student(String qqnumber, String sNAME, String time, String school,
			String link, String hope, String leader) {
		super();
		this.qqnumber = qqnumber;
		this.sNAME = sNAME;
		this.time = time;
		this.school = school;
		this.link = link;
		this.hope = hope;
		this.leader = leader;
	}
	public student() {
		// TODO Auto-generated constructor stub
	}
	
   
	
	
    
}
