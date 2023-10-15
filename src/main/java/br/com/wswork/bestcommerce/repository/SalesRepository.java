package br.com.wswork.bestcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wswork.bestcommerce.model.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {

}
