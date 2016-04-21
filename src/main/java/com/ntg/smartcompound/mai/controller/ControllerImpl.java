package com.ntg.smartcompound.mai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ntg.smartcompound.mai.hibernateEntity.User;
import com.ntg.smartcompound.mai.interfaces.Controller;
import com.ntg.smartcompound.mai.interfaces.Model;

//@Service(value = "controller")
public class ControllerImpl implements Controller {

	private Model model;

	//@Autowired
	public void setModel(Model model) {
		this.model = model;
	}

	@Transactional
	@Override
	public void add(User user) {
		model.insert(user);
	}

	@Transactional
	@Override
	public List<User> selectAll() {
		return model.selectAll();
	}

}
