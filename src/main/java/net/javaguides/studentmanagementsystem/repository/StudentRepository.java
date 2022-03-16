package net.javaguides.studentmanagementsystem.repository;

import net.javaguides.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
