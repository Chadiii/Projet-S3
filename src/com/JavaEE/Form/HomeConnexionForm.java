package com.JavaEE.Form;

import javax.servlet.http.HttpServletRequest;

import com.JavaEE.bdd.BDconnect;

public class HomeConnexionForm {

	private String result;
	private boolean resultat;
	
	public boolean isResultat() {
		return resultat;
	}
	
	public void setResultat(boolean resultat) {
		this.resultat = resultat;
	}
	
	public void VerificationIdentifiant(HttpServletRequest request) {
		
		BDconnect a = new BDconnect();
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		if (a.getDataLog("user", email, pass)) {
			result = "Vous êtes connecté";
		}else {
			result = " Email ou Mot de passe incorrects";
		}
	}
	
	public void Verificationconnexion(HttpServletRequest request) {
		
		BDconnect a = new BDconnect();
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		if (a.getDataLog("user", email, pass)) {
			resultat = true;
		}else {
			resultat = false;
		}
	}
	
public String VerificationType(HttpServletRequest request) {
		
		BDconnect a = new BDconnect();
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		String type = a.getType("user", email, pass);
		
		return type;
	}

public String VerificationId(HttpServletRequest request) {
	
	BDconnect a = new BDconnect();
	
	String email = request.getParameter("email");
	String pass = request.getParameter("pass");
	
	String id = a.getId("user", email, pass);
	
	return id;
}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
public boolean VerificationAdmin(HttpServletRequest request) {
		
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		if(email.equals("admin@admin.com")&& pass.equals("admin")) {
			return true;
		}
		
		return false;
	}
	
	
}
