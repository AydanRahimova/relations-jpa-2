package org.example.relationsjpa2.dao.repository;

import org.example.relationsjpa2.dao.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
