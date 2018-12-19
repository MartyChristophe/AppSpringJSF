package dao;

import java.util.List;

import entity.Person;

public interface PersonDao {
	   void add(Person person);
	   List<Person> listPersons();
	   Person loadPerson(Long id);
}
