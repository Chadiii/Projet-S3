package Bean;

import java.util.List;

public interface ImmobilierOperMetier {
	
	public int addImmobilier(Immobilier I);
	public Immobilier getImmobilier(String Nom);
	public void updateImmobilier(Immobilier I);
	public void deleteImmobilier(int code_imm);
	public List<Immobilier> listImmobilier();
}
