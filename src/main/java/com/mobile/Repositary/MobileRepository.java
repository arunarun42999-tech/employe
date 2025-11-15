package com.mobile.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mobile.entity.MobileEntity;

public interface MobileRepository extends JpaRepository<MobileEntity,Integer>{

@Query(value="SELECT max(price)FROM mobiledb.mobiletable",nativeQuery= true)
public int getmax1();

@Query(value="SELECT max(price)FROM mobiledb.mobiletable",nativeQuery=true)
public List<MobileEntity> getmaxvalue();
//subQuery
@Query(value="SELECT *FROM mobiledb.mobiletable WHERE price=(SELECT max(price) FROM mobiledb.mobiletable)",nativeQuery=true)
public List<MobileEntity>getma();


@Query(value="SELECT*FROM mobiledb.mobiletable WHERE price BETWEEN?1 and ?2",nativeQuery=true)
public List<MobileEntity>get8(Integer a,Integer b);

@Query(value="SELECT*FROM mobiledb.mobiletable WHERE price BETWEEN?1 and ?2",nativeQuery=true)
public List<MobileEntity>get9(Integer a,Integer b);

@Query(value="SELECT e FROM MobileEntity e WHERE e.price=?1")
public List<MobileEntity> getvalue(Integer a);

@Query(value="SELECT*FROM MobileEntity WHERE price BETWEEN 20000 and 25000",nativeQuery=true)
public List<MobileEntity>geto(String a);

@Query(value="SELECT*FROM mobiledb.mobiletable WHERE brand=?",nativeQuery=true)
public List<MobileEntity> getExcept(String a);

@Query(value="SELECT*FROM mobiledb.mobiletable WHERE price=?",nativeQuery=true)
public List<MobileEntity> getExcept1(String a);




		
				


}
