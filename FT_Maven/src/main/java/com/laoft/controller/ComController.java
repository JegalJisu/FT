package com.laoft.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.laoft.service.IComService;

@Controller
public class ComController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name = "ComService")
	private IComService comService;
	
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String getAuthList(HttpServletRequest request,HttpServletResponse response, ModelMap model) throws Exception{
		return "main";
	}
}
