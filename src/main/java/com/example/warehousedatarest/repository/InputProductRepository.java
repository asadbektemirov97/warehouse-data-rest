package com.example.warehousedatarest.repository;

import com.example.warehousedatarest.entity.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "inputProduct")
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {

    List<InputProduct> findAllByInput_Id(Integer id);
}
