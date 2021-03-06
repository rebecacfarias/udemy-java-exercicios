package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		System.out.println("- Enter product data below -");
		Scanner sc = new Scanner(System.in);
				
		System.out.print("NAME: ");
		String name = sc.next();
		System.out.print("PRICE: ");
		double price = sc.nextDouble();
		
		Produto prod = new Produto(name,price);
		
		System.out.print("Product data: ");
		prod.showData();
		
		int answ,quant;
		do {
		do {
		  System.out.print("DO YOU WANT TO 1-ADD OR 2-REMOVE FROM STOCK? (0 TO FINISH) ->");
		  answ = sc.nextInt();
		}while(answ<0 && answ>2);
		if (answ == 0) break;
		System.out.print("QUANTITY TO ALTER IN STOCK: ");
		quant = sc.nextInt();
		if(answ == 1) {
			prod.addToStock(quant);
		} 
		else if(answ == 2) {
			prod.removeFromStock(quant);
		}
		
		
		System.out.print("Updated data: ");
		prod.showData();
		}while(answ!=0);
		sc.close();
	}

}
