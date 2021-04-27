package com.rogerioreis.myfirstprojectspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rogerioreis.myfirstprojectspringboot.entities.Product;
import com.rogerioreis.myfirstprojectspringboot.repository.ProductRepository;
import com.rogerioreis.myfirstprojectspringboot.service.exceptions.EntityNotFoundException;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public Product findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Id not found: " + id));

	}
}