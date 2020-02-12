package Bean;



public class Immobilier  {
	
	

	private int code_imm;
	
	private String nom_imm;
		
	private String type_imm;
		
	private double prix;
		
	private int superficie;
		
	private String address_imm;
		
	private String description;
	
	private String statut;
	
	private String date;
	

	public Immobilier() {
		
	}
	


	public Immobilier(String nom_imm, String type_imm, double prix, int superficie, String address_imm,
			String description, String statut) {
		super();
		this.nom_imm = nom_imm;
		this.type_imm = type_imm;
		this.prix = prix;
		this.superficie = superficie;
		this.address_imm = address_imm;
		this.description = description;
		this.statut = statut;
	}



	public Immobilier(int code_imm, String nom_imm, String type_imm, double prix, int superficie, String address_imm,
			String description, String statut) {
		this.code_imm = code_imm;
		this.nom_imm = nom_imm;
		this.type_imm = type_imm;
		this.prix = prix;
		this.superficie = superficie;
		this.address_imm = address_imm;
		this.description = description;
		this.statut = statut;
	}


	public int getCode_imm() {
		return code_imm;
	}


	public void setCode_imm(int code_imm) {
		this.code_imm = code_imm;
	}


	public String getNom_imm() {
		return nom_imm;
	}


	public void setNom_imm(String nom_imm) {
		this.nom_imm = nom_imm;
	}


	public String getType_imm() {
		return type_imm;
	}


	public void setType_imm(String type_imm) {
		this.type_imm = type_imm;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public int getSuperficie() {
		return superficie;
	}


	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}


	public String getAddress_imm() {
		return address_imm;
	}


	public void setAddress_imm(String address_imm) {
		this.address_imm = address_imm;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
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
	