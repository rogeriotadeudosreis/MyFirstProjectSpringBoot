package com.rogerioreis.myfirstprojectspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.myfirstprojectspringboot.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
