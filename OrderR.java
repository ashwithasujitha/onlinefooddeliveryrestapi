package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entity.OrderEntity;

public interface OrderR extends JpaRepository<OrderEntity, Long> {

    // Custom Query to find Order by ID
    @Query("SELECT o FROM OrderEntity o WHERE o.id = :id")
    OrderEntity findByOrderId(@Param("id") Long id);
    
}

