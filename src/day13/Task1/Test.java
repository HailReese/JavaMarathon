package day13.Task1;

public class Test {
	public static void main(String[] args) {
		User user1 = new User("user1");
		User user2 = new User("user2");
		User user3 = new User("user3");

		user1.sendMessage(user2, "Hello");
		user1.sendMessage(user2, "How r u?");
		user2.sendMessage(user1, "Hi");
		user2.sendMessage(user1, "I'm fine");
		user2.sendMessage(user1, "Thx");
		user3.sendMessage(user1, "What's up");
		user3.sendMessage(user1, "What's new");
		user3.sendMessage(user1, "How r things");
		user1.sendMessage(user3, "Sup dude");
		user1.sendMessage(user3, "Good");
		user1.sendMessage(user3, "What b u");
		user3.sendMessage(user1, "I'm ok");

		MessageDatabase.showDialog(user1, user3);
	}
}
