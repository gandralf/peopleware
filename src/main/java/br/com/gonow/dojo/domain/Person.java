package br.com.gonow.dojo.domain;

import org.springframework.core.style.ToStringCreator;

/**
 * Created by IntelliJ IDEA.
 * User: jairo
 * Date: 03/11/11
 * Time: 18:18
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private long id;
    private String name;
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Email: %s", id, name, email);
    }
}



