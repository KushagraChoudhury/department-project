package com.tcss;

class Demo2 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Kushagra");
		e1.setId(101);

		Employee e2 = new Employee();
		e2.setName("Rahul");
		e2.setId(102);

		Employee e3 = new Employee();
		e3.setName("Arjun");
		e3.setId(103);

		Employee e4 = new Employee();
		e4.setName("Karan");
		e4.setId(104);

		Employee e5 = new Employee();
		e5.setName("Piyush");
		e5.setId(105);

		Employee e[] = new Employee[5];

		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		e[3] = e4;
		e[4] = e5;

		for (int i = 0; i < e.length; i++)
			System.out.println("Employee name is " + e[i]);

		Employee ee[] = { new Employee("Rishikesh", 110), new Employee("Bristi", 111), new Employee("Ankita", 112) };

		for (Employee x : ee)
			System.out.println("Employee name is " + x.getName());
	}

}
