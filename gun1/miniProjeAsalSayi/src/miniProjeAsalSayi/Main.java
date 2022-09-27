package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 0;
		boolean isPrime = true;;
		
		for(int i = 2; i<number; i++) {
			
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		if(isPrime==true) {
			System.out.println("Sayı  asaldır");
		}if (isPrime==false) {
			System.out.println("Sayı asal değildir");
		}
		
		
	}

}
