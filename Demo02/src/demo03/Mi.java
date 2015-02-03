package demo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mi {

	public static void main(String[] args) {

		final JFrame frame = new JFrame("xyz");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 390);

		frame.setVisible(true);

		JButton btn = new JButton("click");

		frame.add(btn);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				Person[] ps = new Person[2];

				ps[0] = new Person("1", 11);

				ps[1] = new Person("2", 22);

				Object obj = JOptionPane.showInputDialog(frame, "Hello world!",
						"Title", JOptionPane.PLAIN_MESSAGE, null, ps, ps[0]);

				Object obj2 = JOptionPane.showInputDialog(frame,
						"Hello world!", "");

				if (obj == null) {

					return;

				}

				System.out.println("-=-=-=-=-=-=-=--=");

				System.out.println(obj);

			}
		});

	}
}

class Person {

	private String name;

	private int age;

	public Person() {

	}

	public Person(String _name, int _age) {

		name = _name;

		age = _age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
