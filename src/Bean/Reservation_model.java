package Bean;

public class Reservation_model {


	
		private int id_reservation_model;
		private int code_model;
		private int id_user;
		public Reservation_model() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		public Reservation_model(int id_reservation_model, int code_model, int id_user) {
			super();
			this.id_reservation_model = id_reservation_model;
			this.code_model = code_model;
			this.id_user = id_user;
		}



		public int getId_reservation_model() {
			return id_reservation_model;
		}
		public void setId_reservation_model(int id_reservation_model) {
			this.id_reservation_model = id_reservation_model;
		}
		public int getCode_model() {
			return code_model;
		}
		public void setCode_model(int code_model) {
			this.code_model = code_model;
		}
		public int getId_user() {
			return id_user;
		}
		public void setId_user(int id_user) {
			this.id_user = id_user;
		}
		
		
		
}
