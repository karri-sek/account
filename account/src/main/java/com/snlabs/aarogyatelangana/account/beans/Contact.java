package com.snlabs.aarogyatelangana.account.beans;

public class Contact {	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

		private String firstname;
	    private String lastname;
	    private String email;
	    private String phone;
	 
	    public Contact() {
	    }
	 
	    public Contact(String firstname, String lastname, String email, String phone) {
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.email = email;
	        this.phone = phone;
	    }
	     
	    // Getter and Setter methods
	
}
