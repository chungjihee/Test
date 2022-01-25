package com.krkim.nov081.gift;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Gifts {
	private List<Gift> gift;
	
	public Gifts() {
		// TODO Auto-generated constructor stub
	}

	public Gifts(List<Gift> gift) {
		super();
		this.gift = gift;
	}

	public List<Gift> getGift() {
		return gift;
	}

	@XmlElement
	public void setGift(List<Gift> gift) {
		this.gift = gift;
	}

	
}
