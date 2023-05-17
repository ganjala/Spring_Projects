package com.jsp.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootcrud.dao.MobileDao;
import com.jsp.springbootcrud.dto.Mobile;

@Service
public class MobileService {
	@Autowired
MobileDao dao;
public Mobile save(Mobile mobile) {
	return dao.saveMobile(mobile);
}
public List<Mobile> getAll(Mobile mobile){
	return dao.getAll(mobile);
}
public Mobile getById(int id) {
	return dao.getMobileById(id);
}
public String deleteMobile(int id) {
	return dao.deleteMobile(id);
}
public Mobile updateMobile(Mobile m) {
	return dao.updateMobile(m);
}
}
