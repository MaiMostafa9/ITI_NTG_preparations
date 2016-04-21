package com.ntg.smartcompound.mai.model;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ntg.smartcompound.mai.HibernateEntity.User;
import com.ntg.smartcompound.mai.interfaces.Controller;
import com.ntg.smartcompound.mai.interfaces.Model;



/**
 *
 * @author Dell
 */
//@Repository(value = "model")
public class ModelImpl implements Model {

  //  @Autowired
    private Controller controller;
  //  @Autowired
  private SessionFactory sessionFactory;
    
    
 //   HibernateTemplate template;

public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//    public HibernateTemplate getTemplate() {
//        return template;
//    }
//
//    public void setTemplate(HibernateTemplate template) {
//        this.template = template;
//    }
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public ModelImpl() {

    }

    @Override
    public void insert(User user) {
//        session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.persist(user);
//        session.getTransaction().commit();
        
      //  template.setCheckWriteOperations(false);
       // template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
      //  template.save(user);
        
         sessionFactory.getCurrentSession().save(user);

    }
    @Override
    public List<User> selectAll(){
   // return template.loadAll(User.class);
        Criteria criteria = sessionFactory. getCurrentSession().createCriteria(User.class);
        return criteria.list();
    }

}