import java.util.Scanner;
class NetSalary{
	public static void main(String[] args){
		String category;
		int salary;
		double tax=0;
		int netSalary;
		Scanner inputZaed = new Scanner(System.in);
		System.out.println("Input your category:");
		category = inputZaed.nextLine();
		System.out.println("Input your salary:");
		salary = inputZaed.nextInt();
		if (category.equalsIgnoreCase("Worker")) {
			if (salary <= 2000000){
				tax = 0.1;
			}
			else if (salary <= 3000000){
				tax = 0.15;
			}
			else {
				tax = 0.2;
			}
			netSalary = (int) (salary - (salary * tax));
			System.out.println("Gaji bersih yang Anda terima: "+netSalary);
		}
		else if(category.equalsIgnoreCase("businessman")){
			if (salary <= 2500000){
				tax = 0.15;
			}
			else if(salary <= 3500000){
				tax = 0.2;
			}
			netSalary = (int) (salary - (salary * tax));
			System.out.println("Your received salary : "+netSalary);
		}
		else{
			System.out.println("Invalid category input");
		}
	}
}