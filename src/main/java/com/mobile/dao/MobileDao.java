package com.mobile.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.globalExceptionHandler.NameNotFoundException;
import com.mobile.Repositary.MobileRepository;
import com.mobile.entity.MobileEntity;

@Repository
public class MobileDao {
@Autowired
MobileRepository mr;
		public String PostAll(List<MobileEntity>a) {
			mr.saveAll(a);
			return"saved succesfully";
			
		}
		public List<MobileEntity>getAll()
		{
			return mr.findAll();
		}
		//find by id
		public MobileEntity get(Integer a)
		{
			MobileEntity x= mr.findById(a).orElse(null);
			return x;
		}
		
		//delete by
		public String get1(Integer a)
		{
			mr.deleteById(a);
			return "deleted succesfully";
			
		}
		//putmapping update purpose
		public String putValue(MobileEntity m,Integer a)
		{
			MobileEntity x=mr.findById(a).get();
			x.setColor(m.getColor());
			x.setPrice(m.getPrice());
			x.setSize(m.getSize());
			x.setWarrenty(m.getWarrenty());
			mr.save(x);
			return "updated succesfully";
		}
		//patchMapping
		public String get3(MobileEntity m,Integer a)
		{
			MobileEntity x=mr.findById(a).get();
			x.setPrice(m.getPrice());	
			mr.save(x);
			return "updated succesfully";
		}
		public int getmax() {
			return mr.getmax1();
		}
		public List<MobileEntity>getma(){
			return mr.getma();
		}
		//public List<MobileEntity>get7(String a){
	//		return mr.get7(a);
		//}
		public List<MobileEntity>get8(Integer a,Integer b){
			return mr.get8(a,b);
		}
		public List<MobileEntity>get9(Integer a,Integer b){
			return mr.get9(a,b);
		}
		public List<MobileEntity>getvalue(Integer a){
			return mr.getvalue(a);
		}
		//public Integer getjp(){
	//		return mr.getjp();
		//}
		public List<MobileEntity>geto(String a){
			return mr.geto(a);
		}
		public List<MobileEntity>getExcept( String a){
			return mr.getExcept(a);
			
		}
		public List<MobileEntity>getExcept1(String a){
			return mr.getExcept1(a);
		}
		public List<MobileEntity>getname(String a){
			return mr.findAll();
		}
		
		

	}


