package com.bsib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bsib.entity.Proposar;

@Repository("proposarRepository")
public interface ProposarRepository extends JpaRepository<Proposar, Long> {

}
