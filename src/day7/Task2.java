package day7;

public class Task2 {
	public static void main(String[] args) {
		testing: {
			Player player1 = new Player();
			Player player2 = new Player();
			Player player3 = new Player();
			Player player4 = new Player();
			Player player5 = new Player();

			player1.info();
			System.out.println(player1.getStamina());
			for (int i = 100; i != 0; i--) {

				player1.run();
			}
			player1.info();

			Player player6 = new Player();
			Player player7 = new Player();
			Player player8 = new Player();
			Player player9 = new Player();

			System.out.println(player9.counterOfPlayer);

			player9.info();
		}
	}
}

class Player {

	public Player() {
		stamina = 90 + (int) Math.round(Math.random() * 10);
		if (counterOfPlayer != 6)
			counterOfPlayer++;
	}

	private int stamina;
	private static final int MAX_STAMINA = 100;
	private static final int MIN_STAMINA = 0;
	public static int counterOfPlayer = 0;

	public int getStamina() {
		return stamina;
	}

	public void run() {
		if (stamina >= 0)
			stamina--;
		if (stamina == 0)
			counterOfPlayer--;
		else if (stamina < 0)
			stamina = MIN_STAMINA;
	}

	public void info() {
		if (counterOfPlayer < 6) {
			if (counterOfPlayer > 4)
				System.out.printf("Команды неполные. На поле еще есть %d свободных мест.\n", 6 - counterOfPlayer);
			else if (counterOfPlayer <= 4)
				if (counterOfPlayer != 1)
					System.out.printf("Команды неполные. На поле еще есть %d свободных места.\n", 6 - counterOfPlayer);
				else
					System.out.printf("Команды неполные. На поле еще есть %d свободное место.\n", 6 - counterOfPlayer);
		} else {
			System.out.println("На поле нет свободных мест.\n");
		}
	}
}