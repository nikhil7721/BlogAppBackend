package com.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="washpacks")
public class washpacks {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int cost;
	
	@Column
	private String Description;
	
	public washpacks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public washpacks(int id, String name, int cost, String description) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		Description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "washpacks [id=" + id + ", name=" + name + ", cost=" + cost + ", Description=" + Description + "]";
	}
	
	

}
