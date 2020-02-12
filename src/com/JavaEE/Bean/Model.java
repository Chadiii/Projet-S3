package com.JavaEE.Bean;

public class Model {
	
	private int id;
	private String Nom;
	private int Prix;
	private String Description;
	private int superficie;
	private String imageName;
	private String typeModel;
	
	public Model() {
		
	}
	
	public Model(int id, String nom, int prix, String description, int superficie, String imageName, String typeModel) {
		super();
		this.id = id;
		Nom = nom;
		Prix = prix;
		Description = description;
		this.superficie = superficie;
		this.imageName = imageName;
		this.typeModel = typeModel;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getTypeModel() {
		return typeModel;
	}
	public void setTypeModel(String typeModel) {
		this.typeModel = typeModel;
	}

	@Override
	public String toString() {
		return "Model [id=" + id + ", Nom=" + Nom + ", Prix=" + Prix + ", Description=" + Description + ", superficie="
				+ superficie + ", imageName=" + imageName + ", typeModel=" + typeModel + "]";
	}
	
	

	
	
	
	
	
}
