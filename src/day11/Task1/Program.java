package day11.Task1;

public class Program {
	public static void main(String[] args) {
		Warehouse warehouse1 = new Warehouse();
		Picker picker1 = new Picker(warehouse1);
		Courier courier1 = new Courier(warehouse1);

		Warehouse warehouse2 = new Warehouse();
		Picker picker2 = new Picker(warehouse2);
		Courier courier2 = new Courier(warehouse2);

		do {
			picker1.doWork();
			courier1.doWork();
		} while (warehouse1.getCountOrder() < 1500);

		picker1.bonus();
		courier1.bonus();

		System.out.println(warehouse1.toString());
		System.out.println(picker1.getSalary());
		System.out.println(courier1.getSalary());

		picker2.doWork();
		courier2.doWork();

		picker2.bonus();
		courier2.bonus();

		System.out.println(warehouse2.toString());
		System.out.println(picker2.getSalary());
		System.out.println(courier2.getSalary());
	}
}
