package com.mkpits.studenteschool.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentDto {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
}
