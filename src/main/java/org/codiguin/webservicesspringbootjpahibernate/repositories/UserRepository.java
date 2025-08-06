package org.codiguin.webservicesspringbootjpahibernate.repositories;

import org.codiguin.webservicesspringbootjpahibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
}
