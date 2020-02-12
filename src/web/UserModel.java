package web;

import java.util.ArrayList;
import java.util.List;

import com.JavaEE.Bean.User;


public class UserModel {
	
	private User u=new User();
	private List<User> user=new ArrayList<User>();
	
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}

}
