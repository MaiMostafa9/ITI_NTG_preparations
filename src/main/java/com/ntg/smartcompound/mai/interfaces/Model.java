package com.ntg.smartcompound.mai.interfaces;

import java.util.List;

import com.ntg.smartcompound.mai.hibernateEntity.User;

/**
 *
 * @author Dell
 */
public interface Model {

    public void insert(User user);
      public List<User> selectAll();


}
