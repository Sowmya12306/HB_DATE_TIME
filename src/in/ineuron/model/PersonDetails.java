package in.ineuron.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Person")
public class PersonDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid; 
	private String name;
	private String address;
	private LocalDate dob;
	private LocalDateTime dom;
	private LocalTime doj;


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public LocalDateTime getDom() {
		return dom;
	}


	public void setDom(LocalDateTime dom) {
		this.dom = dom;
	}


	public LocalTime getDoj() {
		return doj;
	}


	public void setDoj(LocalTime doj) {
		this.doj = doj;
	}


	public PersonDetails() {
	}


	@Override
	public String toString() {
		return "Person [id=" + pid + ", name=" + name + ", address=" + address + ", dob=" + dob + ", dom=" + dom
				+ ", doj=" + doj + "]";
	}



}
