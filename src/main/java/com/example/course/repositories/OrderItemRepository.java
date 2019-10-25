//Este projeto é baseado no curso do Nelio alves na plataforma Udemy. 

package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
