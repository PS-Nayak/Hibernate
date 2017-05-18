package com.invenger.hibernate.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.invenger.hibernate.Dto.ApplicationConfigDto;

@Component
public class Service {
	@Autowired
	private DAO dao;

	public  ApplicationConfigDto fetch(int id) {
		return dao.fetch(id);
	}

}
