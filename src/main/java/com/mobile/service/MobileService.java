package com.mobile.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalExceptionHandler.NameNotFoundException;
import com.globalExceptionHandler.NumberNotFoundException;
import com.mobile.dao.MobileDao;
import com.mobile.entity.MobileEntity;


@Service
public class MobileService {
@Autowired
		MobileDao md;
		public String postAll(List<MobileEntity> a) {
			return md.PostAll(a);
		}
		
		
		public List<MobileEntity>getAll()
		{
			return md.getAll();
		}
		public MobileEntity get(Integer a)
		{
			return md.get(a);
		}
		public String get1(Integer a)
		{
			return md.get1(a);
		}
		public String putValue(MobileEntity m,Integer a)
		{
			return md.putValue(m,a);
		}
		//patch value
	public String get3(MobileEntity m, Integer a)
		{
			return md.get3(m,a);
			
		}
	public Integer getmax() {
		List<MobileEntity> x=md.getAll();
		return  x.stream().map(c->c.getPrice()).max(Comparable::compareTo).get();
	}
	public MobileEntity getMax() {
		List<MobileEntity>d=md.getAll();
		return d.stream().max(Comparator.comparing(MobileEntity::getPrice)).get();
	}
	public List< MobileEntity> getprice() {
		List<MobileEntity> v=md.getAll();
		return v.stream().sorted(Comparator.comparing(MobileEntity::getPrice)).collect(Collectors.toList());
	}
	public  long getcount(){
		List<MobileEntity> g=md.getAll();
		return g.stream().map(x->x.getColor()).count();
		
		}
	public Integer getsum() {
		List<MobileEntity>h=md.getAll();
		return h.stream().collect(Collectors.summingInt(x->x.getPrice()));
	}
	//public MobileEntity geteven() {
	//	List<MobileEntity>y=md.getAll();
				
	//}
	public int getmax1() {
		return md.getmax();
	}
	public List<MobileEntity> getma(){
		return md.getma();
	}
	public List<MobileEntity> get7(String a){
		List<MobileEntity>aa=md.getAll().stream().filter(x->x.getBrand().equalsIgnoreCase(a)).collect(Collectors.toList());
		return aa;
	}
	public List<MobileEntity>get8(Integer a,Integer b){
		return md.get8(a,b);
		
	}
	public List<MobileEntity>get9(Integer a,Integer b){
		return md.get9(a,b);
		
		
	}
	public List<MobileEntity>getvalue (Integer a){
		return md.getvalue(a);
	}
	//public Integer getjp(){
	//	return md.getjp();
//	}
	public List<MobileEntity>geto(String a){
		return md.geto(a);
	}
	public List<MobileEntity>getExcept(String a) throws NameNotFoundException{
		List<MobileEntity> result=md.getExcept(a);
		if(result.isEmpty()) {
			throw new NameNotFoundException("name not found");
		}
		else {
			return md.getExcept(a);
		}
	}
	public List<MobileEntity>getExcept1(String a) throws NumberNotFoundException{
		List<MobileEntity> result= md.getExcept1(a);
		if(result.isEmpty()) {
			throw new NumberNotFoundException("Number not found");
		}
		else {
			return md.getExcept1(a);
		}
	}


	public List<MobileEntity>getname(String a){
		List<MobileEntity>dq=md.getAll().stream().filter(x->"red".equals(x.getColor())).collect(Collectors.toList());
		return dq;
		
		
	
		
	}
}

	



