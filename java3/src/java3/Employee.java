package java3;

public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYear;
	
	Employee(String name, int salary, int workHours, int hireYear ){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	 void tax() {
		
		double tax = this.salary * 0.03;
		
		if(this.salary> 1000 ) {
			System.out.print("Vergi : "+tax);
		} 
	}
	
	 void bonus() {
		
		int working = this.workHours - 40;
		if(working > 0) {
			System.out.print("Bonus : "+working *30);
		}
	}
	 
	 void raiseSalary() {
		 int workingYear = 2023 - this.hireYear;
		 double total = 0;
		 if(workingYear <10) {
			   total = this.salary+ this.salary*0.05;
			  
		 } else if (workingYear >9 && workingYear <20) {
			   total = this.salary+ this.salary*0.10;
		 }else if (workingYear >19) {
			   total = this.salary+ this.salary*0.15;
		 }
		 System.out.print("Maaş Artışı : "+total);
	 }
	 
	    void toStringPrint(){
	        System.out.println("****************************************");
	        System.out.println("Elemanın adı : " + this.name);
	        System.out.println("Elemanın maaşı : " + this.salary);
	        System.out.println("Elemanın Çalışma saati : " + this.workHours);
	        System.out.println("Elemanın işe başladığı yıl : " + this.hireYear);
	        this.tax();
	        System.out.println();
	        this.bonus();
	        System.out.println();
	        this.raiseSalary();
	        System.out.println();
	        System.out.println("****************************************");
	    }
}
