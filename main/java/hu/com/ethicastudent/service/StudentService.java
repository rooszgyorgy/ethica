package hu.com.ethicastudent.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.com.ethicastudent.entity.Student;
import hu.com.ethicastudent.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository repository;

    @Autowired
    public void setStudentRepo( StudentRepository studentRepo ) {
    	this.repository = studentRepo;
    }
    public List<Student> findAll() {

        return (List<Student>) repository.findAll();
    }
    
    public void saveStudent( String fname , String lname , double age  ) {
    	Student student = new Student( fname , lname, age);
    	repository.save( student );
    	
    }
}