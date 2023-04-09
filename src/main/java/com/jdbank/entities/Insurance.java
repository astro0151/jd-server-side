package com.jdbank.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Insurance")
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	
	
	@OneToOne
	@JoinColumn( name="vendor_id")
	private Vendors vendors;

	@OneToOne( 
 mappedBy = "insurance")
	private PolicyDetails policy_details;
	
public Vendors getVendors() {
		return vendors;
	}

	public void setVendors(Vendors vendors) {
		this.vendors = vendors;
	}

public Insurance() {
		
	}

	
	public Insurance(int id, String name, Vendors vendors, PolicyDetails policy_details) {
	super();
	this.id = id;
	this.name = name;
	this.vendors = vendors;
	this.policy_details = policy_details;
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
	
	
	
}
