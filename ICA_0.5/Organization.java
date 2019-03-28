public class Organization{
	private String name;
	private String industry;
	private int employees;

	public Organization(){
		name = null;
		industry = null;
		employees = 0;
	}

	public Organization(String n, String i, int e){
		name = n;
		industry = i;
		employees = e;
	}

	public String getName(){
		return name;
	}

	public String getIndustry(){
		return industry;
	}

	public int getEmployees(){
		return employees;
	}

	public void setName(String s){
		name = s;
	}

	public void setIndustry(String s){
		industry = s;
	}

	public void setEmployees(int i){
		employees = i;
	}

	public boolean isEqual(Organization o){
		if(name.equals(o.name)){
			return true;
		}
		return false;
	}

	public String toString(){
		return ("Name: " + name + " Industry: " + industry + " Number of Employees: " + employees);
	}
}
