package beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class UserInfo implements Serializable {
	
	@Id
	@GeneratedValue
	private String m_no;
	
	private String name;
	private String pass;
	private String email;
	private String add1;
	private String add2;
	private String city;
	private String pin;
	
	@Id
	public String getM_no() {
		return m_no;
	}
	public void setM_no(String m_no2) {
		this.m_no = m_no2;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	
	
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "UserInfo [m_no=" + m_no + ", pass=" + pass + ", email=" + email
				+ ", add1=" + add1 + ", add2=" + add2 + ", city=" + city
				+ ", pin=" + pin + "]";
	}
	
	
	

}
