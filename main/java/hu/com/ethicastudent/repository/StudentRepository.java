package hu.com.ethicastudent.repository;

import org.springframework.data.repository.CrudRepository;

import hu.com.ethicastudent.entity.Student;

public interface StudentRepository extends CrudRepository< Student, Integer>{
	
	

}
