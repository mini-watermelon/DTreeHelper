package com.wisdomelon.dtree;

/** 复选框设计类*/
public class CheckArr {

	/** 复选框标记*/
	private String type;
	
	/** 复选框是否选中*/
	private String isChecked;
	
	public CheckArr() {}

	public CheckArr(String type, String isChecked) {
		this.type = type;
		this.isChecked = isChecked;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(String isChecked) {
		this.isChecked = isChecked;
	}

	@Override
	public String toString() {
		return "CheckArr [type=" + type + ", isChecked=" + isChecked + "]";
	}
	
}
