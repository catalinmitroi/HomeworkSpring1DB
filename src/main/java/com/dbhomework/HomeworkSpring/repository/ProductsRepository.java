package com.dbhomework.HomeworkSpring.repository;

import com.dbhomework.HomeworkSpring.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Integer> {
        public void delete(Products product);
}
