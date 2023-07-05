package com.example.springlevel4.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class PostRequestDto {
    @NotBlank
    private String title;
    @NotNull
    private String content;
}

