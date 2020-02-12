package com.JavaEE.Bean;

public class Bien {
	
	private int id;
	private String localisation;
	private String Nom;
	private int Prix;
	private String Description;
	private int superficie;
	private String imageName;
	private String typeBien;
	private String statut;
	private String date;
	
	public Bien(int id, String localisation, String nom, int prix, String description, int superficie) {
		super();
		this.id = id;
		this.localisation = localisation;
		Nom = nom;
		Prix = prix;
		Description = description;
		this.superficie = superficie;
	}
	
	public Bien(int id, String localisation, String nom, int prix, String description, int superficie, String imageName) {
		super();
		this.id = id;
		this.localisation = localisation;
		Nom = nom;
		Prix = prix;
		Description = description;
		this.superficie = superficie;
		this.imageName = imageName;
	}
	
	public Bien(int id, String localisation, String nom, int prix, String description, int superficie, String imageName, String typeBien) {
		super();
		this.id = id;
		this.localisation = localisation;
		Nom = nom;
		Prix = prix;
		Description = description;
		this.superficie = superficie;
		this.imageName = imageName;
		this.typeBien = typeBien;
	}
	
	public Bien(int id, String localisation, String nom, int prix, String description, int superficie, String imageName, String typeBien, String statut) {
		super();
		this.id = id;
		this.localisation = localisation;
		Nom = nom;
		Prix = prix;
		Description = description;
		this.superficie = superficie;
		this.imageName = imageName;
		this.typeBien = typeBien;
		this.statut = statut;
	}
	
	public Bien(int id, String localisation, String nom, int prix, String description, int superficie, String imageName, String typeBien, String statut, String date) {
		super();
		this.id = id;
		this.localisation = localisation;
		Nom = nom;
		Prix = prix;
		Description = description;
		this.superficie = superficie;
		this.imageName = imageName;
		this.typeBien = typeBien;
		this.statut = statut;
		this.date = date;
	}
	
	public int getSuperficie() {
		return superficie;
	}


	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}


	public Bien() {
		
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getPrix() {
		return Prix;
	}
	public void setPrix(int prix) {
		Prix = prix;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getTypeBien() {
		return typeBien;
	}

	public void setTypeBien(String typeBien) {
		this.typeBien = typeBien;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	
	
	
	
}
