/**
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment 4

Creates a class called PizzaOrder that allows the user to create an order of up to 3 Pizzas.
The user can calculate their total cost of pizzas as well.
*/

public class PizzaOrder{
	//Number of Pizzas in the order
	private int numPizzas;
	//First Pizza
	private Pizza pizza1;
	//Second Pizza
	private Pizza pizza2;
	//Third Pizza
	private Pizza pizza3;

	//Default constructor adds 1 default pizza to the order
	public PizzaOrder(){
		numPizzas = 1;
		pizza1 = new Pizza();
		pizza2 = null;
		pizza3 = null;
	}

	public PizzaOrder(Pizza p1){
		numPizzas = 1;
		pizza1 = p1;
		pizza2 = null;
		pizza3 = null;
	}

	public PizzaOrder(Pizza p1, Pizza p2){
		numPizzas = 1;
		pizza1 = p1;
		pizza2 = p2;
		pizza3 = null;
	}

	public PizzaOrder(Pizza p1, Pizza p2, Pizza p3){
		numPizzas = 1;
		pizza1 = p1;
		pizza2 = p2;
		pizza3 = p3;
	}

	/**
	Sets the number of Pizzas in an order
	@param n number of Pizzas (1-3)
	*/
	public	void	setNumPizzas(int n){
		numPizzas=n;
	}

	/**
	Sets the first Pizza to some Pizza
	@param p1 some Pizza
	*/
	public	void	setPizza1(Pizza	p1){
		pizza1 = p1;
	}

	/**
	Sets the second Pizza to some Pizza
	@param p2 some Pizza
	*/
	public	void	setPizza2(Pizza	p2){
		pizza2 = p2;
	}

	/**
	Sets the third Pizza to some Pizza
	@param p3 some Pizza
	*/
	public	void	setPizza3(Pizza	p3){
		pizza3 = p3;
	}

	/**
	Calculates the cost of the order
	@return double
	*/
	public	double	calcTotal(){
		if(numPizzas==1){
			return pizza1.calcCost();
		}
		else if(numPizzas==2){
			return pizza1.calcCost() + pizza2.calcCost();
		}
		else{
			return pizza1.calcCost() + pizza2.calcCost() + pizza3.calcCost();
		}
	}
}
