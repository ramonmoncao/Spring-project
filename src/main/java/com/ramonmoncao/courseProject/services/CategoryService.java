package com.ramonmoncao.courseProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramonmoncao.courseProject.entities.Category;
import com.ramonmoncao.courseProject.repositories.CategoryRepository;


@Service //Service component to autowire
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	public Category findById(Long id) {
		Optional<Category> obj =  repository.findById(id);
		return obj.get();
	}
}
