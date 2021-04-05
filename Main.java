
public class Main {
	public static void main(String[] args) {
		Student student1 = new Student();
		int[] creditHrLisa = {21, 20, 0, 0, 0, 0, 0};
		
		student1.printStudent("Lisa", 2, 4.0);
		student1.financialStatement(3000, 2500);
		student1.health(47, 1.60);
		student1.academic(7, 132, creditHrLisa);
				
		System.out.println();
		
		Student student2 = new Student(); 
		int[] creditHrLouis = {19, 20, 21, 19, 20, 0, 0, 0};
		
		student2.printStudent("Louis", 5, 3.5);
		student2.financialStatement(2450, 3000);
		student2.health(88, 1.82);
		student2.academic(8, 144, creditHrLouis);	
	}

}
