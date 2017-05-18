package com.invenger.hibernate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.invenger.hibernate.Dto.ApplicationConfigDto;
import com.invenger.hibernate.Model.Service;

@Component
@RequestMapping("/")
public class Hibernatecontroller {
	@Autowired
	private Service service;

	@RequestMapping("/view.do")
	public ModelAndView view(@ModelAttribute ApplicationConfigDto id1)
	{
		//String appName = appname.getAppName();
		int id=id1.getId();
		ApplicationConfigDto data = service.fetch(id);
		ModelAndView model = new ModelAndView();
		model.addObject("rowdata", data);
		model.setViewName("show");
		return model;
	}

}
