package web;

import java.util.ArrayList;
import java.util.List;

import Bean.Immobilier;

public class ImmobilierModele {
private Immobilier immobilier=new Immobilier();
private List<Immobilier> imm=new ArrayList<Immobilier>();

public Immobilier getImmobilier() {
	return immobilier;
}

public void setImmobilier(Immobilier immobilier) {
	this.immobilier = immobilier;
}



public List<Immobilier> getImm() {
	return imm;
}
public void setImm(List<Immobilier> imm) {
	this.imm = imm;
}

}
