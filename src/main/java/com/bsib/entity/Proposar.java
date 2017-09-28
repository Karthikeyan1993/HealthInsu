package com.bsib.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Proposar extends Individual {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PROP_ID")
	private Long id;
	private String address;
	private String email;
	private String phoneOffice;
	private String phoneMobiel;
	private String phoneHome;
	private String state;
	private String postcode;
	private String nationality;
	private String gstCommenceDate;
	private String gstRegisNumber;
	private String race;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PROP_ID")
	private List<Children> children;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PROP_ID")
	private Spouse spouse;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneOffice() {
		return phoneOffice;
	}

	public void setPhoneOffice(String phoneOffice) {
		this.phoneOffice = phoneOffice;
	}

	public String getPhoneMobiel() {
		return phoneMobiel;
	}

	public void setPhoneMobiel(String phoneMobiel) {
		this.phoneMobiel = phoneMobiel;
	}

	public String getPhoneHome() {
		return phoneHome;
	}

	public void setPhoneHome(String phoneHome) {
		this.phoneHome = phoneHome;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGstCommenceDate() {
		return gstCommenceDate;
	}

	public void setGstCommenceDate(String gstCommenceDate) {
		this.gstCommenceDate = gstCommenceDate;
	}

	public String getGstRegisNumber() {
		return gstRegisNumber;
	}

	public void setGstRegisNumber(String gstRegisNumber) {
		this.gstRegisNumber = gstRegisNumber;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public List<Children> getChildren() {
		return children;
	}

	public void setChildren(List<Children> children) {
		this.children = children;
	}

	public Spouse getSpouse() {
		return spouse;
	}

	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
		spouse.setProposar(this);
	}

}
