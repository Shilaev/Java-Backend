package ru.shilaev.springrestapi.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {
    @NotEmpty(message = "Name should not be empty")
    @Size(max = 180, message = "name should be less then 180 chars")
    String name;

    @NotNull(message = "Age should not be empty")
    @Min(value = 0, message = "Age should be bigger then 0")
    @Max(value = 150, message = "age should be less then 150")
    int age;
}
