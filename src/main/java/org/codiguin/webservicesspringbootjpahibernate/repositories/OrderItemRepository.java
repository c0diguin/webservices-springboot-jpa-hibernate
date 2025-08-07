package org.codiguin.webservicesspringbootjpahibernate.repositories;

import org.codiguin.webservicesspringbootjpahibernate.entities.Category;
import org.codiguin.webservicesspringbootjpahibernate.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>
{
}
