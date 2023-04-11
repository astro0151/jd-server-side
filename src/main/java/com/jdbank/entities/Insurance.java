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
	
	private int vendor_id;
	
public Insurance(int id, String name, int vendor_id) {
		super();
		this.id = id;
		this.name = name;
		this.vendor_id = vendor_id;
	}

//	@OneToOne
//	@JoinColumn( name="vendor_id")
//	private Vendors vendors;
//
//	@OneToOne( 
// mappedBy = "insurance")
//	private PolicyDetails policy_details;
	
public int getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	

public Insurance() {
		
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
