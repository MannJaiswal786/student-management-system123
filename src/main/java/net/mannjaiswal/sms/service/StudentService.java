package net.mannjaiswal.sms.service;

import java.util.List;

import net.mannjaiswal.sms.entity.Student;

public interface StudentService {
List<Student> getAllStudents();

Student saveStudent(Student student);

Student getStudentById(Long id);

Student updateStudent(Student student);

void deleteStudentById(Long id);
}
