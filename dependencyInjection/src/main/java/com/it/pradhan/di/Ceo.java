package com.it.pradhan.di;

public class Ceo {
	
	private String ceoName;

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	
	public void getCeoInfo() {
		System.out.println("ceo info is: " + ceoName);
	}

}
