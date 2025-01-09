package ru.mirea.pkmn.service;


import org.springframework.stereotype.Service;
import ru.mirea.pkmn.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    List<StudentEntity> getStudentsByGroup(String group);

    Optional<StudentEntity> getStudentByFIO(StudentEntity student);

    List<StudentEntity> findAllStudents();

    StudentEntity save(StudentEntity studentEntity);
}
