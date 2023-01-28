package com.xhemafaton.orderservice.repository;

import com.xhemafaton.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
