package abstractClasses;

public class Main {

	public static void main(String[] args) {
		GameCalculator[] gameCalculators = new GameCalculator[] {
			new KidsGameCalculator()	
		};
		
		for(GameCalculator gameCalculator : gameCalculators) {
			gameCalculator.hesapla();
		}

	}

}
