/**
@name Toby Chappell
@student_id 2312642
@email tchappell@chapman.edu
@course CPSC-231-03
@assignment 4

Creates a class called Pizza that allows the user to create a pizza with toppings of some size.
The user can also calcluate the cost of their Pizza of choice as well as print out a
description of their Pizza.
*/

public class Pizza{
	//Size of the pizza
	private String size;
	//Number of Cheese toppings
	private int cheese;
	//Number of Pepperoni toppings
	private int pepperoni;
	//Number of Ham toppings
	private int ham;


	//Default constructor creates a small Pizza with 0 toppings
	public Pizza(){
		size="small";
		cheese=0;
		pepperoni=0;
		ham=0;
	}

	/**
	Overloaded constructor allows the user to decide the size and number of Cheese, Pepperoni, and Ham toppings
	@param s Size of the Pizza (small, medium, or large)
	@param c Number of Cheese toppings
	@param p Number of Pepperoni toppings
	@param h Number of Ham toppings
	*/
	public Pizza(String s, int c, int p, int h){
		size = s.toLowerCase();
		cheese = c;
		pepperoni = p;
		ham = h;
	}

	/**
	Returns the size of a Pizza
	@return String
	*/
	public String getSize(){
		return size;
	}

	/**
	Sets the size of a Pizza
	@param s small, medium, or large
	*/
	public void setSize(String s){
		size = s.toLowerCase();
	}

	/**
	Returns the number of Cheese toppings
	@return int
	*/
	public int getCheese(){
		return cheese;
	}

	/**
	Sets the number of Cheese toppings
	@param c number of cheese toppings
	*/
	public void setCheese(int c){
		cheese = c;
	}

	/**
	Returns the number of Pepperoni toppings
	@return int
	*/
	public int getPepperoni(){
		return pepperoni;
	}

	/**
	Sets the number of Pepperoni toppings
	@param c number of Pepperoni toppings
	*/
	public void setPepperoni(int p){
		pepperoni = p;
	}

	/**
	Returns the number of Ham toppings
	@return int
	*/
	public int getHam(){
		return ham;
	}

	/**
	Sets the number of Ham toppings
	@param c number of Ham toppings
	*/
	public void setHam(int h){
		ham = h;
	}

	/**
	Calculates the cost of a Pizza where a small=$10, medium=$12, and large=$14 and each topping is $2 each
	@return double
	*/
	public double calcCost(){
		int cost = 2*(cheese+pepperoni+ham);
		if(size.equals("small")){
			cost +=  10;
		}
		else if(size.equals("medium")){
			cost += 12;
		}
		else{
			cost += 14;
		}
		return cost;
	}

	/**
	Creates a string displaying the Characteristics of a Pizza
	@return String
	*/
	public String getDescription(){
		return ("Size: " + size + " Cheese: " + cheese + " Pepperoni: " + pepperoni + " Ham: " + ham + " Cost: $" + calcCost() + "0");
	}
}
