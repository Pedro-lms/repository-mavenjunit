package javahibernate;

import org.junit.Test;

import javamavenhibernate.HibernateUtil;

public class TesteHibernate {

	@Test
	public void testeHibernateUtil() {
		HibernateUtil.getEntityManager();
	}
}
