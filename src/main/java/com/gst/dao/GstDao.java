package com.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gst.entity.GstEntity;
import com.gst.repositary.GstRepositary;

@Repository

public class GstDao {
	@Autowired
	GstRepositary mr;
	public String postAll(List<GstEntity>a) 
	{
		mr.saveAll(a);
		return "saved sucessfully";
		
	}
	public Integer get5(Integer a) {
		return mr.get5(a);
	}

}
