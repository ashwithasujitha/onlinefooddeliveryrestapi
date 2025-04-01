package com.example.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.Entity.OrderItem;

public interface  OrderItemRepository extends JpaRepository<OrderItem,Long> {
   @Query("SELECT o FROM OrderEntity o WHERE o.id = :id")
    OrderItem findByOrderId(@Param("id") Long id);
}
