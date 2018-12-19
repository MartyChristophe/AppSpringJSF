package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import entity.Person;

@Repository
public class PersonDaoImp implements PersonDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void add(Person person) {
		em.persist(person);
	}

	@Override
	public List<Person> listPersons() {
		CriteriaQuery<Person> criteriaQuery = em.getCriteriaBuilder().createQuery(Person.class);
		criteriaQuery.from(Person.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

	public Person loadPerson(Long id) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Person> criteriaQuery = cb.createQuery(Person.class);
		Root<Person> root = criteriaQuery.from(Person.class);
		criteriaQuery.select(root).where(cb.equal(root.get("id"), id));
		return em.createQuery(criteriaQuery).getSingleResult();
	}

}
