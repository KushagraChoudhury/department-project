package com.tcss;

class Demo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Kushagra");
		e.setId(101);

		Department d = new Department();
		d.setName("Coding Team");
		d.setLocation("Bangalore");

		System.out.println(e);
		System.out.println(d);

		Logic.takeWork(d);
		Logic.getWork(e);
	}

}
