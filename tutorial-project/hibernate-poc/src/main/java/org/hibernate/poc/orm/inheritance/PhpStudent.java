package org.hibernate.poc.orm.inheritance;

public class PhpStudent extends Student{
	
	private String branch;

	public PhpStudent(int id, String name, String roll, Integer phone, String branch) {
		super(id, name, roll, phone);
		this.branch=branch;
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2990142958929924723L;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
