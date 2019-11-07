package com.library.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.library.layer.data_access.AuthorDAO;
import com.library.layer.entities.Author;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AuthorDaoTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private AuthorDAO authorDAO;
	
	@Test
	public void whenFindByName_thenReturnEmployee() {
	    // given
	    Author alex = new Author();
	    alex.setName("Alex");
	    alex.setSurname("Morgan");
	    entityManager.persist(alex);
	    entityManager.flush();
	    // when
	    Author found = authorDAO.findByName(alex.getName());
	    // then
	    assertThat(found.getName())
	      .isEqualTo(alex.getName());
	}
}
