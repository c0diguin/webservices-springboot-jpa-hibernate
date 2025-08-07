package org.codiguin.webservicesspringbootjpahibernate.repositories;

import org.codiguin.webservicesspringbootjpahibernate.entities.Category;
import org.codiguin.webservicesspringbootjpahibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>
{
}
