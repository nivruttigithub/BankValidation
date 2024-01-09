package com.Technosignia.BankValidation.DTO;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class CustomerRequest {
    @NotNull(message = "customername shouldn't be null")
    private String name;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String address;
//    @Pattern(regexp = "^\\d{10}$",message = "invalid contact number entered ")
    private Long contact;
    @Email(message = "Invalid email")
    private String email;
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
    
   
    
    
	
	
}
