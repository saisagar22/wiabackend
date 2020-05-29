package com.bfwg.rest;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfwg.model.SearchResult;
import com.bfwg.model.SearchResults;

/**
 * Created by fan.jin on 2016-10-15.
 */

@RestController
@CrossOrigin(origins = "http://localhost:2200")
public class CustomerController {

	@RequestMapping(method = POST, value = "/stollepp")
	public SearchResults addUser(@RequestBody String id) {
		System.out.println("Inside CustomerController ");
		SearchResult result = new SearchResult();
		result.setCanton("canton");
		result.setCarlisle("carlise");
		result.setColorado("colorado");
		result.setGuangdong("guamd");
		result.setIndaiatuba("indaiatuba");
		result.setManaus("manaus");
		result.setPartDiscription("partDiscription");
		result.setSalesPartNumner("salesPartNumner");
		result.setShanghai("shanghai");
		result.setSydney("sydney");
		SearchResult[] results = new SearchResult[1];
		results[0] = result;
		SearchResults serachResults = new SearchResults();
		serachResults.setSearchResults(results);
		return serachResults;
	}

}
