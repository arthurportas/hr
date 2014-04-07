package com.homerenting.domain;

public enum UserKind {

	PRIVATE("private"),
	CORPORATE("corporate");
	
	private final String userKind;
	
	private UserKind(String userKind) {
		this.userKind = userKind;
	}
	
	public String getUserKind(){
		return this.userKind;
	}
}
