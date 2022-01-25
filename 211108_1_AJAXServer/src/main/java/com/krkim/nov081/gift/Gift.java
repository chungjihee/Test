package com.krkim.nov081.gift;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Gift {
	private String g_name;
	private BigDecimal g_price;
	private String g_brand;

	public Gift() {
		// TODO Auto-generated constructor stub
	}

	public Gift(BigDecimal g_no, String g_name, BigDecimal g_price, String g_brand) {
		super();
		this.g_name = g_name;
		this.g_price = g_price;
		this.g_brand = g_brand;
	}


	public String getG_name() {
		return g_name;
	}

	@XmlElement
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public BigDecimal getG_price() {
		return g_price;
	}

	@XmlElement
	public void setG_price(BigDecimal g_price) {
		this.g_price = g_price;
	}

	public String getG_brand() {
		return g_brand;
	}

	@XmlElement
	public void setG_brand(String g_brand) {
		this.g_brand = g_brand;
	}

}
