package com.wisdomelon.dtree;

/** response返回类*/
public class DTreeResponse {

	/** 状态码*/
	private int code = 0;
	
	/** 信息标识*/
	private String msg = "success";
	
	/** 状态类*/
	private Status status = new Status();
	
	/** 数据*/
	private Object data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DtreeResponse [code=" + code + ", msg=" + msg + ", status="
				+ status + ", data=" + data + "]";
	}
	
	
}
