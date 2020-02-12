package com.JavaEE.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.JavaEE.Bean.Bien;
import com.JavaEE.Bean.Model;


public class BDconnect {

	
		public Connection con;
		public Statement st,st1,st2;
		public ResultSet rs;

		public BDconnect() {
			
			try {
				
				String jdbcUrl = "jdbc:mysql://localhost:3306/javaee?useSSL=false&serverTimezone=UTC";
				String user="root";
				String pass="lol123456love";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection(jdbcUrl, user, pass);
				
				st = con.createStatement();
				st1 = con.createStatement();
				st2 = con.createStatement();
				
			}catch(Exception ex) {
				System.out.println("Error" + ex);
			}
		}
		
		//version 2
		public List<Bien> getDataBien(String table) {
			BDconnect a = new BDconnect();
			List<Bien> listBien = new ArrayList<Bien>();
			Bien bien= new Bien();
			
			try {
				
				String query = "select * from "+ table +"";
				rs = st.executeQuery(query);
				while(rs.next()) {
					
					int id = rs.getInt("code_imm");
					String localisation = rs.getString("address_imm");
					String nom = rs.getString("nom_imm");
					String description = rs.getString("description");
					int prix = rs.getInt("prix");
					int superficie = rs.getInt("superficie");
					String imageName = a.getPath("image_immob", id);
					String statut = rs.getString("statut");
					String typeBien = rs.getString("type_imm");
					String date = rs.getString("date");
					
					 bien= new Bien(id, localisation, nom, prix, description, superficie, imageName, typeBien, statut, date);
					 
					 listBien.add(bien);
					
					
					
				}
				
			}catch(Exception ex) {
				
				System.out.println(ex);
				
			}
			
			return listBien;
		}
		
		
		public List<Model> getDataModel(String table) {
			
			List<Model> listModel = new ArrayList<Model>();
			Model model= new Model();
			
			try {
				
				String query = "select * from "+ table +"";
				rs = st.executeQuery(query);
				while(rs.next()) {
					
					int id = rs.getInt("id_model");
					String nom = rs.getString("nom");
					String description = rs.getString("description");
					int prix = rs.getInt("prix");
					int superficie = rs.getInt("superficie");
					String imageName = rs.getString("nom_image");
					
					String typeModel = rs.getString("type");
					
					 model= new Model(id, nom, prix, description, superficie, imageName, typeModel);
					 
					 listModel.add(model);
					
					
					
				}
				
			}catch(Exception ex) {
				
				System.out.println(ex);
				
			}
			
			return listModel;
		}
		
		
		public List<Bien> getDataBienSearchBar(String table, String searchBar) {
			BDconnect a = new BDconnect();
			List<Bien> listBien = new ArrayList<Bien>();
			Bien bien= new Bien();
			
			try {
				
				String query = "select * from "+ table +"";
				rs = st.executeQuery(query);
				while(rs.next()) {
					
					int id = rs.getInt("code_imm");
					String localisation = rs.getString("address_imm");
					String nom = rs.getString("nom_imm");
					String description = rs.getString("description");
					int prix = rs.getInt("prix");
					int superficie = rs.getInt("superficie");
					String imageName = a.getPath("image_immob", id);
					String statut = rs.getString("statut");
					String typeBien = rs.getString("type_imm");
					String date = rs.getString("date");
					if(searchBar.equals(nom) || searchBar.equals(description) || searchBar.equals(Integer.toString(prix)) 
							|| searchBar.equals(Integer.toString(superficie)) || searchBar.equals(typeBien) ||
							searchBar.equals(localisation) || searchBar.equals(statut) ) {
						
						bien= new Bien(id, localisation, nom, prix, description, superficie, imageName, typeBien, statut, date);
						 
						 listBien.add(bien);
					}
				}
				
			}catch(Exception ex) {
				
				System.out.println(ex);
				
			}
			
			return listBien;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public void getData(String table) {
			
			try {
				
				String query = "select * from "+ table +"";
				rs = st.executeQuery(query);
				while(rs.next()) {
					
					String nom = rs.getString("nom");
					String prenom = rs.getString("prenom");
					int nbrDeLivre = rs.getInt("nbrLivre");
					System.out.println("son nom est : " + nom + " et son pr�nom est : " + prenom +" il  a emprunt� : " + nbrDeLivre + " Livres. ");
					
					
				}
				
			}catch(Exception ex) {
				
				System.out.println(ex);
				
			}
		}
		
		// Version 2
		public boolean addData(String table, String nom, String prenom, String email, String password, String confpass, String typeUser) {
			
			if(password.equals(confpass)&& !typeUser.equals("Choisissez votre Option")) {
			
				try {
				st1.executeUpdate("INSERT INTO "+ table +" (nom, prenom, email, password, type )" + "VALUES ('"+ nom +"', '"+ prenom +"', '"+ email +"','"+ password +"', '"+ typeUser +"' ) ");
				return true;
			}catch(Exception e) {
				System.out.println(e);
			}
			
			}
			return false;
		}
		
		
public boolean addData(String table, String nom, String prenom, String email, String password, String confpass, String typeUser, String gsm) {
			
			if(password.equals(confpass)&& !typeUser.equals("Choisissez votre Option")) {
			
				try {
				st1.executeUpdate("INSERT INTO "+ table +" (nom, prenom, email, password, type, gsm )" + "VALUES ('"+ nom +"', '"+ prenom +"', '"+ email +"','"+ password +"', '"+ typeUser +"', '"+ gsm +"' ) ");
				return true;
			}catch(Exception e) {
				System.out.println(e);
			}
			
			}
			return false;
		}
		
		public boolean addDataReserv(String table, int code_immo, int code_user) {
			
				try {
				st1.executeUpdate("INSERT INTO "+ table +" ( code_imm, id_user)" + "VALUES ('"+ code_immo +"', '"+ code_user +"') ");
				return true;
			}catch(Exception e) {
				System.out.println(e);
			}
			
			return false;
		}
		
		public boolean addDataReservModel(String table, int code_model, int code_user) {
			
			try {
			st1.executeUpdate("INSERT INTO "+ table +" ( code_model, id_user)" + "VALUES ('"+ code_model +"', '"+ code_user +"') ");
			return true;
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return false;
	}
		
		

		public void deleteAllTableData(String table) {
			
			try {
				
				st2.executeUpdate("DELETE FROM "+table+" ");
				
			}catch(Exception e) {
				
				System.out.println(e);
			}
		}

		public boolean getDataLog(String table, String email, String password) {
			
				
				String query = "select * from "+ table +" where email = '"+ email +"' and password = '" + password+"'";
				try {
					rs = st.executeQuery(query);
					while(rs.next()) {
						if(email.equals(rs.getString("email")) && password.equals(rs.getString("password"))) return true ;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return false;
				
		}
		
		
		public String getNom(String table, String email, String password) {
			
			String Query = "select * from "+ table +" where email = '"+ email +"' and password = '" + password+"'";
			try {
				rs = st.executeQuery(Query);
				while(rs.next()) {
					if(email.equals(rs.getString("email")) && password.equals(rs.getString("password")) ) {
						String nom = new String();
							nom = rs.getString("nom");
							return nom;
					}
				}
			}catch(SQLException e) {
				
				e.printStackTrace();
			}
			return null;
			
			
		}
		
		public String getType(String table, String email, String password) {
			
			String Query = "select * from "+ table +" where email = '"+ email +"' and password = '" + password+"'";
			try {
				rs = st.executeQuery(Query);
				while(rs.next()) {
					if(email.equals(rs.getString("email")) && password.equals(rs.getString("password")) ) {
						String type = new String();
							type = rs.getString("type");
							return type;
					}
				}
			}catch(SQLException e) {
				
				e.printStackTrace();
			}
			return null;
			
			
		}
		
public String getId(String table, String email, String password) {
			
			String Query = "select * from "+ table +" where email = '"+ email +"' and password = '" + password+"'";
			try {
				rs = st.executeQuery(Query);
				while(rs.next()) {
					if(email.equals(rs.getString("email")) && password.equals(rs.getString("password")) ) {
						String id = new String();
							id = rs.getString("id");
							return id;
					}
				}
			}catch(SQLException e) {
				
				e.printStackTrace();
			}
			return null;
			
			
		}
		
		
		public String getPrenom(String table, String email, String password) {
			
			String Query = "select * from "+ table +" where email = '"+ email +"' and mdp = '" + password+"'";
			try {
				rs = st.executeQuery(Query);
				while(rs.next()) {
					if(email.equals(rs.getString("email")) && password.equals(rs.getString("mdp")) ) {
						String prenom = new String();
							prenom = rs.getString("prenom");
							return prenom;
					}
				}
			}catch(SQLException e) {
				
				e.printStackTrace();
			}
			return null;

			
			}
		
	public String getTable(String table, String email, String password) {
		
		return table;			
	}

	public String getEmail(String table, String email, String password) {
		
		return email;
	}

	public void ModifyMdp(String table, String email, String pass) {
		
		try {
			st2.executeUpdate("UPDATE "+ table +" SET mdp = '"+ pass +"' Where email = '"+ email +"'") ;
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void setEmprunteur(String emprunteur, String ISBN ) {
		String Query = "UPDATE document SET emprunteur = '"+ emprunteur +"' Where ISBN = '"+ ISBN +"'";
		
		try {
			st2.executeUpdate(Query) ;
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void getDataDocument() {
			
			try {
				
				String query = "select * from document";
				rs = st.executeQuery(query);
				while(rs.next()) {
					
					String ISBN = rs.getString("ISBN");
					String titre = rs.getString("prenom");
					String editeur = rs.getString("editeur");

					
					
				}
				
			}catch(Exception ex) {
				
				System.out.println(ex);
				
			}
		
	}	

	public void deleteDocument(String ISBN) {
		
		try {
			
			st2.executeUpdate("DELETE FROM document where ISBN = " + ISBN+ "");
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
	}

	public boolean getDataDoc( String ISBN) {
		
		
		String query = "select * from document where ISBN = '"+ISBN+"'";
		try {
			rs = st.executeQuery(query);
			while(rs.next()) {
				if(ISBN.equals(rs.getString("ISBN"))) 
					return true ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	public void retakeBook(String ISBN) {
		String query = "UPDATE document SET emprunteur = NULL WHERE ISBN = '"+ ISBN +"'";
	try {
			
			st2.executeUpdate(query);
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}
	public String getEmailDoc(String ISBN) {
		
		String query = "select emprunteur from document WHERE ISBN = '"+ ISBN +"'";
		try {
			rs = st2.executeQuery(query);
			while(rs.next()) {
				String a = rs.getString("emprunteur");
					
				return a;
			}
				
			}catch(Exception e) {
				
				System.out.println(e);
			}
		return null;

	}

	public int countType( String nom) {
		String query = "Select count( emprunteur ) as L from document where emprunteur = '"+ nom +"'";
		try {
			rs = st2.executeQuery(query);
			while(rs.next()) {
				return rs.getInt("L");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	
	public String getPath(String table, int code_imm) {
		
		String Query = "select * from "+ table +" where code_imm = '"+ code_imm +"'";
		try {
			rs = st.executeQuery(Query);
			while(rs.next()) {
				if(code_imm == rs.getInt("code_imm")) {
					String path = new String();
						path = rs.getString("filename");
						return path;
				}
			}
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
		
	}

	}
	
