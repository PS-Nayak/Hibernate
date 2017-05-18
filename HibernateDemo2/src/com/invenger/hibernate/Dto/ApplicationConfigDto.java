package com.invenger.hibernate.Dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


 @Entity
 @Table(name="Application_Config")
public class ApplicationConfigDto implements Serializable 
{
	private int id;
	private String App_Name;
	private String Param_Name;
	private String Param_Value;
	private String Active_YN;
	private String Created_By;
	private Date Created_Date;
	private String Updated_By;
	private Date Updated_Date;
	private String Reserved_1;
	private String Reserved_2;
	
	
	
	public String getReserved_1() {
		return Reserved_1;
	}
	public void setReserved_1(String reserved_1) {
		Reserved_1 = reserved_1;
	}
	public String getReserved_2() {
		return Reserved_2;
	}
	public void setReserved_2(String reserved_2) {
		Reserved_2 = reserved_2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApp_Name()
	{
		return App_Name;
	}
	public void setApp_Name(String app_Name)
	{
		App_Name = app_Name;
	}
	
	public String getParam_Name()
	{
		return Param_Name;
	}
	public void setParam_Name(String param_Name)
	{
		Param_Name = param_Name;
	}
	
	public String getParam_Value()
	{
		return Param_Value;
	}
	public void setParam_Value(String param_Value)
	{
		Param_Value = param_Value;
	}
	
	public String getActive_YN()
	{
		return Active_YN;
	}
	public void setActive_YN(String active_YN)
	{
		Active_YN = active_YN;
	}
	
	public String getCreated_By()
	{
		return Created_By;
	}
	public void setCreated_By(String created_By)
	{
		Created_By = created_By;
	}
	
	public Date getCreated_Date()
	{
		return Created_Date;
	}
	public void setCreated_Date(Date created_Date)
	{
		Created_Date = created_Date;
	}
	
	public String getUpdated_By()
	{
		return Updated_By;
	}
	public void setUpdated_By(String updated_By)
	{
		Updated_By = updated_By;
	}
	
	public Date getUpdated_Date()
	{
		return Updated_Date;
	}
	public void setUpdated_Date(Date updated_Date)
	{
		Updated_Date = updated_Date;
	}
}