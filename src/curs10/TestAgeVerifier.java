package curs10;

public class TestAgeVerifier {

	public static void main(String[] args) {

		AgeVerifier obj = new AgeVerifier();
		try {
			obj.checkAgeLimit(6);
		}catch (InvalidAgeException e) {
			e.printStackTrace();
		}

	}

}
