package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = {1, 3, 5, 7, 9};
		int aranan = 6;
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi==aranan) {
				varMi = true;
			}
		}
		
		if(varMi) {
			System.out.println("Var");
		}else {
			System.out.println("Yok");
		}
	}

}
