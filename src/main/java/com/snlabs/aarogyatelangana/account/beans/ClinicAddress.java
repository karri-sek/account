package com.snlabs.aarogyatelangana.account.beans;

public class ClinicAddress {
	private int clinicID;
	private String ownerName;
	private String type;
	private String address;
	private String district;
	private String state;
	private int pincode;
	private int contactNum;
	private String clinicName;

	public int getClinicID() {
		return clinicID;
	}

	public void setClinicID(int clinicID) {
		this.clinicID = clinicID;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getContactNum() {
		return contactNum;
	}

	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}

	public String getClinicName() {
		return clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}

	@Override
	public String toString() {
		return "ClinicAddress [clinicID=" + clinicID + ", ownerName="
				+ ownerName + ", type=" + type + ", address=" + address
				+ ", district=" + district + ", state=" + state + ", pincode="
				+ pincode + ", contactNum=" + contactNum + ", clinicName="
				+ clinicName + "]";
	}
}
