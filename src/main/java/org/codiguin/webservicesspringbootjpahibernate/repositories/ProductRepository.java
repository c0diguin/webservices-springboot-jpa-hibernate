package org.codiguin.webservicesspringbootjpahibernate.repositories;

import org.codiguin.webservicesspringbootjpahibernate.entities.Category;
import org.codiguin.webservicesspringbootjpahibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>
{
}
