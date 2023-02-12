package com.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Buyer extends User{
	
	@OneToMany
	List<Cart_items> cart_items=new ArrayList<>();

}
