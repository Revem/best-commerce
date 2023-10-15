package br.com.wswork.bestcommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.wswork.bestcommerce.model.Users;
import br.com.wswork.bestcommerce.repository.UserRepository;

@Service
public class UserService {
  private final UserRepository userRepository;
  private final BCryptPasswordEncoder passwordEncoder;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
    this.passwordEncoder = new BCryptPasswordEncoder();
  }

  public List<Users> getAllUsers() {
    return userRepository.findAll();
  }

  public Optional<Users> getUserById(Long userId) {
    return userRepository.findById(userId);
  }

  public Users createUser(Users user) {
    String encodedPassword = passwordEncoder.encode(user.getPassword());
    user.setPassword(encodedPassword);
    return userRepository.save(user);
  }

  public Users updateUser(Long id, Users updatedUser) {
    Optional<Users> existingUser = userRepository.findById(id);
    if (existingUser.isPresent()) {
      Users user = existingUser.get();
      user.setUsername(updatedUser.getUsername());
      user.setPassword(updatedUser.getPassword());

      return userRepository.save(user);
    }
    return null;
  }

  public void deleteUser(Long userId) {
    userRepository.deleteById(userId);
  }
}
