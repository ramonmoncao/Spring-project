package com.ramonmoncao.courseProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramonmoncao.courseProject.entities.Order;
import com.ramonmoncao.courseProject.repositories.OrderRepository;


@Service //Service component to autowire
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	public Order findById(Long id) {
		Optional<Order> obj =  repository.findById(id);
		return obj.get();
	}
}
