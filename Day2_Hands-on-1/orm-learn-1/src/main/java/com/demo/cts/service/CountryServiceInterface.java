package com.demo.cts.service;

import java.util.List;

import com.demo.cts.model.Country;

public interface CountryServiceInterface {
	public List<Country> getStartCountries(String s);
	public List<Country> search(String s);
	public List<Country> Orderedsearch(String s);
}
