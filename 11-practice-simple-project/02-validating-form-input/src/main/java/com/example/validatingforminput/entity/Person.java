package com.example.validatingforminput.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    @NotNull
    @Size(min = 2, max = 30)
    private String name;

    @NotNull
    @Max(100)
    private Integer age;
}
