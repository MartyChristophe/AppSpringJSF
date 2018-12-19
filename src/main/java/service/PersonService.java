package service;

import java.util.List;

import entity.Person;

public interface PersonService {
    void add(Person person);
    List<Person> listPersons();
    Person loadPerson(Long id);
}
