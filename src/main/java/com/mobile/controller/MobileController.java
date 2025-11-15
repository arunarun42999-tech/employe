package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.globalExceptionHandler.NameNotFoundException;
import com.globalExceptionHandler.NumberNotFoundException;
import com.mobile.entity.MobileEntity;
import com.mobile.service.MobileService;



	@RestController
	@RequestMapping(value="/mob/api")
	public class MobileController {
		@Autowired
		MobileService ms;
		@PostMapping(value="/postvalue")
		public String postAll(@RequestBody List<MobileEntity>a) {
			return ms.postAll(a);
		}
		


	
@GetMapping(value="/getvalue")
public List<MobileEntity>getAll()
{
	return ms.getAll();
}

@GetMapping(value="getvalue/{a}")
public MobileEntity get(@PathVariable Integer a) 
{
	return ms.get(a);
}
@DeleteMapping(value="/deletevalue/{a}")
public String get1(@PathVariable Integer a)
{
	return ms.get1(a);
}
//putMapping update purpose
@PutMapping(value="/putvalue/{a}")
public String  putValue(@RequestBody MobileEntity m,@PathVariable Integer a)
{
	return ms.putValue(m,a);
}
@PatchMapping(value="/patchvalue/{a}")
public String get3(@RequestBody MobileEntity m,@PathVariable Integer a)
{
	return ms.get3(m,a);
}
@GetMapping(value="/getmax")
public Integer getmax() {
	return ms.getmax1();
}
@GetMapping (value="getMax")
public MobileEntity getMax() {
	return ms.getMax();
}
@GetMapping(value="/getprice")
public List<MobileEntity> getprice() {
	return ms.getprice();
}
@GetMapping(value="/getcount")
public long getcount(){
	return ms.getcount();
}
@GetMapping(value="/getsum")
public Integer getsum() {
	return ms.getsum();
}
//@GetMapping(value="/geteven")
//public List<MobileEntity> geteven(){
//	return ms.geteven;
//}
@GetMapping(value="/getmaxvalue")
public Integer getmax1() {
	return ms.getmax1();
}
@GetMapping(value="/getmaxprice")
public List<MobileEntity> getma(){
	return ms.getma();
	}
@GetMapping(value="/getbrand/{a}")
public List<MobileEntity> get7(@PathVariable String a){
	return ms.get7(a);
}
@GetMapping(value="/getprice1{a}/{b}")
public List<MobileEntity>get8(@PathVariable Integer a,@PathVariable Integer b){
	return ms.get8(a,b);
}
@GetMapping(value="/getprice2{a}/{b}")
public List<MobileEntity>get9(@RequestParam Integer a,@RequestParam Integer b ){
	return ms.get9(a,b);
}
//jpquery
@GetMapping(value="/get/{a}") 
public  List<MobileEntity> getvalue (@PathVariable Integer a ){
	return ms.getvalue(a);
	
}
//@GetMapping(value="/getjpvlaue")
//public Integer getjp(){
	//return ms.getjp;
//}
@GetMapping(value="/getvaluejp/{a}")
public List<MobileEntity> geto(@PathVariable String a){
	return  ms.geto(a);
	
}
@GetMapping("/getException/{a}")
public List<MobileEntity>getExcept(@PathVariable String a) throws NameNotFoundException{
	return ms.getExcept(a);
	
}
@GetMapping("/getNumException/{a}")
public List<MobileEntity>getExcept1(@PathVariable String a)throws NumberNotFoundException{
	return ms.getExcept1(a);
	
}
@GetMapping(value="/getname/{a}")
public List<MobileEntity>getname(@RequestParam String a){
	return ms.getname(a);
}





	}


