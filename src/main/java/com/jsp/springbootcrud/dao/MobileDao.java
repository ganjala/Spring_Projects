package com.jsp.springbootcrud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.springbootcrud.dto.Mobile;
import com.jsp.springbootcrud.repository.MobileRepository;

@Repository
public class MobileDao {
	@Autowired
	MobileRepository mobileRepository;
	public Mobile saveMobile(Mobile mobile) {
		return mobileRepository.save(mobile);
	}
	public List<Mobile> getAll(@RequestBody Mobile mobile){
		return mobileRepository.findAll();
		
	}
	public Mobile getMobileById(int id) {
		Optional<Mobile> op= mobileRepository.findById(id);
		return op.get();
	}
	public String deleteMobile(int id) {
		Optional<Mobile> optional=mobileRepository.findById(id);
		if(optional.get()!=null) {
			mobileRepository.delete(optional.get());
			return "Your mobile data deleted successfully";
		}
		return null;
	}
	public Mobile updateMobile(Mobile mobile) {
		Optional< Mobile> optional=mobileRepository.findById(mobile.getId());
		if(optional.get()!=null) {
			mobileRepository.save(mobile);
			return mobile;
		}
		return null;
	}
}
