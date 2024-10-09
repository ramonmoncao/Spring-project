package com.ramonmoncao.courseProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramonmoncao.courseProject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
		

}
