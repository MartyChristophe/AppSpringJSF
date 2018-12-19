package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import entity.Person;
import service.PersonService;

@ManagedBean
@Controller
public class SpinnerController {
	private int number1;
	private Long id;
	@Autowired
	private PersonService personService;
	
	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Person> getPersons() {
		return this.personService.listPersons();
	}
	
	public Person loadPerson(Long id) {
		return this.personService.loadPerson(id);
	}
}
