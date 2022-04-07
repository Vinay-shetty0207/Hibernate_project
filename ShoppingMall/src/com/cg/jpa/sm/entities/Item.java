package com.cg.jpa.sm.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item implements Serializable {
	

	private static final long serialVersionUID = 1L;
	  
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int item_id;
	
	@Column(name="item_name")
	private String item_name;
	
	@Column(name="price")
	private double price;
	
	@Column(name="mfg_date")
	private LocalDate mfg_date;
	
	@Column(name="expiry_date")
	private LocalDate expiry_date;
	
	private enum category {
		CLOTHING, MOBILES, ACCESSIORIES
	}
	
	
	
	
	
}
