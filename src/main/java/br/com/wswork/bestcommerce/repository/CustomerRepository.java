package br.com.wswork.bestcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wswork.bestcommerce.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
