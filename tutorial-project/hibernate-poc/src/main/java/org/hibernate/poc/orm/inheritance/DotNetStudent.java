package org.hibernate.poc.orm.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="dotnetstudent")
@Table(name="tutouser.student")
@DiscriminatorValue("ds")
public class DotNetStudent extends Student{
	
	private double workingHr;

	public DotNetStudent(int id, String name, String roll, Integer phone, double workingHr) {
		super(id, name, roll, phone);
		this.workingHr=workingHr;
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 7164318306396533057L;

	public double getWorkingHr() {
		return workingHr;
	}

	public void setWorkingHr(double workingHr) {
		this.workingHr = workingHr;
	}

}
