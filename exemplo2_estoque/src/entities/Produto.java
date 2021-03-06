package entities;

public class Produto {
	
	private String name;
	private double price;
	private int inStock;
	
	public Produto() {}
	public Produto(String name, double price, int inStock) {
		this.name = name;
		this.price = price;
		this.inStock = inStock;
	}
	
	public Produto(String name, double price) {
		this.name = name;
		this.price = price;
	}
	//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//
	public int getInStock() {
		return inStock;
	}
	//
	
	
	public double totalValueInStock() {
		return price*inStock;
	}
	
	public void addToStock(int quant) {
		inStock+=quant;
	}
	
	public void removeFromStock(int quant) {
		inStock-=quant;
	}
	
	public void showData() {
		System.out.printf(" %s, $ %.2f, %d units, Total: $ %.2f.\n",name,price,inStock,totalValueInStock());

	}
	
	public String toString(){
		return name
			  +", $"
	          +String.format("%.2f", price)
	          +", "
	          +inStock
	          +" units, Total: $"
	          +totalValueInStock();
	}

		
	
	
}
