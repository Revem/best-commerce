package br.com.wswork.bestcommerce.service;

import java.util.List;
import java.util.Optional;

import br.com.wswork.bestcommerce.model.Customer;
import br.com.wswork.bestcommerce.repository.CustomerRepository;

public class CustomerService {
  private final CustomerRepository customerRepository;

  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }

  public Optional<Customer> getCustomerById(Long id) {
    return customerRepository.findById(id);
  }

  public Customer createCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  public void deleteCustomer(Long id) {
    customerRepository.deleteById(id);
  }
}
