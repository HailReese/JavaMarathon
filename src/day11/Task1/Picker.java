package day11.Task1;

public class Picker implements Worker {

	public Picker(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	private Warehouse warehouse;
	private double salary = 0;

	public double getSalary() {
		return salary;
	}

	public void doWork() {
		salary += 80;
		warehouse.setCountOrder();
	}

	public void bonus() {
		if (warehouse.getCountOrder() == 1_500)
			salary *= 3;
	}
}
