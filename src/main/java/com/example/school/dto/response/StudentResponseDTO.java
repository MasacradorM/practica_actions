
package com.example.school.dto.response;
import lombok.*;

@Data
@AllArgsConstructor
public class StudentResponseDTO {
    private Long id;
    private String name;
    private String email;
}
