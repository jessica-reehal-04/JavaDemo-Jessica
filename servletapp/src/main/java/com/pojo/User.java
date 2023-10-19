package com.pojo;

public class User 
{
	private String username;
	private String email;
	private String city;
	private String password;
	public User(String username, String email, String city, String password) {
		super();
		this.username = username;
		this.email = email;
		this.city = city;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", city=" + city + ", password=" + password + "]";
	}
	
	

}
