package com.ntg.smartcompound.mai.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ntg.smartcompound.mai.hibernateEntity.User;
import com.ntg.smartcompound.mai.interfaces.Controller;
import com.ntg.smartcompound.mai.interfaces.Model;

//@Repository(value = "model")
public class ModelImpl implements Model {

	private Controller controller;
	private SessionFactory sessionFactory;

	//@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//@Autowired
	public void setController(Controller controller) {
		this.controller = controller;
	}

	public ModelImpl() {

	}

	@Override
	public void insert(User user) {
		sessionFactory.getCurrentSession().save(user);

	}

	@Override
	public List<User> selectAll() {

		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(
				User.class);
		return criteria.list();
	}

}