package com.JavaEE.Form;

import javax.servlet.http.HttpServletRequest;

import com.JavaEE.bdd.BDconnect;

public class SignUpForm {
	
	private boolean	result;
	private String erreur;

	public String getErreur() {
		return erreur;
	}

	public void setErreur(String erreur) {
		this.erreur = erreur;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	
	public void addData(HttpServletRequest request) {
		
		BDconnect bd = new BDconnect();
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String confpass = request.getParameter("confpass");
		String type = request.getParameter("type_user");
		String gsm = request.getParameter("gsm");
		
	  
		if( bd.addData("user", nom, prenom, email, pass, confpass, type, gsm) ) {
			 result=true;
		}else {
			result=false;
			erreur="Veuillez Saisir correctement vos données";
		}
		  
	  
	}
	
}
