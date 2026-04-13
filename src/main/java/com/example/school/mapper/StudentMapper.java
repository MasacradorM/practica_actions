
package com.example.school.mapper;

import com.example.school.entity.Student;
import com.example.school.dto.request.StudentRequestDTO;
import com.example.school.dto.response.StudentResponseDTO;

public class StudentMapper {
    public static Student toEntity(StudentRequestDTO dto){
        return new Student(null, dto.getName(), dto.getEmail());
    }

    public static StudentResponseDTO toDTO(Student entity){
        return new StudentResponseDTO(entity.getId(), entity.getName(), entity.getEmail());
    }
}
