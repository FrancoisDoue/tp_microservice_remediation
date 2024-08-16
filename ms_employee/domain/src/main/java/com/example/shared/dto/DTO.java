package com.example.shared.dto;

public interface DTO<T, ENTITY> {
    ENTITY toEntity();

    T fromEntity(ENTITY entity);
}
