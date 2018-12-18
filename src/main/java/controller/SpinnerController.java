package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import configuration.AppConfig;
import entity.Person;
import service.PersonService;

@ManagedBean
@Component
public class SpinnerController {
	private int number1;
	@Autowired
	private PersonService personService;

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public List<Person> getPersons() {
		return this.personService.listPersons();
	}
}
