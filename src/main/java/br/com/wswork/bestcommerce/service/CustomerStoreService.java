package br.com.wswork.bestcommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.wswork.bestcommerce.model.CustomerStore;
import br.com.wswork.bestcommerce.repository.CustomerStoreRepository;

@Service
public class CustomerStoreService {

  private final CustomerStoreRepository customerStoreRepository;

  public CustomerStoreService(CustomerStoreRepository customerStoreRepository) {
    this.customerStoreRepository = customerStoreRepository;
  }

  public List<CustomerStore> getAllCustomerStores() {
    return customerStoreRepository.findAll();
  }

  public CustomerStore createCustomerStore(CustomerStore customerStore) {
    return customerStoreRepository.save(customerStore);
  }
}
