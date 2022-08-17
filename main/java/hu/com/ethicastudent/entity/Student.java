package hu.com.ethicastudent.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "student")
public class Student {
	
	
//	@Id @GeneratedValue(generator="system-uuid")
//	@GenericGenerator(name="system-uuid", strategy = "uuid")
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private String firstname; // Vezetéknév
	private String lastname;  // Keresztnév
	
	/*
	 * age - Legyen double (pl 16,5 éves). A feladatban nincs meghatározva a szerepe, csak hogy legyen. Ilyet nem is szoktunk tárolni, max
	 * valamilyen ideiglenes tárolóban egy lekérdezéshez. Tárolandó leginkább a születési dátum
	 */
	private double age; 
	
	
	public Student() {
		
	}
    public Student(String firstname, String lastname, double age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	

}
