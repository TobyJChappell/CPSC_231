public class Attendee{
	private String name;
	private String birth;
	private String job;
	private Organization company;
	private boolean isPresenter;

	public Attendee(){
		name = null;
		birth = null;
		job = null;
		company = null;
		isPresenter = false;
	}

	public Attendee(String n, String b, String j, Organization o, boolean p){
		name = n;
		birth = b;
		job = j;
		company = o;
		company.setEmployees(company.getEmployees()+1);
		isPresenter = p;
	}

	public Attendee(Attendee a){
		name = a.name;
		birth = a.birth;
		job = a.job;
		company = a.company;
		company.setEmployees(company.getEmployees()+1);
		isPresenter = a.isPresenter;
	}

	public String getName(){
		return name;
	}

	public String getBirth(){
		return birth;
	}

	public String getJob(){
		return job;
	}

	public Organization getOrganization(){
		return company;
	}

	public boolean getIsPresenter(){
		return isPresenter;
	}

	public void setName(String s){
		name = s;
	}

	public void setBirth(String s){
		birth = s;
	}

	public void setJob(String s){
		job = s;
	}

	public void setOrganization(Organization o){
		company = o;
	}

	public void setIsPresenter(boolean b){
		isPresenter = b;
	}

	public boolean isEqual(Attendee a){
		if(name.equals(a.name) && birth.equals(a.birth) && job.equals(a.job) && company.isEqual(a.company) && isPresenter == a.isPresenter){
			return true;
		}
		return false;
	}

	public String toString(){
		return ("Name: " + name + " Birthdate: " + birth + " Job Title: " + job + " Organization: " + company.getName() + " Is a Presenter: " + isPresenter);
	}
}
