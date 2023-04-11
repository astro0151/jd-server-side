package com.jdbank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="policy_details")
public class PolicyDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String policy_name;
	private String tenure;
	private int premium;
    private int	insurance_id;

	public PolicyDetails() {
	
	}
	
	
	public PolicyDetails(int id, String policy_name, String tenure, int premium, int insurance_id) {
		super();
		this.id = id;
		this.policy_name = policy_name;
		this.tenure = tenure;
		this.premium = premium;
		this.insurance_id = insurance_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPolicy_name() {
		return policy_name;
	}


	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}


	public String getTenure() {
		return tenure;
	}


	public void setTenure(String tenure) {
		this.tenure = tenure;
	}


	public int getPremium() {
		return premium;
	}


	public void setPremium(int premium) {
		this.premium = premium;
	}


	public int getInsurance_id() {
		return insurance_id;
	}


	public void setInsurance_id(int insurance_id) {
		this.insurance_id = insurance_id;
	}


	@Override
	public String toString() {
		return "PolicyDetails [id=" + id + ", policy_name=" + policy_name + ", tenure=" + tenure
				+ ", premium=" + premium + "]";
	}
}
