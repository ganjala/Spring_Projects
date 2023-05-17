package com.jsp.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootcrud.dto.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer>{

}
