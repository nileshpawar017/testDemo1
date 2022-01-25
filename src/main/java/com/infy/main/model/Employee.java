package com.infy.main.model;

public class Employee {
	
	private int eId;
	private String eName;

	public Employee(int eId, String eName)
	{
		this.eId=eId;
		this.eName=eName;
	}
	
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}
	
}
