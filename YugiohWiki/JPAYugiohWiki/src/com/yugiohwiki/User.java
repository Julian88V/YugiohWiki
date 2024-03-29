package com.yugiohwiki;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="image_url")
	private String imageUrl;
	
	// END FIELD
	
	public User() {}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", imageUrl=" + imageUrl + "]";
	}

	
	// START GETs & SETs

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	// END GETs & SETs

	// CONSTRUCTORS
	public User(int id, String username, String password, String imageUrl) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.imageUrl = imageUrl;
	}
	
	
	
	

}
