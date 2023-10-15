package br.com.wswork.bestcommerce.service;

import org.springframework.stereotype.Service;

import br.com.wswork.bestcommerce.model.User;
import br.com.wswork.bestcommerce.repository.UserRepository;

@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public User getUserById(Long userId) {
    return userRepository.findById(userId).orElse(null);
  }

  public void deleteUser(Long userId) {
    userRepository.deleteById(userId);
  }
}
