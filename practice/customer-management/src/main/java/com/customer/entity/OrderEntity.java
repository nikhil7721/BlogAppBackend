package com.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class OrderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int OrderId;
	
	@Column
	private String carname;
	
	@Column
	private String carmodel;
	
	@Column
	private String wname;
	
	@Column
	private int washpackId;
	
	@Column
	private long mobno;
	
	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderEntity(int orderId, String carname, String carmodel, String wname, int washpackId, long mobno) {
		super();
		OrderId = orderId;
		this.carname = carname;
		this.carmodel = carmodel;
		this.wname = wname;
		this.washpackId = washpackId;
		this.mobno = mobno;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public int getWashpackId() {
		return washpackId;
	}

	public void setWashpackId(int washpackId) {
		this.washpackId = washpackId;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	@Override
	public String toString() {
		return "OrderEntity [OrderId=" + OrderId + ", carname=" + carname + ", carmodel=" + carmodel + ", wname="
				+ wname + ", washpackId=" + washpackId + ", mobno=" + mobno + "]";
	}
	
	
	

}
