package chapter03;

public class Goods {
	public static int countOfGoods;
	private String name;
	private int price;
	private int countStock;
	private int countSold;
<<<<<<< HEAD
	
	public Goods() {
		countOfGoods = Goods.countOfGoods + 1;
	}

	//public string getName
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		// 데이터 보호
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public String getName() {
		return name;
	}

	public void showInfo() {
		System.out.println("name: "+ name +", price: " + price + " ,countStock: " + countStock + " countSold: " + countSold);
		
=======

	public Goods() {
		
	}
	public Goods(String name, int price, int countStock, int countSold) {
		countOfGoods = Goods.countOfGoods + 1;

		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		// 데이터 보호
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public String getName() {
		return name;
	}

	public void showInfo() {
		System.out.println(
				"name: " + name + ", price: " + price + " ,countStock: " + countStock + " countSold: " + countSold);

>>>>>>> refs/remotes/origin/master
	}

	public int calcDiscountPrice(double discountRate) {
		return (int) (discountRate * price);
	}

}
