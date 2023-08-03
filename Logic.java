package com.tcss;

class Logic {
	public static void getWork(Employee e) {
		System.out.println("The Department is giving the work to Employee " + e.getName());
	}

	public static void takeWork(Department d) {
		System.out.println("The Employee is taking work from the Department " + d.getName());
		System.out.println("The Employee is working in the location " + d.getLocation());
	}
}
