package com.example.demo.repository;

import com.shailesh.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
