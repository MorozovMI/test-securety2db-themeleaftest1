package ru.morozov.testsecurety2dbthemeleaftest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.morozov.testsecurety2dbthemeleaftest.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
