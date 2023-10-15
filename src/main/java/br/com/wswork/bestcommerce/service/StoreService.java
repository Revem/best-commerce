package br.com.wswork.bestcommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.wswork.bestcommerce.model.Store;
import br.com.wswork.bestcommerce.repository.StoreRepository;

@Service
public class StoreService {
  private final StoreRepository storeRepository;

  public StoreService(StoreRepository storeRepository) {
    this.storeRepository = storeRepository;
  }

  public List<Store> getAllStores() {
    return storeRepository.findAll();
  }

  public Optional<Store> getStoreById(Long id) {
    return storeRepository.findById(id);
  }

  public Store createStore(Store store) {
    return storeRepository.save(store);
  }

  public void deleteStore(Long id) {
    storeRepository.deleteById(id);
  }
}
