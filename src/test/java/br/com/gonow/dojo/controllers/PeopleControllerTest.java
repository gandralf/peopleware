package br.com.gonow.dojo.controllers;

import org.japybara.WebTestCase;
import org.junit.Test;

public class PeopleControllerTest extends WebTestCase {
	
	@Test
	public void shouldGetAListOfPeople() throws Exception {
		 visit("/people");
         System.out.println(getContent());
	     assertHasContent("HEADER");
	}
	
	@Test
	public void shouldGetPeopleById() throws Exception {
		 visit("/people/15");
		 System.out.println(getContent());
	}

}
