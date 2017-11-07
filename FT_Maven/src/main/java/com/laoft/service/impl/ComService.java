package com.laoft.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.laoft.persistance.mapper.ComMapper;
import com.laoft.service.IComService;

@Service("ComService")
public class ComService implements IComService{
	
	@Resource(name="ComMapper")
	private ComMapper comMapper;
}
