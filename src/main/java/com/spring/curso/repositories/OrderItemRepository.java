package com.spring.curso.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.curso.entities.OrderItem;
import com.spring.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
    
}
