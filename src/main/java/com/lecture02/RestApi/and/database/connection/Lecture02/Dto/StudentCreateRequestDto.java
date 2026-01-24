package com.lecture02.RestApi.and.database.connection.Lecture02.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Data
public class StudentCreateRequestDto {
    @NotBlank(message = "name is necessary")
    @Size(min = 3, max = 30, message = "size must be between 3 to 30")
    private String name;
    @NotBlank(message = "email is necessary")
    @Email(message = "enter a valid email ie:xyz@gmail.com")
    private String email;
}
