package Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.JavaEE.BD.SingletonConnection;


public class ImmobilierMetierImp implements ImmobilierOperMetier {

	@Override
	public int addImmobilier(Immobilier I) {
		Connection conn=SingletonConnection.getConnection();
		int code = 0;
		 try {
			Random random = new Random();
			int randomInteger = random.nextInt(899999)+100000;
			
			DateFormat df = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
		    Date dateobj = new Date();
		    
		    String str = df.format(dateobj);
		      
			/*PreparedStatement ps=conn.prepareStatement
					 ("insert into immobilier(nom_imm,type_imm,prix,superficie,address_imm,description,statut) values(?,?,?,?,?,?,?)");
			
			ps.setString(1,I.getNom_imm());
			ps.setString(2,I.getType_imm());
			ps.setDouble(3,I.getPrix());
			ps.setInt(4,I.getSuperficie());
			ps.setString(5,I.getAddress_imm());
			ps.setString(6,I.getDescription());
			ps.setString(7,I.getStatut());
			ps.executeUpdate();
			ps.close();
			PreparedStatement ps1=conn.prepareStatement
						("SELECT LAST_INSERT_ID() as last_id FROM immobilier");
			ResultSet rs1=ps1.executeQuery();
			//code=(int) rs1;
			res = "---"+rs1.getString("last_id")+"--";
			
			
			ps1.close();*/
			 
			 PreparedStatement ps=conn.prepareStatement
					 ("insert into immobilier(code_imm,nom_imm,type_imm,prix,superficie,address_imm,description,statut,date) values("+ randomInteger +",?,?,?,?,?,?,?,?)");
			
			ps.setString(1,I.getNom_imm());
			ps.setString(2,I.getType_imm());
			ps.setDouble(3,I.getPrix());
			ps.setInt(4,I.getSuperficie());
			ps.setString(5,I.getAddress_imm());
			ps.setString(6,I.getDescription());
			ps.setString(7,I.getStatut());
			ps.setString(8, str);
			ps.executeUpdate();
			
	        code = randomInteger;
			
            ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return code;
		 
	}
	@Override
	public Immobilier getImmobilier(String Nom) {
		Immobilier I=null;
		Connection conn=SingletonConnection.getConnection();
		 try {
			PreparedStatement ps=conn.prepareStatement
					 ("select* from immobilier where nom_imm=?");
			ps.setString(1,Nom);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
			 I=new Immobilier();
			 I.setCode_imm(rs.getInt("code_imm"));
			 I.setNom_imm(rs.getString("nom_imm"));
			 I.setType_imm(rs.getString("type_imm"));
			 I.setPrix(rs.getDouble("prix"));
			 I.setSuperficie(rs.getInt("superficie"));
			 I.setAddress_imm(rs.getString("address_imm"));
			 I.setDescription(rs.getString("description"));
			 I.setStatut(rs.getString("statut"));
			}
			
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if(I==null) throw new RuntimeException("immobolier "+Nom+" introuvable");
		return I;
	}


	@Override
	public void updateImmobilier(Immobilier I) {
		Connection conn=SingletonConnection.getConnection();
		 try {
			PreparedStatement ps=conn.prepareStatement
					 ("update immobilier set  nom_imm=?, type_imm=?, prix=?, superficie=?,address_imm=?,description=?,statut=? where code_imm=?");
			ps.setString(1,I.getNom_imm());
			ps.setString(2,I.getType_imm());
			ps.setDouble(3,I.getPrix());
			ps.setInt(4,I.getSuperficie());
			ps.setString(5,I.getAddress_imm());
			ps.setString(6,I.getDescription());
			ps.setString(7,I.getStatut());
			ps.setInt(8,I.getCode_imm());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public List<Immobilier> listImmobilier() {
		List<Immobilier> imm=new ArrayList<Immobilier>();
		Connection conn=SingletonConnection.getConnection();
		 try {
			PreparedStatement ps=conn.prepareStatement
					 ("select * from immobilier");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Immobilier I=new Immobilier();
			I.setCode_imm(rs.getInt("code_imm"));
			I.setNom_imm(rs.getString("nom_imm"));
			I.setType_imm(rs.getString("type_imm"));
			I.setPrix(rs.getDouble("prix"));
			I.setSuperficie(rs.getInt("superficie"));
			I.setAddress_imm(rs.getString("address_imm"));
			I.setDescription(rs.getString("description"));
			I.setStatut(rs.getString("statut"));
			I.setDate(rs.getString("date"));
		    imm.add(I);
			
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return imm;
	}

	@Override
	public void deleteImmobilier(int code_imm) {
		Connection conn=SingletonConnection.getConnection();
		 try {
			PreparedStatement ps=conn.prepareStatement
					 ("delete from immobilier where code_imm=?");
		
			ps.setInt(1,code_imm);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	

}
