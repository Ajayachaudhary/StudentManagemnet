package com.manager.doa;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.manager.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	//for the pagination
	@Query("from Student as s where s.id =: id")
	public Page<Student> findStudentByINstructor(@Param("id") int instructorId, Pageable ppageble);
	
	
}
