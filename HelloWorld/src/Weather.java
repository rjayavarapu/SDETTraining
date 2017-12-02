
public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp = 20;
		String sunCondition="Sunny";

		if ((temp > 80) ||  (sunCondition.equals("Sunny"))){
			System.out.println("It is pleasant");
		} else if ((temp > 60) && sunCondition.equals("Sunny")) {
			System.out.println("It is cold");

		} else {
			System.out.println("It is freezy");

		}

	}

}
