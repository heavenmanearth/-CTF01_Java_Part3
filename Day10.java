package ctf01.java.oop;

public class Day10 {

	public static void main(String[] args) {

		// ทดลองสร้าง instance ของ class CEO และ class Employee ใน Method main
		// ไฟล์ Day10.java
		CEO ceo1 = new CEO("Zero", "Null", 50000);
		Employee em4 = new Employee("Ken", "Bean", 15000);

		// ทดลองเรียก method getSarary() ใน instance ของ class Programmer
		Programmer prog1 = new Programmer("Tim", "Cook", 17000);
		System.out.println(prog1.checkPosition() + " : " + prog1.firstname + " >> salary >> " + prog1.getSalary());
		// ทดลอง checkPosition method
		System.out.println(prog1.firstname + " is a " + prog1.checkPosition() + ".");
	}

}
