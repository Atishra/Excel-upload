package com.example.excelapi.repo;

import com.example.excelapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {



}

