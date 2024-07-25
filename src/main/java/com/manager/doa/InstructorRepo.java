package com.manager.doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.manager.entities.Instructor;

public interface InstructorRepo extends JpaRepository<Instructor, Integer> {

	@Query("select u from Instructor u where u.email =:email")
	public Instructor getInstructorByUserName(@Param("email") String email);
	
	//searching a name and student
		public List<Instructor> findByNameContaingAndInstructor (String name, Instructor ins);
}
