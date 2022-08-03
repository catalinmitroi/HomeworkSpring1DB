package com.dbhomework.HomeworkSpring.repository;

import com.dbhomework.HomeworkSpring.model.Products;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductsRepository extends CrudRepository<Products, Integer> {
        public void delete(Products product);
        public Optional<Products> findById(Integer id);
}
