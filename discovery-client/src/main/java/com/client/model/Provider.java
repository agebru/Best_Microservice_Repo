package com.client.model;

public class Provider {
	private int companyId;
	private String companyName;
	
	
	public Provider() {
		
	}
	
	


	public Provider(int companyId, String companyName) {
		this.companyId = companyId;
		this.companyName = companyName;
	}




	public int getCompanyId() {
		return companyId;
	}


	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	

}
