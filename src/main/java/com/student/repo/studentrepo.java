package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.beans.student.StudentVo;
@Repository
public interface studentrepo extends JpaRepository<StudentVo, Long> {

}
