
package com.example.school.controller;

import com.example.school.dto.request.StudentRequestDTO;
import com.example.school.dto.response.StudentResponseDTO;
import com.example.school.mapper.StudentMapper;
import com.example.school.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping
    public StudentResponseDTO create(@RequestBody StudentRequestDTO dto){
        return StudentMapper.toDTO(service.save(StudentMapper.toEntity(dto)));
    }

    @GetMapping
    public List<StudentResponseDTO> getAll(){
        return service.findAll().stream()
                .map(StudentMapper::toDTO)
                .collect(Collectors.toList());
    }
}
