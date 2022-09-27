package reCapDemo_Classes;

import java.util.Iterator;

public class DortIslem {
	
	public static int topla(int... sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam = toplam + sayi;
		}
		return toplam;
	
	}
	
	public static int cikar(int... sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam = (-toplam) - sayi;
		}
		
		return toplam;
	}
	
	public static int carp(int... sayilar) {
		 int toplam = 1;
		  for (int sayi : sayilar) {
		    toplam *= sayi;
		  }
		  return toplam;
	}
		
}
