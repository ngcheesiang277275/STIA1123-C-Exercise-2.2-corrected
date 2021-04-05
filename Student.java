
public class Student {
	
	String name;
	int semester;
	double gpa;
	double charge;
	double paid;
	double weight;
	double height;
	int sem;
	int totalCreditHr;
	int[] creditHr;

	
	void printStudent(String name, int semester, double gpa) {
		System.out.println("-----Student's Info-----");
		System.out.printf("%-10s: %s%n", "Name", name);
		System.out.printf("%-10s: %d%n", "Semester" , semester);
		System.out.printf("%-10s: %.1f%n%n", "GPA" , gpa);
	}

	void financialStatement(double charge, double paid) {
		double balance = paid - charge;
		
		System.out.println("---Student's Financial Statement---");
		System.out.printf("%-10s: %.2f%n","Charge", charge);
		System.out.printf("%-10s: %.2f%n","Payment", paid);
		System.out.printf("%-10s: %.2f%n","Balance", balance);
		
		if(balance >= 0) 
			System.out.printf(">>>The fee is fully paid.\n>>>Balance remaining: RM%.2f%n%n", balance);
		else {
			System.out.println(">>>Unfortunately, the fee is not fully paid.");
			System.out.printf(">>>Charge needed to be paid: RM%.2f%nNeed assistance? Hotline: 012-345-6789.%n%n", Math.abs(balance));
		}
	}
	
	void health(double weight, double height){
		System.out.println("-------Health-------");
		System.out.printf("%-10s: %.1f%n", "Weight (kg)" , weight);
		System.out.printf("%-10s: %.2f%n", "Height (m)" , height);
		
		double bmi = weight / (height * height);
		
		System.out.printf("%-10s: %.2f%n", "BMI", bmi);
		
		if(bmi < 18.5)
			System.out.println(">>>Underweight");
		else if(bmi < 25)
			System.out.println(">>>Normal weight");
		else if(bmi <= 30)
			System.out.println(">>>Overweight");
		else
			System.out.println(">>>Very overweight");
		
		System.out.println("");
		
	}
	
	void academic(int sem, int totalCreditHr, int[] creditHr){
		int creditHrPassed = 0;
		
		System.out.println("-----Academic-----");
		System.out.printf("%-20s: %d%n", "Total semester", sem);
		
		System.out.printf("|%-13s|", "Semester");
		for(int a = 0; a < sem; a++)
			System.out.printf("%-5d|", a+1);
		
		System.out.printf("%n|%-13s|", "Credit Hour");
		for(int index = 0; index < creditHr.length; index++) {
			
			if(creditHr[index] == 0) 
				System.out.printf("%-5s|", "-");
			else
				System.out.printf("%-5d|", creditHr[index]);

		}
		
		for(int index = 0; index < creditHr.length; index++) 
			creditHrPassed += creditHr[index];
		
		
		System.out.printf("%n%-30s: %d%n","Total credit hour required: ", totalCreditHr);
		System.out.printf("%-30s: %d%n", "Credit hour taken: ", creditHrPassed );
		System.out.printf("%-30s: %d%n%n", "Credit hour incomplete: ", (totalCreditHr - creditHrPassed));
		
	}
	
	
	
	
	
}
