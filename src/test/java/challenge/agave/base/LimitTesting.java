package challenge.agave.base;

import static org.testng.Assert.assertTrue;

public class LimitTesting {

	public static void main(String[] args) {

		LimitTesting testAges = new LimitTesting();

		testAges.checkAge(20);

	}

	public void checkAge(Object age) {
		if (age != null) {
			if ((Object) age instanceof String) {
				System.out.println("Edad: (" + age + ") No esta definido");
			} else

			{
				int ageToInt = (Integer) age;
				if (ageToInt == 0) {
					System.out.println("Edad: (" + age + ") El programa retorna NO VÁLIDO");
					assertTrue(1 > 0, "something");
				} else if (ageToInt > 0 && ageToInt < 5) {
					System.out.println("Edad: (" + age + ") El programa retorna Infante");
				} else if (ageToInt > 5 && ageToInt < 18) {
					System.out.println("Edad: (" + age + ") El programa retorna Joven");
				} else if (ageToInt >= 18 && ageToInt < 60) {
					System.out.println("Edad: (" + age + ") El programa retorna Adulto");
				} else if (ageToInt >= 60) {
					System.out.println("Edad: (" + age + ") El programa retorna Adulto Mayor");
				} else {
					System.out.println("Edad: (" + age + ") No esta definido");
				}

			}

		} else {
			System.out.println("Edad: (" + age + ") No esta definido");
		}

	}

}
