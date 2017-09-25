package com.bsib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bsib.entity.Proposar;
import com.bsib.repository.ProposarRepository;

@RestController
@RequestMapping("api/v1/")
public class ProposarController {

	@Autowired
	private ProposarRepository proposarRepository;

	@RequestMapping(value = "/proposals", method = RequestMethod.GET)
	public List<Proposar> masterResult() {
		return proposarRepository.findAll();

	}

}
