package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.entity.Pooja;

@Repository
public interface PoojaRepository extends JpaRepository<Pooja, Long> {

}