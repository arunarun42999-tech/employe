package com.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gst.entity.GstEntity;
import com.gst.service.GstService;

@RestController
@RequestMapping(value="/gst/api")

public class GstController {
@Autowired
GstService ms;
@PostMapping(value="/postvalue")
public String postAll(@RequestBody List<GstEntity>a)
{
	return ms.postAll(a);
}
@GetMapping(value="/valuegs/{a}")
public Integer get5(@PathVariable Integer a) {
	return ms.get5(a);
}


	

}
