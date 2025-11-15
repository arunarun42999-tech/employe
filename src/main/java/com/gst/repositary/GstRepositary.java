package com.gst.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gst.entity.GstEntity;
@Repository
public interface GstRepositary extends JpaRepository<GstEntity,Integer>{


@Query(value="SELECT taxprcentage FROM gstdb.gsttable1 WHERE hsncode=?",nativeQuery=true)
public Integer get5( Integer a);
}