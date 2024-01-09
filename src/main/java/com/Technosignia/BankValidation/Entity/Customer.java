package com.Technosignia.BankValidation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Customer_TBLs")
@Data
@AllArgsConstructor(staticName="build")
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue
private int id;
private String name;
private int age;
private String address;
private Long contact;
private String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Long getContact() {
	return contact;
}
public void setContact(Long contact) {
	this.contact = contact;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public static Customer build(int id, String name, int age, String address, Long contact, String email)
{
	Customer customer=new Customer();
	customer.setId(id);
	customer.setName(name);
	customer.setAge(age);
	customer.setAddress(address);
	customer.setContact(contact);
	customer.setEmail(email);
	return customer;
}
}
