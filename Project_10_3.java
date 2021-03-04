package ctf01.java.oop;

public class Project_10_3 {

	public static void main(String[] args) {
		Employee em1 = new Employee("Tom", "Hank", 12000);
		Employee em2 = new Employee("Peter", "Pan", 15000);
		Employee em3 = new Employee("Kim", "Peke", 13000);

		Employee[] empsss = { em1, em2, em3 };

		for (Employee x : empsss)
			x.hello();
	}

}
