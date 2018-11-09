package com.capgemini.jpa.entities;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int c_id;
	private String c_name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="f_id")
	private FeeDetails feeDetails;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	public FeeDetails getFeeDetails() {
		return feeDetails;
	}
	public void setFeeDetails(FeeDetails feeDetails) {
		this.feeDetails = feeDetails;
	}
	
	@Override
	public String toString() {
		return "Courses [c_id=" + c_id + ", c_name=" + c_name + ", feeDetails="
				+ feeDetails + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + c_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Courses other = (Courses) obj;
		if (c_id != other.c_id)
			return false;
		return true;
	}
	

}
