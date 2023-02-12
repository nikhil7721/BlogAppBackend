package com.example.washer.model;

public class Washer {
	
	private int id;
	private String wname;
	private String wemail;
	private int wmobno;
	
	public Washer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Washer(int id, String wname, String wemail, int wmobno) {
		super();
		this.id = id;
		this.wname = wname;
		this.wemail = wemail;
		this.wmobno = wmobno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public String getWemail() {
		return wemail;
	}

	public void setWemail(String wemail) {
		this.wemail = wemail;
	}

	public int getWmobno() {
		return wmobno;
	}

	public void setWmobno(int wmobno) {
		this.wmobno = wmobno;
	}

	@Override
	public String toString() {
		return "model [id=" + id + ", wname=" + wname + ", wemail=" + wemail + ", wmobno=" + wmobno + "]";
	}
	
	


}
