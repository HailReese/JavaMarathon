package day13.Task1;

import java.util.Date;

public class Message {
	public Message(User sender, User receiver, String text) {
		this.sender = sender;
		this.receiver = receiver;
		this.text = text;
		date = new Date();
	}

	private User sender;
	private User receiver;
	private String text;
	private Date date;

	public User getSender() {
		return sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public String getText() {
		return text;
	}

	public Date getDate() {
		return date;
	}

	public String toString() {
		return String.format("FROM: '%s'\nTO: '%s'\nON: 's'\n'%s\n", sender.getName(), receiver.getName(),
				date.toString(), text);
	}
}
