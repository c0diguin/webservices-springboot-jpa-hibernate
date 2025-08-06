package org.codiguin.webservicesspringbootjpahibernate.repositories;

import org.codiguin.webservicesspringbootjpahibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>
{
}
