package br.com.wswork.bestcommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.wswork.bestcommerce.model.CustomerType;
import br.com.wswork.bestcommerce.repository.CustomerTypeRepository;

@Service
public class CustomerTypeService {

  private final CustomerTypeRepository customerTypeRepository;

  public CustomerTypeService(CustomerTypeRepository customerTypeRepository) {
    this.customerTypeRepository = customerTypeRepository;
  }

  public List<CustomerType> getAllCustomerTypes() {
    return customerTypeRepository.findAll();
  }

  public Optional<CustomerType> getCustomerTypeById(Long id) {
    return customerTypeRepository.findById(id);
  }

  public CustomerType createCustomerType(CustomerType customerType) {
    return customerTypeRepository.save(customerType);
  }

  public CustomerType updateCustomerType(Long id, CustomerType customerType) {
    if (customerTypeRepository.existsById(id)) {
      customerType.setId(id);
      return customerTypeRepository.save(customerType);
    }
    return null;
  }

  public void deleteCustomerType(Long id) {
    customerTypeRepository.deleteById(id);
  }
}
