package Bean;

public class Estimer {
	

public Estimer() {
	}

public double Calculer(int superficie, String quartier,String statut,String immo_type,String finition ) {
	double resultat = 0.0;
	if(statut.compareTo("vente")==0) {
		if(immo_type.compareTo("appartement")==0) {
	switch(quartier) {
	
	case ("agdal"):
		if(finition.compareTo("semi-finition")==0)
		 resultat = (double) (superficie*12000);
		else if(finition.compareTo("haute finition")==0)
		 resultat = (double) (superficie*13000);
		else if(finition.compareTo("trés haute finition")==0)
		 resultat = (double) (superficie*15000);
	break;
		
	case ("hay riad"):	
		if(finition.compareTo("semi-finition")==0)
			 resultat = (double) (superficie*16000);
			else if(finition.compareTo("haute finition")==0)
			 resultat = (double) (superficie*18000);
			else if(finition.compareTo("trés haute finition")==0)
			 resultat = (double) (superficie*20000);
		break;
	case ("hassan"):
		if(finition.compareTo("semi-finition")==0)
			 resultat = (double) (superficie*14000);
			else if(finition.compareTo("haute finition")==0)
			 resultat = (double) (superficie*15000);
			else if(finition.compareTo("trés haute finition")==0)
			 resultat = (double) (superficie*16000);
		break;
	default:
		if(finition.compareTo("semi-finition")==0)
			 resultat = (double) (superficie*10000);
			else if(finition.compareTo("haute finition")==0)
			 resultat = (double) (superficie*11000);
			else if(finition.compareTo("trés haute finition")==0)
			 resultat = (double) (superficie*12000);
		break;
	}
	}
	else if(immo_type.compareTo("villa")==0) {
	switch(quartier) {
	
	case ("agdal"):
		if(finition.compareTo("semi-finition")==0)
		 resultat = (double) (superficie*18000);
		else if(finition.compareTo("haute finition")==0)
		 resultat = (double) (superficie*19000);
		else if(finition.compareTo("trés haute finition")==0)
		 resultat = (double) (superficie*21000);
	break;
		
	case ("hay riad"):	
		if(finition.compareTo("semi-finition")==0)
			 resultat = (double) (superficie*20000);
			else if(finition.compareTo("haute finition")==0)
			 resultat = (double) (superficie*24000);
			else if(finition.compareTo("trés haute finition")==0)
			 resultat = (double) (superficie*25000);
		break;
	case ("hassan"):
		if(finition.compareTo("semi-finition")==0)
			 resultat = (double) (superficie*18000);
			else if(finition.compareTo("haute finition")==0)
			 resultat = (double) (superficie*20000);
			else if(finition.compareTo("trés haute finition")==0)
			 resultat = (double) (superficie*21000);
		break;
	default:
		if(finition.compareTo("semi-finition")==0)
			 resultat = (double) (superficie*15000);
			else if(finition.compareTo("haute finition")==0)
			 resultat = (double) (superficie*16000);
			else if(finition.compareTo("trés haute finition")==0)
			 resultat = (double) (superficie*17000);
		break;
	}
	}
	else if(immo_type.compareTo("terrain")==0) {
		
	switch(quartier) {
	
	case ("agdal"):
		 resultat = (double) (superficie*13000);	
	break;
		
	case ("hay riad"):	
		 resultat = (double) (superficie*18000);
		break;
	case ("hassan"):
		 resultat = (double) (superficie*15000);
		break;
	default:
		 resultat = (double) (superficie*10000);
		break;
	}
	}
	}
	
	else if(statut.compareTo("location")==0) {
		if(immo_type.compareTo("appartement")==0) {
	switch(quartier) {
	
	case ("agdal"):
		if(finition.compareTo("semi-finition")==0 && superficie<100)
			resultat = 5000.0;
		else if (finition.compareTo("semi-finition")==0 && superficie>=100)
			resultat = 6000.0;	
		else if(finition.compareTo("haute finition")==0 && superficie<100)
			resultat = 6500.0;
		else if (finition.compareTo("haute finition")==0 && superficie>=100)
			resultat = 7500.0;
		else if(finition.compareTo("trés haute finition")==0 && superficie<100)
			resultat = 8000.0;
		else if (finition.compareTo("trés haute finition")==0 && superficie>=100)
			resultat = 9000.0;
		
	break;
		
	case ("hay riad"):	
		if(finition.compareTo("semi-finition")==0 && superficie<100)
			resultat = 7000.0;
		else if (finition.compareTo("semi-finition")==0 && superficie>=100)
			resultat = 7500.0;	
		else if(finition.compareTo("haute finition")==0 && superficie<100)
			resultat = 8000.0;
		else if (finition.compareTo("haute finition")==0 && superficie>=100)
			resultat = 8500.0;
		else if(finition.compareTo("trés haute finition")==0 && superficie<100)
			resultat = 10000.0;
		else if (finition.compareTo("trés haute finition")==0 && superficie>=100)
			resultat = 12000.0;
		break;
	case ("hassan"):
		if(finition.compareTo("semi-finition")==0 && superficie<100)
			resultat = 5000.0;
		else if (finition.compareTo("semi-finition")==0 && superficie>=100)
			resultat = 6000.0;	
		else if(finition.compareTo("haute finition")==0 && superficie<100)
			resultat = 6500.0;
		else if (finition.compareTo("haute finition")==0 && superficie>=100)
			resultat = 7500.0;
		else if(finition.compareTo("trés haute finition")==0 && superficie<100)
			resultat = 8000.0;
		else if (finition.compareTo("trés haute finition")==0 && superficie>=100)
			resultat = 9000.0;
		break;
	default:
		if(finition.compareTo("semi-finition")==0 && superficie<100)
			resultat = 3000.0;
		else if (finition.compareTo("semi-finition")==0 && superficie>=100)
			resultat = 3500.0;	
		else if(finition.compareTo("haute finition")==0 && superficie<100)
			resultat = 3500.0;
		else if (finition.compareTo("haute finition")==0 && superficie>=100)
			resultat = 4000.0;
		else if(finition.compareTo("trés haute finition")==0 && superficie<100)
			resultat = 4000.0;
		else if (finition.compareTo("trés haute finition")==0 && superficie>=100)
			resultat = 4500.0;
		break;
	}
	}
	else if(immo_type.compareTo("villa")==0) {
	switch(quartier) {
	
	case ("agdal"):
		if(finition.compareTo("semi-finition")==0 && superficie<200)
			resultat = 10000.0;
		else if (finition.compareTo("semi-finition")==0 && superficie>=200)
			resultat = 11000.0;	
		else if(finition.compareTo("haute finition")==0 && superficie<200)
			resultat = 12000.0;
		else if (finition.compareTo("haute finition")==0 && superficie>=200)
			resultat = 13000.0;
		else if(finition.compareTo("trés haute finition")==0 && superficie<200)
			resultat = 15000.0;
		else if (finition.compareTo("trés haute finition")==0 && superficie>=200)
			resultat = 20000.0;
	break;
		
	case ("hay riad"):	
		if(finition.compareTo("semi-finition")==0 && superficie<200)
			resultat = 15000.0;
		else if (finition.compareTo("semi-finition")==0 && superficie>=200)
			resultat = 16000.0;	
		else if(finition.compareTo("haute finition")==0 && superficie<200)
			resultat = 17000.0;
		else if (finition.compareTo("haute finition")==0 && superficie>=200)
			resultat = 18000.0;
		else if(finition.compareTo("trés haute finition")==0 && superficie<200)
			resultat = 19000.0;
		else if (finition.compareTo("trés haute finition")==0 && superficie>=200)
			resultat = 22000.0;
		break;
	case ("hassan"):
		if(finition.compareTo("semi-finition")==0 && superficie<200)
			resultat = 11000.0;
		else if (finition.compareTo("semi-finition")==0 && superficie>=200)
			resultat = 12000.0;	
		else if(finition.compareTo("haute finition")==0 && superficie<200)
			resultat = 13000.0;
		else if (finition.compareTo("haute finition")==0 && superficie>=200)
			resultat = 14000.0;
		else if(finition.compareTo("trés haute finition")==0 && superficie<200)
			resultat = 14500.0;
		else if (finition.compareTo("trés haute finition")==0 && superficie>=200)
			resultat = 17000.0;
		break;
	default:
		if(finition.compareTo("semi-finition")==0 && superficie<200)
			resultat = 8000.0;
		else if (finition.compareTo("semi-finition")==0 && superficie>=200)
			resultat = 9000.0;	
		else if(finition.compareTo("haute finition")==0 && superficie<200)
			resultat = 9500.0;
		else if (finition.compareTo("haute finition")==0 && superficie>=200)
			resultat = 10000.0;
		else if(finition.compareTo("trés haute finition")==0 && superficie<200)
			resultat = 11000.0;
		else if (finition.compareTo("trés haute finition")==0 && superficie>=200)
			resultat = 12000.0;
	}
	}
	else if(immo_type.compareTo("terrain")==0) {
		
	switch(quartier) {
	
	case ("agdal"):
		if( superficie<200)
			resultat = 15000.0;	
		break;
		
	case ("hay riad"):	
		if( superficie<200)
			resultat = 20000.0;	
		break;
	case ("hassan"):
		if( superficie<200)
			resultat = 16000.0;	
		break;
	default:
		if( superficie<200)
			resultat = 10000.0;	
		break;
	}
	}
	}
	
	
	return resultat;	
}
}




