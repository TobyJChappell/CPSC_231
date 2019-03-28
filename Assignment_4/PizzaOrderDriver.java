/**
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment 4

Driver for the PizzaOrder class
*/

public class PizzaOrderDriver{
	public static void main(String[] args){
		Pizza pizza1 = new Pizza("large", 1, 0, 1);
		Pizza pizza2 = new Pizza("medium", 2, 2, 0);
		PizzaOrder order = new PizzaOrder();
		order.setNumPizzas(2);
		order.setPizza1(pizza1);
		order.setPizza2(pizza2);
		System.out.println(pizza1.getDescription());
		System.out.println(pizza2.getDescription());
		double total = order.calcTotal();
		System.out.println("Total: $" + total);
	}
}
