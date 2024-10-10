package com.ramonmoncao.courseProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramonmoncao.courseProject.entities.Product;
import com.ramonmoncao.courseProject.repositories.ProductRepository;


@Service //Service component to autowire
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	public Product findById(Long id) {
		Optional<Product> obj =  repository.findById(id);
		return obj.get();
	}
}
