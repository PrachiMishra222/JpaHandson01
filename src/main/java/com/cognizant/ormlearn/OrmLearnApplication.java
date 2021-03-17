package com.cognizant.ormlearn;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;


@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {
	
	@Autowired
	  private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);}
		
	
		public void run(String... args) throws Exception {
	  		  Scanner scanner=new Scanner(System.in); 
	  		  int ch=0;
	  		  while(true)
	  		  {
	  			  System.out.println("1) ADD COUNTRY");
	  			  System.out.println("2 SEARCHING A SPECIFIC COUNTRY");
	  			  System.out.println("3) DISPLAY COUNTRIES");
	  			  System.out.println("4) DELETE COUNTRY");
	  			  System.out.println("5) UPDATE COUNTRY");
	  			  System.out.println("6) EXIT");
	  			  System.out.println("Enter your choice ");
	  			  ch=scanner.nextInt();
	  			  switch(ch)
	  			  {
	  			  case 1 :        Country country=new Country();
	  		  		              System.out.println("Enter the code of the country");
	  		                      String code=scanner.next(); 
	  		                      System.out.println("Enter the name of the country"); 
	  		                      String name=scanner.next(); 
	  		                      
	  		                      country.setCode(code);
	  		                      country.setName(name);
	  		                       
	  		                    country=countryService.addCountry(country);
	  		                      System.out.println("Country added!!!!!!!!!!"+country);
	  		                      break;
	  		 
	  			  case 2 :  	 System.out.println("Searching a specific country"); 
	  			                 System.out.println("Enter the country code to be searched");
	  			                 String searchCode=scanner.next();
	  			                 Country countrySearched=countryService.getCountry(searchCode); 
	  			                 if(countrySearched!=null) {
	  		                     System.out.println(countrySearched);
	  		                     }
	  			                 else {
	  		                         System.out.println("Country not found!!!!!!");
	  		                          }
	  		                    
	  			                break;
	  			                
	  			  case 3 :    System.out.println("All the countries list : ");
	  	                      List<Country> countryList=countryService.getAllCountry();
	  		                  for(Country country1 : countryList)
	  		                   {
	  		                	System.out.println(country1.getCode()+" "+country1.getName());
	  		                   }
	  		                   break;
	  		                   
	  			  case 4 : 	  System.out.println("Demo of delete!!!!!");
	  			              System.out.println("Enter the Country to be deleted");
	  			            searchCode=scanner.next();
	  			            Country countrySearchedForDelete=countryService.deleteCountry(searchCode); 
	  		 		      
	  		 		          if(countrySearchedForDelete!=null) {
	  		 		          System.out.println("Country deleted : "+countrySearchedForDelete);	 		          
	  		                  
	  		 		          } else {
	  		                      System.out.println("No country with the code entered"); 
	  		                      }
	  		                  break;
	  			  case 5  :    System.out.println("Demo for update");            
	  	  	                   System.out.println("Enter the code of the country to be updated");
	  	  	              searchCode=scanner.next();
	  	                     Country countryToBeUpdated=countryService.getCountry(searchCode); 
  			                  if(countryToBeUpdated!=null) {
  		                           System.out.println(countryToBeUpdated);
  		                           System.out.println("Enter the new name of the country");
  		                           countryToBeUpdated.setName(scanner.next());
	  	                         Country countryUpdated= countryService.updateCountry(countryToBeUpdated); 
	  	                         System.out.println("Country update!!!!!"+countryUpdated);
	  	                         }
  			                  else
	  	                       {
	  	      	                 System.out.println("Country not found!!!!!!");
	  	                       }
	  	                       break;
	  			  case 6 : System.exit(0);
	  			  
	  			  } // end of switch
	  	     }  // end of while
	}

}
