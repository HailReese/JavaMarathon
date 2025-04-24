package day13.Task1;

import java.util.ArrayList;
import java.util.List;

public class User {

	public User(String name) {
		this.name = name;
		subscriptions = new ArrayList<>();
	}

	private String name;
	List<User> subscriptions;

	public String getName() {
		return name;
	}

	public List<User> getSubscriptions() {
		return subscriptions;
	}

	public void subscribe(User user) {
		subscriptions.add(user);
	}

	public boolean isSubscribed(User user) {
		return subscriptions.contains(user);
	}

	public boolean isFriend(User user) {
		return subscriptions.contains(user) && user.isSubscribed(this);
	}

	public void sendMessage(User user, String text) {
		MessageDatabase.sendMessage(this, user, text);
	}

	public String toString() {
		return name;
	}
}
