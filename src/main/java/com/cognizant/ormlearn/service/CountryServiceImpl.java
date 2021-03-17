package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;


@Service
public class CountryServiceImpl implements CountryService{
	
		@Autowired
		private CountryRepository countryRepository;
		
		

	@Override
		public List<Country> getAllCountry() {
			
			List<Country> countryList=(List<Country>)countryRepository.findAll();
			return countryList;
			
		}



	@Override
	public Country addCountry(Country country) {
		countryRepository.save(country);
        return country; 
		
	}



	@Override
	public Country getCountry(String searchCode) {
		Country country=null;
		Optional<Country> searchedCountry=countryRepository.findById(searchCode);
		if(searchedCountry.isPresent())
		{
			country=searchedCountry.get();
		}
		return country;
	}



	@Override
	public Country deleteCountry(String searchCode) {
		Country country=null;
		Optional<Country> searchedCountry=countryRepository.findById(searchCode);
		if(searchedCountry.isPresent())
		{
			country=searchedCountry.get();
			countryRepository.delete(country);
		}
		return country;
	}



	@Override
	public Country updateCountry(Country country) {
		countryRepository.save(country);
        return country; 
        }



	

}
