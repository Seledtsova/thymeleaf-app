package com.thymeleaf.thymeleafapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thymeleaf.thymeleafapp.model.Student;

import antlr.collections.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

	
	
}
