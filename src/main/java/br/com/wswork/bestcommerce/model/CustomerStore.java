package br.com.wswork.bestcommerce.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CustomerStore {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  private Customer customer;

  @ManyToOne
  private Store store;

  private Date changeDate;

  public CustomerStore() {

  }

  public CustomerStore(Customer customer, Store store, Date changeDate) {
    this.customer = customer;
    this.store = store;
    this.changeDate = changeDate;
  }

  public Long getId() {
    return this.id;
  }

  public Customer getCustomer() {
    return this.customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Store getStore() {
    return this.store;
  }

  public void setStore(Store store) {
    this.store = store;
  }

  public Date getChangeDate() {
    return this.changeDate;
  }

  public void setChangeDate(Date changeDate) {
    this.changeDate = changeDate;
  }

}
