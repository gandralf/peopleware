package br.com.gonow.dojo.controllers;

import java.util.*;

import br.com.caelum.vraptor.*;
import br.com.gonow.dojo.domain.Person;

@Resource
public class PeopleController {

    private Result result;
    private static Map<Long, Person> people = new HashMap<Long, Person>();

    public PeopleController(Result result) {
        this.result = result;
    }

    @Get
    @Path("/people")
	public List<Person> list() {
		return new ArrayList<Person>(people.values());
	}

	@Path("/people/{id}")
	public Person show(long id) {
		return people.get(id);
	}

    @Path("/people/new")
    public Person newPerson() {
       return newPerson(new Person());
    }

    public Person newPerson(Person person) {
       return person;
    }

    @Post
    @Path("/people")
    public void create(Person person) {
        if (person.getName().equals("")) { // fake validate
            result.forwardTo(getClass()).newPerson(person);
        } else {
             // fake persisted
            person.setId(new Random().nextLong());
            people.put(person.getId(), person);
            result.redirectTo(getClass()).show(person.getId());
        }
    }
}
