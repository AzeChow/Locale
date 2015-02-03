package demo01;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {

		Class pcls = Class.forName("demo01.Person");

		Class c2 = Person.class;

		Person person3 = new Person();

		Person person;

		Person person2;

		try {
			person = (Person) pcls.newInstance();

			person2 = (Person) c2.newInstance();

			BeanUtils.setProperty(person3, "name", "Raz");

			System.out.println(" ===============================");

			System.out.println(BeanUtils.getProperty(person3, "name"));

			System.out.println(person3.getName());

			System.out.println(" =========================");

			BeanUtils.setProperty(person2, "name", "Hellen");

			System.out.println(BeanUtils.getProperty(person2, "name"));

			System.out.println(" -----------------------------  ");

			BeanUtils.setProperty(person, "name", "ablaze");

			String name = BeanUtils.getProperty(person, "name");

			System.out.println(name);

		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main2(String[] args) {

		Person p = new Person();

		ConvertUtils.register(new DateLocaleConverter(), Date.class);

		try {
			BeanUtils.setProperty(p, "birth", "1985-01-04");

			try {
				System.out.println(BeanUtils.getProperty(p, "birth"));
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main4(String[] args) {

		Person p = new Person();

		ConvertUtils.register(new Converter() {

			@Override
			public <T> T convert(Class<T> type, Object value) {

				if (value == null) {

					return null;

				}

				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

				Date dt = null;

				try {
					dt = sdf.parse((String) value);

				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return (T) dt;
			}

		}, Date.class);

		try {
			BeanUtils.setProperty(p, "birth", "198501");

			try {
				System.out.println(BeanUtils.getProperty(p, "birth"));
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
