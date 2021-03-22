package com.demo.cts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.cts.model.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
	List<Country> findByNameContainingOrderByNameAsc(String str);
	List<Country> findByNameContaining(String str);
}
