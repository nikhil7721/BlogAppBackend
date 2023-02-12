package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Nationalized;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id ;
	private String itemTitle;
	private double price;
	
	@Lob
	@Nationalized
	private String description;
	
	private String brand;
	private String category;
	private String image;
	
//	@ManyToOne
//	@JoinColumn(name="seller_id")
//	@JsonIgnore
//	private Seller seller;

}
