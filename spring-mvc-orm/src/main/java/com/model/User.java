package com.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User 
{
	@Id
	@GeneratedValue
	private int uid;
	private String username;
	private String password;
	private String email;
	private String city;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

}
