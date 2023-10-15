package br.com.wswork.bestcommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wswork.bestcommerce.model.Sales;
import br.com.wswork.bestcommerce.service.SalesService;

@RestController
@RequestMapping("/sales")
public class SalesController {

  private final SalesService salesService;

  public SalesController(SalesService salesService) {
    this.salesService = salesService;
  }

  @PostMapping("/create")
  public Sales createSale(@RequestBody Sales sales) {
    return salesService.createSales(sales);
  }

  @GetMapping("/all")
  public List<Sales> getAllSales() {
    return salesService.getAllSales();
  }

  @GetMapping("/{id}")
  public Sales getSaleById(@PathVariable Long id) {
    return salesService.getSalesById(id).orElse(null);
  }

  @PutMapping("/update/{id}")
  public Sales updateSale(@PathVariable Long id, @RequestBody Sales sales) {
    return salesService.updateSales(id, sales);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteSale(@PathVariable Long id) {
    salesService.deleteSales(id);
  }
}
