package com.invenger.hibernate.Model;

import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.persistence.CacheRetrieveMode;
import javax.persistence.CacheStoreMode;

import net.sf.ehcache.config.CacheConfiguration;

import org.hibernate.CacheMode;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.CacheControl;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.invenger.hibernate.Dto.ApplicationConfigDto;

@Component
public class DAO {
	@Autowired
	SessionFactory sf;
	/*public void save(ApplicationConfigDto a) 
	{
		Session ss = sf.openSession();
		ss.save(a);
		ss.beginTransaction().commit();

	}*/
	
	public ApplicationConfigDto fetch(int id) {
		
		Session s = sf.openSession();
	 	return s.load(ApplicationConfigDto.class, id);
	}

}
