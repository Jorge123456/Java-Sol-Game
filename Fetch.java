package com.journaldev.jaxrs.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "player")
public class Player {
	private String player_name;
	boolean admin_priv = false;
    boolean contract = false;
    int num_char;
    String[] avatars = {};
	private int num_code;

	public String getName() {
		return player_name;
	}

	public void setName(String player_name) {
		this.name = player_name;
	}

	public boolean getPriv() {
		return admin_priv;
	}

	protected void setPriv(boolean admin_priv) {
		this.admin_priv = admin_priv;
	}

	public boolean getCon() {
		return contract;
	}

	protected void setCon(boolean contract) {
		this.contract = contract;
	}

	public int getNumCode() {
		return num_code;
	}

	protected void setNumCode(int num_code) {
		this.num_code = num_code;
	}

	public int getNumChar() {
		return num_char;
	}

	protected void setNumChar(int num_char) {
		this.num_char = num_char;
	}
	
	public String[] getAva() {
		return avatars;
	}

	protected void setAva(String avatars) {
		this.avatars = avatars;
	}

	@Override
	public String toInfo() {
		return num_code + "::" + player_name + "::" + avatars;
	}

}
