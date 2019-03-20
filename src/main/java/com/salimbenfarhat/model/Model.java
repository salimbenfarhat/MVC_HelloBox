package com.salimbenfarhat.model;

public class Model {
	/*
	 * Attributs privés
	 */
	private String firstname;
	private String lastname;
	/*
	 * Constructeur
	 */
	public Model(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	/*
	 * Accesseurs et Mutateurs
	 */
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}