package com.bsib.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity(name = "SPOUSE")
public class Spouse extends Individual {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SPOUSE_ID")
	private Long id;

	// @OneToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "PROP_ID")
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private Proposar proposar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Proposar getProposar() {
		return proposar;
	}

	public void setProposar(Proposar proposar) {
		this.proposar = proposar;
	}

}
