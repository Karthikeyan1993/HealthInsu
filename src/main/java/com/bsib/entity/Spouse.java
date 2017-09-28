package com.bsib.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Spouse extends Individual {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SPOUSE_ID")
	private Long id;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PROP_ID")
	private Proposar proposar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setProposar(Proposar proposar) {
		this.proposar = proposar;
	}

}
