package com.lou19.votem.model;

import java.io.Serializable;

public class User implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 4100776772594593854L;
private String id;

public User(String id) {
	this.id=id;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
}
