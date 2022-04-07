package com.cg.jpa.sm.entities;

import java.io.Serializable;
import java.rmi.dgc.Lease;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="shop")
@Inheritance(strategy=InheritanceType.JOINED)

public class Shop implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
    //connection to shop to employee
	@OneToMany( mappedBy ="Eshop_id",cascade=CascadeType.ALL)
	private	Set<Employee> employees= new HashSet<>();
	
	@Column(name="Eshop_id")
	private int Eshop_id;
	
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int shop_id;
	
	@Column(name="shopname")
	private String shopname;
	
	@Column(name="leasestatus")
	private String leasestatus;
	
	private enum shopCategory{ WHOLESALE , RETAIL };
	
	private enum shopStatus{ OPEN , CLOSED};
	
	
	
	
	
}
	
	