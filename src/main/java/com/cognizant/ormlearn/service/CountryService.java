package com.cognizant.ormlearn.service;

import java.util.List;
import com.cognizant.ormlearn.model.Country;


public interface CountryService {
	public Country addCountry(Country country);
	  public Country getCountry(String searchCode);
	  public List<Country> getAllCountry();
	  public Country deleteCountry(String searchCode);
	  public Country updateCountry(Country country);

}
