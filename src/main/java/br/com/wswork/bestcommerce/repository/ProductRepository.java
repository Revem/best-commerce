package br.com.wswork.bestcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wswork.bestcommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
