package com.revature.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class CustomerEntity {
	@Id
	private Integer customerId;
	private String customerName;
	private Double customerSalary;

	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", customerName=" + customerName + ", customerSalary="
				+ customerSalary + "]";
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getCustomerSalary() {
		return customerSalary;
	}

	public void setCustomerSalary(Double customerSalary) {
		this.customerSalary = customerSalary;
	}

	public CustomerEntity(Integer customerId, String customerName, Double customerSalary) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSalary = customerSalary;
	}

	public CustomerEntity() {
		super();
	}

}
