package com.it.pradhan.di;

public class Ceo {
	private int id;

	private String ceoName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	
	public void getCeoInfo() {
		System.out.println("ceo info is: " + ceoName  + " and the id is: "+id);
	}

}
