package com.jll.ten;

public class Immortal {
	private String imName;
	private String imSkill;
	private int imNum;
	public Immortal() {
		super();
	}
	@Override
	public String toString() {
		return "天兵姓名:" + imName + ", 天兵技能:" + imSkill + ",天兵编号:" + imNum ;
	}

	public Immortal(String imName, String imSkill,int num) {
		super();
		this.imName = imName;
		this.imSkill = imSkill;
		this.imNum = num;
		
	}

	public String getImName() {
		return imName;
	}

	public String getImSkill() {
		return imSkill;
	}

	public int getImNum() {
		return imNum;
	}

	public void setImName(String imName) {
		this.imName = imName;
	}

	public void setImSkill(String imSkill) {
		this.imSkill = imSkill;
	}

	public void setImNum(int imNum) {
		this.imNum = imNum;
	}
}
