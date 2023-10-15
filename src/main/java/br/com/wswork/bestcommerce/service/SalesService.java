package br.com.wswork.bestcommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.wswork.bestcommerce.model.Sales;
import br.com.wswork.bestcommerce.repository.SalesRepository;

@Service
public class SalesService {
  private final SalesRepository salesRepository;

  public SalesService(SalesRepository salesRepository) {
    this.salesRepository = salesRepository;
  }

  public List<Sales> getAllSales() {
    return salesRepository.findAll();
  }

  public Optional<Sales> getSalesById(Long id) {
    return salesRepository.findById(id);
  }

  public Sales createSales(Sales sales) {
    return salesRepository.save(sales);
  }

  public void deleteSales(Long id) {
    salesRepository.deleteById(id);
  }
}
