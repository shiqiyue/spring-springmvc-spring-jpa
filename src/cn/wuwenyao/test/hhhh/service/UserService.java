package cn.wuwenyao.test.hhhh.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.wuwenyao.test.hhhh.dao.UserDao;
import cn.wuwenyao.test.hhhh.entity.User;

@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class UserService {

	@Autowired
	private UserDao userDao;
	
	private static Logger log = LoggerFactory.getLogger("UserService");
	
	
	public boolean addUser(User user){
		log.debug("add user");
		user = userDao.save(user);
		if (user == null){
			log.error("add user fail");
			return false;
		}
		return true;
	}
	
	public User findUserById(Long id){
		return userDao.findOne(id);
	}
}
