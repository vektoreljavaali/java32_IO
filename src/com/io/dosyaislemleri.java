package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dosyaislemleri {

	public String[] dosyaokuma(String dosyayolu) {
	   	File fl = new File(dosyayolu);
		Scanner sc;
		String[] okunan=null;
		try {
			sc = new Scanner(fl);
			int uzunluk=0;
			while(sc.hasNextLine()) {
				uzunluk++;
				sc.nextLine();				
			}
			sc.close();
			okunan = new String[uzunluk];			
			int i=0;
			sc = new Scanner(fl);
			while(sc.hasNextLine()) {
			okunan[i]=sc.nextLine(); 
			i++;
		}
		sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return okunan;
	}// dosyaokuma method sonu
	
	public void dosyayazma(String dosyayolu,String icerik,boolean ekle) {
		File fl = new File(dosyayolu);
		BufferedWriter bf;
		try {
			bf = new BufferedWriter(new FileWriter(fl, ekle));
			bf.write(icerik);
			bf.newLine();
			bf.close();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
	}
	
	
	public void oku(String dosya) {
		
		File fl = new File(dosya);
		Scanner sc;
		String[] okunan=null;
		try {
			sc = new Scanner(fl);
			int uzunluk=0;
			while(sc.hasNextLine()) {
					dosyaokuma(sc.nextLine());		
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//oku sonu
}
