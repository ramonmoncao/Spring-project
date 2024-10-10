package com.ramonmoncao.courseProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramonmoncao.courseProject.entities.OrderItem;
import com.ramonmoncao.courseProject.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
		

}
