package com.olizen.accounts.repository;

import com.olizen.accounts.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByMobileNumber(String mobileNumber);

    @Transactional  // any query executed inside a TRANSACTION will be rolled back whenever a runtime error happens
    @Modifying
    void deleteByCustomerId(Long customerId);
}
