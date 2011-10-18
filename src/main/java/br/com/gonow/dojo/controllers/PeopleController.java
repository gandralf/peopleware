package br.com.gonow.dojo.controllers;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

@Resource
public class PeopleController {

	// @Get , by default is @Get
	@Path("/people/")
	public List<String> list() {
		final List<String> lista = new ArrayList<String>();

		return lista;
	}

	@Get
	@Path("/people/{id}")
	public String show(int id) {
		return "People: " + id;
	}
}
