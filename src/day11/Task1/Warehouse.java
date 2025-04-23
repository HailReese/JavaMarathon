package day11.Task1;

public class Warehouse {
	private int countOrder;
	private double balance;

	public void setCountOrder() {
		countOrder++;
	}

	public int getCountOrder() {
		return countOrder;
	}

	public void setBalance() {
		balance += 1000;
	}

	public double getBalance() {
		return balance;
	}

	public String toString() {
		return String.format("Количество собранных заказов: %d, доход от доставленных заказов: %.2f", countOrder,
				balance);
	}
}
