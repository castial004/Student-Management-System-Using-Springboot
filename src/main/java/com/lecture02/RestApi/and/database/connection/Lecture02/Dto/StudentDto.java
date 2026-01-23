package com.lecture02.RestApi.and.database.connection.Lecture02.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    private int id;
    private String name;
    private String email;
}
