package day11.Task1;

public class Courier implements Worker {

	public Courier(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	private Warehouse warehouse;
	private double salary = 0;

	public double getSalary() {
		return salary;
	}

	public void doWork() {
		salary += 100;
		warehouse.setBalance();
	}

	public void bonus() {
		if (warehouse.getBalance() == 1_000_000)
			salary *= 2;
	}
}
