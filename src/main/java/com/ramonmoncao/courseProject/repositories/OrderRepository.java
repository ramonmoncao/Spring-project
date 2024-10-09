package com.ramonmoncao.courseProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramonmoncao.courseProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
		

}
