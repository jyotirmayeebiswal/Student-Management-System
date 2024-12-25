package net.javaguides.sms.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.sms.entity.Student;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByRegdNo(String regdNo);

    // Fetch students ordered by fullName
    @Query("SELECT s FROM Student s ORDER BY s.fullName ASC")
    List<Student> findAllOrderedByFullName();
}
