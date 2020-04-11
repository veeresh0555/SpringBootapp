package com.emp.model;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productid;
	
	private String pname;
	
	//private String desc;

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	
	
	
	
}
