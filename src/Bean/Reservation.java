package Bean;

public class Reservation {


	
		private int id_reservation;
		private int code_imm;
		private int id_user;
		public Reservation() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Reservation(int id_reservation, int code_imm, int id_user) {
			super();
			this.id_reservation = id_reservation;
			this.code_imm = code_imm;
			this.id_user = id_user;
		}
		public int getId_reservation() {
			return id_reservation;
		}
		public void setId_reservation(int id_reservation) {
			this.id_reservation = id_reservation;
		}
		public int getCode_imm() {
			return code_imm;
		}
		public void setCode_imm(int code_imm) {
			this.code_imm = code_imm;
		}
		public int getId_user() {
			return id_user;
		}
		public void setId_user(int id_user) {
			this.id_user = id_user;
		}
		
		
}
