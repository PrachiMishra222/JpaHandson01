package com.demo.cts.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.cts.model.Country;
import com.demo.cts.repository.CountryRepository;
@Service
public class CountryService implements CountryServiceInterface{
	@Autowired
	public CountryRepository cr;
	@Override
	public List<Country> getStartCountries(String s) {
		List<Country> l=cr.findAll().stream().filter(o1->o1.getName().startsWith(s.toUpperCase())).collect(Collectors.toList());
		l.sort(Comparator.comparing(o->o.getName()));
		return l;
	}
	@Override
	public List<Country> Orderedsearch(String s) {
		List<Country> l=cr.findByNameContainingOrderByNameAsc(s);
		return l;
	}
	@Override
	public List<Country> search(String s) {
		List<Country> l=cr.findByNameContaining(s);
		return l;
	}

}
