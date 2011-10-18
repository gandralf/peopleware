package br.com.gonow.dojo.controllers;

import org.japybara.WebTestCase;
import org.junit.Test;

public class PeopleControllerTest extends WebTestCase {
	
	@Test
	public void shouldGetAListOfPeople() throws Exception {
		 visit("/people/");
	     assertHasContent("List");
	}
	
	@Test
	public void shouldGetPeopleById() throws Exception {
		 visit("/show");
//		 System.out.println(getContent());
	     assertHasContent("People: 15");
	}
	

}
