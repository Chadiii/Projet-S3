package com.JavaEE.Bean;

public class User {
	
	private int Id;

	private String Nom;
		
	private String Prenom;
		
	private String Email;
		
	private String Type;
		
	private String gsm;
		
	private String Address;
		
	private String username;
		
	private String password;

	
	
	
	public User(int id, String nom, String prenom, String email, String type) {
		super();
		Id = id;
		Nom = nom;
		Prenom = prenom;
		Email = email;
		Type = type;
	}

	
	public User() {
		
	}
	
	
	
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getGsm() {
		return gsm;
	}


	public void setGsm(String gsm) {
		this.gsm = gsm;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
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

	
		
}
