//Author Priyankar

class Employee {

    private double basicSalary;
	
    public double getBasicSalary() {
        return basicSalary;
    }

    
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
	
    private double calculateTax() {
        return 0.10 * basicSalary;
    }
	
    private double calculateBonus() {
        return 0.02 * basicSalary;
    }
	
    private double calculateTravellingAllowance() {
        return 0.015 * basicSalary;
    }
	
    public double calculateAnnualSalary() {
        double monthlySalary = basicSalary + calculateBonus() + calculateTravellingAllowance();
        double annualSalary = (monthlySalary * 12) - calculateTax();
        return annualSalary;
    }
	
    public void displaySalaryDetails() {
        System.out.println("Basic Salary: " + getBasicSalary());
        System.out.println("The annual salary of the employee is: " + calculateAnnualSalary());
    }

    public static void main(String[] args) {
        Employee emp = new Employee();  
        
        
        emp.setBasicSalary(30000);
		
        emp.displaySalaryDetails();
    }
}