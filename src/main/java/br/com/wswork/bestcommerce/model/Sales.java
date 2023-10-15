package br.com.wswork.bestcommerce.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Sales {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private int price;
  private Long tax;
  private Date saleDate;

  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;

  public Sales() {

  }

  public Sales(int price, long tax, Date saleDate, Customer customer) {
    this.price = price;
    this.tax = tax;
    this.saleDate = saleDate;
    this.customer = customer;
  }

  public Customer getCustomer() {
    return this.customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Long getId() {
    return id;
  }

  public int getPrice() {
    return price;
  }

  public Date getSaleDate() {
    return saleDate;
  }

  public Long getTax() {
    return tax;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setSaleDate(Date saleDate) {
    this.saleDate = saleDate;
  }

  public void setTax(Long tax) {
    this.tax = tax;
  }

}
