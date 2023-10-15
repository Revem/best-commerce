package br.com.wswork.bestcommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wswork.bestcommerce.model.Users;
import br.com.wswork.bestcommerce.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public List<Users> getAllUsers() {
    return userService.getAllUsers();
  }

  @GetMapping("/{id}")
  public Optional<Users> getUserById(@PathVariable Long id) {
    return userService.getUserById(id);
  }

  @PostMapping
  public Users createUser(@RequestBody Users user) {
    return userService.createUser(user);
  }

  @PutMapping("/{id}")
  public Users updateUser(@PathVariable Long id, @RequestBody Users updatedUser) {
    return userService.updateUser(id, updatedUser);
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable Long id) {
    userService.deleteUser(id);
  }
}
