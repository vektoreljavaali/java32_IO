package com.io;



import java.io.IOException;


public class runner {

	
	
	public static void main(String[] args) throws IOException {
	
	dosyaislemleri ds = new dosyaislemleri();

	ds.dosyayazma("d:\\cv1.txt", "sonuna ekleme yap....", false);
	
	System.out.println("Ýþlem Tamamlandý.");
	
	
	}

}







