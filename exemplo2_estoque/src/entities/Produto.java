package entities;

public class Produto {
	
	public String name;
	public double price;
	public int inStock;
	
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