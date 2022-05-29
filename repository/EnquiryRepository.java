package com.evehiclemanagementsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evehiclemanagementsystem.entity.Enquiry;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry,Integer> { 
	
   

}