package com.rest.jersey;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FCModel {
	private long accountNum;
	private String accountName;
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	
	
}
