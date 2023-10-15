package br.com.wswork.bestcommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private int age;

  @ManyToOne
  @JoinColumn(name = "customer_type")
  private CustomerType customerType;

  public Customer() {
  }

  public Customer(String name, int age, CustomerType customerType) {
    this.name = name;
    this.age = age;
    this.customerType = customerType;
  }

  public CustomerType getCustomerType() {
    return this.customerType;
  }

  public void setCustomerType(CustomerType customerType) {
    this.customerType = customerType;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
