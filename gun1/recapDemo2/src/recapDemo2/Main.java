package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2, 4.5, 9.1, 2.0};
		double total = 0;
		double max = myList[0];
		
		for(double number : myList) {
			if (max<number) {
				max = number;
			}
			
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println(total);
		System.out.println(max);
	}

}
