package com.yugiohwiki.test;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.yugiohwiki.Monster;

public class MonsterTest {
	private EntityManagerFactory emf;
	private EntityManager em;

	@BeforeEach
	void setUp() throws Exception {
		emf =
		Persistence.createEntityManagerFactory("YugiohWiki");
		em = emf.createEntityManager();
	}

	@AfterEach
	void tearDown() throws Exception {
		 em.close();
	     emf.close();
	}

	@Test
	void test_mapping() {
		Monster monster = em.find(Monster.class, 1);
		assertEquals("Dark Magician", monster.getName());
	}

}
