package demo01;

import java.util.Date;
import java.util.List;

public class Person {

	private String name;

	private Date birth;

	private Card card;

	private List<String> family;

	public List<String> getFamily() {
		return family;
	}

	public void setFamily(List<String> family) {
		this.family = family;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
