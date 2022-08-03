package hiber1.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student_details {
	
	public student_details(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	@Id
	private int sno;
	private String name;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
