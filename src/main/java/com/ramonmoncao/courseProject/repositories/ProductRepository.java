package com.ramonmoncao.courseProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramonmoncao.courseProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
		

}
