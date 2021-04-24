package com.rogerioreis.myfirstprojectspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.myfirstprojectspringboot.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
