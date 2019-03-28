public class Driver{
	public static void main(String[] args){
		Organization o1 = new Organization("McDonalds", "Restraunt", 0);


		System.out.println("\nOrganization 1 Employees Present -  " + o1.getEmployees());
		Attendee a1 = new Attendee("Phil", "May 4, 1980", "President", o1, true);
		System.out.println("Attendee 1 -  " + a1.toString());
		System.out.println("Organization 1 Employees Present -  " + o1.getEmployees());		Attendee a2 = new Attendee(a1);
		System.out.println("Attendee 2 -  " + a2.toString());
		System.out.println("Organization 1 Employees Present -  " + o1.getEmployees() + "\n");
		if(a1.isEqual(a2)){
			System.out.println("Attendee 1 and 2 are the same person");
		}
		else{
			System.out.println("Attendee 1 and 2 are different people");
		}
		a2.setName("Steve");
		System.out.println("\nAttendee 2 Modified -  " + a2.toString() + "\n");
		if(a1.isEqual(a2)){
			System.out.println("Attendee 1 and 2 are the same person");
		}
		else{
			System.out.println("Attendee 1 and 2 are different people");
		}

		Organization o2 = new Organization("Burger King", "Restraunt", 0);
		System.out.println("\nOrganization 2 -  " + o2.toString() + "\n");

		if(o1.isEqual(o2)){
			System.out.println("Organization 1 and 2 are the same organization");
		}
		else{
			System.out.println("Organization 1 and 2 are different organizations");
		}
		System.out.println();
	}
}
