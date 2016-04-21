package com.ntg.smartcompound.mai.interfaces;

import java.util.List;

import com.ntg.smartcompound.mai.HibernateEntity.User;

/**
 *
 * @author Dell
 */
public interface Controller {

    public void add(User user);
      public List<User> selectAll();



}
