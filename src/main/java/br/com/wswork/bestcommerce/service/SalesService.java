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

  public Sales createSales(Sales sales) {
    return salesRepository.save(sales);
  }

  public List<Sales> getAllSales() {
    return salesRepository.findAll();
  }

  public Optional<Sales> getSalesById(Long id) {
    return salesRepository.findById(id);
  }

  public Sales updateSales(Long id, Sales updatedSales) {
    Optional<Sales> existingSales = salesRepository.findById(id);

    if (existingSales.isEmpty()) {
      return null;
    }

    Sales salesToUpdate = existingSales.get();

    salesToUpdate.setPrice(updatedSales.getPrice());
    salesToUpdate.setTax(updatedSales.getTax());
    salesToUpdate.setSaleDate(updatedSales.getSaleDate());

    return salesRepository.save(salesToUpdate);
  }

  public void deleteSales(Long id) {
    salesRepository.deleteById(id);
  }
}
