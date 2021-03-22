package com.demo.cts.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.cts.model.Country;
import com.demo.cts.service.CountryService;




@Controller
public class CountryController {
	
	@Autowired
	public CountryService cs;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String start(@RequestParam(required=false,name="start") String start,ModelMap model) {
		List<Country> list=new ArrayList<>();
		if(start!=null) {
			System.out.println("Inside");
			list=cs.getStartCountries(start);
			System.out.println("after list");
			model.addAttribute("list",list);
		}else {
			Country c=new Country();
			c.setCode("NA");
			c.setName("Country Not Found");
			list.add(c);
			model.addAttribute("list",list);
		}
		if(list.isEmpty()) {
			Country c=new Country();
			c.setCode("NA");
			c.setName("Country Not Found");
			list.add(c);
		}
		return "index";
	}
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String show(@RequestParam(required=false,name="ele")String ele,ModelMap model) {
		if(ele==null) {
			return "index";
		}
		
		List<Country> list=cs.Orderedsearch(ele);
		model.addAttribute("search",ele);
		
		if(list.isEmpty()) {
			Country c=new Country();
			c.setCode("NA");
			c.setName("Country Not Found");
			list.add(c);
		}
		
		model.addAttribute("list1",list);
		return "index1";
	}
}
