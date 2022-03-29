package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input")
public interface InputRepository extends JpaRepository<Input, Integer> {
}
