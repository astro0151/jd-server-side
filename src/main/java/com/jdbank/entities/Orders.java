package com.jdbank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int policy_id;
	private int customer_id;
	private String start_date;
	private String end_date;
	private String status;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}



	public Orders(int id, int policy_id, String start_date, String end_date, int customer_id ,String status) {
		super();
		this.id = id;
		this.policy_id = policy_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.customer_id=customer_id;
		this.status = status;
	}



	public int getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public int getPolicy_id() {
		return policy_id;
	}



	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	
}
