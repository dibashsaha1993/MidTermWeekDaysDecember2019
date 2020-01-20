package design;

public abstract class EmployeeAbstract implements Employee{

	@Override
	public void assignDepartment() {
		//get employee id 
		Employee.employeeId();
		//write some logic to set department on the basis of employee id
		//like if employee id starts with 1 then it can be IT
		//if starts with 2 then FINANCE
		//if starts with 3 then HR
		//like this
	}
}
