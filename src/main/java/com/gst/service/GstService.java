package com.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.dao.GstDao;
import com.gst.entity.GstEntity;

@Service

public class GstService {
@Autowired
GstDao md;
public String postAll(List<GstEntity>a)
{
	return md.postAll(a);
}
public Integer get5(Integer a) {
	return md.get5(a);
}


}
